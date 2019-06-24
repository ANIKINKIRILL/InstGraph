package com.anikinkirill.instgraph.network;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Class is responsible to the Authentication processes
 * Get authenticated user data
 */

public interface AuthApi {

    @GET("v1/users/self/")
    Flowable<ResponseBody> getAuthUserData(@Query("access_token") String access_token);

}
