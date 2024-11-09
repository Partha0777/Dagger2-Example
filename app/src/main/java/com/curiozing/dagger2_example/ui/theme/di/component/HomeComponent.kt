package com.curiozing.dagger2_example.ui.theme.di.component

import com.curiozing.dagger2_example.MainActivity
import com.curiozing.dagger2_example.ui.theme.di.module.HomeModule
import dagger.Component
import dagger.Module


@Component(modules = [HomeModule::class])
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}