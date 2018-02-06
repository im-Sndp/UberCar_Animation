package myapplication.uberanimation;

import myapplication.uberanimation.Remote.IGoogleApi;
import myapplication.uberanimation.Remote.RetrofitClient;

/**
 * Created by pmuch on 04/02/2018.
 */

public class Common {
    public static final String baseURL ="https://googleapis.com";
    public static IGoogleApi getGoogleApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
