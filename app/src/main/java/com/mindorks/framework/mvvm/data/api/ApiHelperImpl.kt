package com.mindorks.framework.mvvm.data.api

import com.mindorks.framework.mvvm.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl : ApiHelper {

    lateinit var apiService: ApiService

    @Inject
    constructor(apiService: ApiService) {
        this.apiService = apiService;
    }

    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}