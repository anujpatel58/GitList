package bharat.viznu.gitlist.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

import bharat.viznu.gitlist.R;
import bharat.viznu.gitlist.model.Repository;

public class RepoListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;
    private List<Repository> repositories;
    private Activity mActivity;
    private LayoutInflater inflater;

    public RepoListAdapter(List<Repository> repositories, Activity mActivity) {
        this.repositories = repositories;
        this.mActivity = mActivity;
        inflater = LayoutInflater.from(this.mActivity);
    }

    @Override
    public int getItemViewType(int position) {
        return repositories.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = inflater.inflate(R.layout.row_repository, parent, false);
            return new MyViewHolder(view);
        } else if (viewType == VIEW_TYPE_LOADING) {
            View view = inflater.inflate(R.layout.row_progress_bar, parent, false);
            return new LoadingViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            Repository repository = repositories.get(position);
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            myViewHolder.repoTitle.setText(repository.getName());
            myViewHolder.repoDesc.setText(repository.getDescription());
            if (repository.getLanguage() == null || repository.getLanguage().equals("")) {
                myViewHolder.codeIV.setVisibility(View.GONE);
                myViewHolder.repoCode.setVisibility(View.GONE);
            } else {
                myViewHolder.codeIV.setVisibility(View.VISIBLE);
                myViewHolder.repoCode.setVisibility(View.VISIBLE);
                myViewHolder.repoCode.setText(repository.getLanguage());
            }
            if (repository.getHasIssues()) {
                myViewHolder.bugIV.setVisibility(View.VISIBLE);
                myViewHolder.repoBug.setVisibility(View.VISIBLE);
                myViewHolder.repoBug.setText(String.valueOf(Integer.parseInt("0" + repository.getOpenIssuesCount())));
            } else {
                myViewHolder.bugIV.setVisibility(View.GONE);
                myViewHolder.repoBug.setVisibility(View.GONE);
            }
            myViewHolder.repoView.setText(String.valueOf(Integer.parseInt("0" + repository.getWatchersCount())));
        } else if (holder instanceof LoadingViewHolder) {
            LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
            loadingViewHolder.progressBar.setIndeterminate(true);
        }
    }

    @Override
    public int getItemCount() {
        return repositories == null ? 0 : repositories.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView repoTitle, repoDesc, repoCode, repoBug, repoView;
        private ImageView codeIV, bugIV, viewIV;

        public MyViewHolder(View view) {
            super(view);
            repoTitle = (TextView) view.findViewById(R.id.repo_title_tv);
            repoDesc = (TextView) view.findViewById(R.id.repo_description_tv);
            repoCode = (TextView) view.findViewById(R.id.repo_code_tv);
            repoBug = (TextView) view.findViewById(R.id.repo_bug_tv);
            repoView = (TextView) view.findViewById(R.id.repo_view_tv);
            codeIV = (ImageView) view.findViewById(R.id.code_iv);
            bugIV = (ImageView) view.findViewById(R.id.bug_iv);
            viewIV = (ImageView) view.findViewById(R.id.view_iv);
        }
    }

    private class LoadingViewHolder extends RecyclerView.ViewHolder {
        private ProgressBar progressBar;

        public LoadingViewHolder(View view) {
            super(view);
            progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        }
    }
}