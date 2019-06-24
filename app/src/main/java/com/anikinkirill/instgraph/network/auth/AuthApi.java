package com.anikinkirill.instgraph.network.auth;

import com.anikinkirill.instgraph.models.User;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Class is responsible to the Authentication processes
 * Get authenticated user data
 */

public interface AuthApi {

    /**
     * Get authenticated user data as name, image, bio
     * @param access_token      access_token of current authenticated user
     * @return      json with user data which will be converted automatically using gson converter
     */

    @GET("v1/users/self/")
    Call<User> getAuthUserData(@Query("access_token") String access_token);

}
