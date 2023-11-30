package com.ptn.mylibrary.di

import com.ptn.mylibrary.ProvidedSecondDependency
import com.ptn.mylibrary.SecondDependency
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SecondDependencyModule {

    @Provides
    fun providesSecondDependency(
        providedSecondDependency: ProvidedSecondDependency
    ): SecondDependency {
        return providedSecondDependency
    }
}
