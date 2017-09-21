package bharat.viznu.gitlist.network;

import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;
import java.util.concurrent.TimeUnit;

import bharat.viznu.gitlist.util.Constants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppRetrofit {
    private static AppRetrofit mInstance;
    ApiServices apiServices;

    private AppRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(120000, TimeUnit.SECONDS).readTimeout(120000, TimeUnit.SECONDS).writeTimeout(120000, TimeUnit.SECONDS).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.url).client(client).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC).create())).build();
        apiServices = retrofit.create(ApiServices.class);
    }

    public static synchronized AppRetrofit getInstance() {
        if (mInstance == null)
            mInstance = new AppRetrofit();
        return mInstance;
    }

    public ApiServices getApiServices() {
        return apiServices;
    }

    public enum REQUEST_TYPE {
    }
}
