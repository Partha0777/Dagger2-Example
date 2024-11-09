package com.curiozing.dagger2_example.ui.theme.data


class HomeRepository(private val apiService: APIService){
    fun apiCall(){
        apiService.callHomeApi()
    }
}