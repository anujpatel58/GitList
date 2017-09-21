package bharat.viznu.gitlist.network;

import java.util.List;

import bharat.viznu.gitlist.model.Repository;
import bharat.viznu.gitlist.util.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    @GET(Constants.repos)
    Call<List<Repository>> getRepositories(@Query("page") int page, @Query("per_page") int perPage);
}
