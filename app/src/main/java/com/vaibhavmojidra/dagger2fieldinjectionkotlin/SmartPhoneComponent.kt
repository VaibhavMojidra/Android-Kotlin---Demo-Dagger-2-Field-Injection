package com.vaibhavmojidra.dagger2fieldinjectionkotlin

import dagger.Component

@Component
interface SmartPhoneComponent {
    fun inject(mainActivity: MainActivity)
}