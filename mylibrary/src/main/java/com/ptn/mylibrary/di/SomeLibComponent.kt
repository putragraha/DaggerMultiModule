package com.ptn.mylibrary.di

import com.ptn.mylibrary.FirstDependency
import com.ptn.mylibrary.SomeLib
import dagger.BindsInstance
import dagger.Component

/**
 * Source hilt: https://developer.android.com/training/dependency-injection/hilt-multi-module
 *
 * Builder might inject dependency with @BindsInstance if the arguments provided can be immediately provided
 * or Module if @Provides to dependencies is required
 */
@Component(modules = [SecondDependencyModule::class])
interface SomeLibComponent {

    fun inject(someLib: SomeLib)

    @Component.Builder
    interface Builder {

        fun firstDependency(@BindsInstance firstDependency: FirstDependency): Builder

        fun secondDependencyModule(secondDependencyModule: SecondDependencyModule): Builder

        fun build(): SomeLibComponent
    }
}
