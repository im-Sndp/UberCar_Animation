package myapplication.uberanimation.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by pmuch on 04/02/2018.
 */

public interface IGoogleApi {
    @GET
    Call<String> getDataFromGoogleApi (@Url String url);
}
