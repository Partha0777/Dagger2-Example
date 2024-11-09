package com.curiozing.dagger2_example.ui.theme.di.module

import com.curiozing.dagger2_example.ui.theme.data.APIService
import com.curiozing.dagger2_example.ui.theme.data.HomeRepository
import dagger.Module
import dagger.Provides


@Module
class HomeModule {

    @Provides
    fun apiService():APIService = APIService()


    @Provides
    fun homeRepository():HomeRepository = HomeRepository(apiService())


}