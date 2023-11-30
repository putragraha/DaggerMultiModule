package com.ptn.mylibrary

import dagger.Component

@Component
interface SomeLibComponent {

    fun inject(someLib: SomeLib)

    fun firstDependency(firstDependency: FirstDependency)
}
