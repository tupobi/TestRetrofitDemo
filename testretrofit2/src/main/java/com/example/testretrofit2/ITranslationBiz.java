package com.example.testretrofit2;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2018/3/18/018.
 */

public interface ITranslationBiz {

//    官网教程，看了看发现比较简单了，写总结 done？ == false
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId);
//
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @Query("sort") String sort);
//
//    @GET("group/{id}/users")
//    Call<List<User>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);

    /**
     * http://route.showapi.com/32-9?showapi_appid=49313&showapi_sign=32a7e0554a89420b9654e71f718a56c8&q=hello
     * http://route.showapi.com/
     *
     * @return
     * @GET中所填写的value和baseUrl组成完整的路径
     */
    @GET("{path}")
    Call<Translation> getTranslation(@Path("path") String path,
                                     @Query("appkey") String appkey,
                                     @Query("chengyu") String chengyu);

    @GET("{path}")
    Call<Translation> getTranslationByQueryMap(@Path("path") String path,
                                               @QueryMap Map<String, String> queryOptions);

    @GET("{path}")
    Call<Translation> getTranslationByPost(@Path("path") String path,
                                               @QueryMap Map<String, String> queryOptions);
}
