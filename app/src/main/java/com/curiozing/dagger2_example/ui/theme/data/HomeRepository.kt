package com.curiozing.dagger2_example.ui.theme.data

import javax.inject.Inject

class HomeRepository(private val apiService: APIService){
    fun apiCall(){
        apiService.callHomeApi()
    }
}