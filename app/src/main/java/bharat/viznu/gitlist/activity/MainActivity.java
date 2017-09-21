package bharat.viznu.gitlist.activity;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bharat.viznu.gitlist.ApplicationController;
import bharat.viznu.gitlist.R;
import bharat.viznu.gitlist.adapter.RepoListAdapter;
import bharat.viznu.gitlist.model.Repository;
import bharat.viznu.gitlist.network.AppRetrofit;
import bharat.viznu.gitlist.util.EndlessScrollListener;
import bharat.viznu.gitlist.util.Helper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    private static final int PERMISSIONS_REQUEST = 0x000011;
    private Activity mActivity = MainActivity.this;
    private String[] PERMISSIONS = {Manifest.permission.ACCESS_WIFI_STATE, Manifest.permission.CHANGE_WIFI_STATE, Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.INTERNET, Manifest.permission.CHANGE_NETWORK_STATE};
    private RecyclerView recyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private List<Repository> repositories;
    private LinearLayout linlaHeaderProgress;
    private int mPagination = 1;
    private boolean isLoading;
    EndlessScrollListener mEndlessScrollListener = new EndlessScrollListener() {
        @Override
        public void onLoadMore() {
            if (!isLoading)
                if (ApplicationController.getApplicationInstance().isNetworkConnected()) {
                    mPagination++;
                    loadList(false);
                    isLoading = true;
                } else {
                    Toast.makeText(mActivity, "No internet connection.", Toast.LENGTH_LONG).show();
                }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        linlaHeaderProgress = (LinearLayout) findViewById(R.id.linlaHeaderProgress);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        recyclerView = (RecyclerView) findViewById(R.id.product_lv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        repositories = new ArrayList<>();
        recyclerView.setAdapter(new RepoListAdapter(repositories, mActivity));
        ApplicationController.getApplicationInstance().setIsNetworkConnected(Helper.getNetworkState(mActivity));
        moveToNext();
    }

    public void moveToNext() {
        if (hasPermissions()) {
            loadList(true);
        }
    }

    private boolean hasPermissions(String... permissions) {
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && permissions != null) {
            for (String permission : permissions) {
                if (mActivity.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    private void getPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!hasPermissions(PERMISSIONS)) {
                mActivity.requestPermissions(PERMISSIONS, PERMISSIONS_REQUEST);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSIONS_REQUEST: {
                if (hasPermissions(PERMISSIONS)) {
                    moveToNext();
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (mActivity.shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_WIFI_STATE) || mActivity.shouldShowRequestPermissionRationale(Manifest.permission.CHANGE_WIFI_STATE) || mActivity.shouldShowRequestPermissionRationale(Manifest.permission.ACCESS_NETWORK_STATE) || mActivity.shouldShowRequestPermissionRationale(Manifest.permission.INTERNET) || mActivity.shouldShowRequestPermissionRationale(Manifest.permission.CHANGE_NETWORK_STATE)) {
                            AlertDialog mAlertDialog = new AlertDialog.Builder(mActivity).setMessage("We need few permissions to load.").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    getPermissions();
                                }
                            }).setNeutralButton("Cancel", null).setCancelable(false).create();
                            mAlertDialog.show();
                            mAlertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(mActivity.getResources().getColor(R.color.colorPrimary));
                        } else {
                            Toast.makeText(mActivity, "Permission denied.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        }
    }

    private void loadList(final boolean showProgressBar) {
        if (ApplicationController.getApplicationInstance().isNetworkConnected()) {
            if (showProgressBar) {
                linlaHeaderProgress.setVisibility(View.VISIBLE);
            } else {
                repositories.add(null);
                recyclerView.getAdapter().notifyItemInserted(repositories.size() - 1);
            }
            Call<List<Repository>> call = AppRetrofit.getInstance().getApiServices().getRepositories(mPagination, 15);
            call.enqueue(new Callback<List<Repository>>() {
                @Override
                public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                    List<Repository> repositoryList = response.body();
                    if (showProgressBar) {
                        linlaHeaderProgress.setVisibility(View.GONE);
                    } else {
                        repositories.remove(repositories.size() - 1);
                        recyclerView.getAdapter().notifyItemRemoved(repositories.size());
                    }
                    if (repositoryList != null) {
                        if (mPagination == 1) {
                            recyclerView.setOnScrollListener(mEndlessScrollListener);
                        }
                        repositories.addAll(repositoryList);
                        recyclerView.getAdapter().notifyDataSetChanged();
                    } else {
                        Toast.makeText(mActivity, "Some technical error.", Toast.LENGTH_LONG).show();
                    }
                    isLoading = false;
                }

                @Override
                public void onFailure(Call<List<Repository>> call, Throwable t) {
                    if (showProgressBar) {
                        linlaHeaderProgress.setVisibility(View.GONE);
                    } else {
                        repositories.remove(repositories.size() - 1);
                        recyclerView.getAdapter().notifyItemRemoved(repositories.size());
                    }
                    Toast.makeText(mActivity, "Some technical error.", Toast.LENGTH_LONG).show();
                    isLoading = false;
                }
            });
        } else {
            Toast.makeText(mActivity, "No internet connection.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onRefresh() {
        mSwipeRefreshLayout.setRefreshing(false);
        /*if (ApplicationController.getApplicationInstance().isNetworkConnected()) {
            if (!isLoading) {
                mPagination = 1;
                repositories.clear();
                try {
                    recyclerView.getAdapter().notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadList(true);
            }
        } else {
            Toast.makeText(mActivity, "No internet connection.", Toast.LENGTH_LONG).show();
        }*/
    }
}