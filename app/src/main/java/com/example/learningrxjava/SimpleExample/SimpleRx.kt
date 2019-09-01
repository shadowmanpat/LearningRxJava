package com.example.learningrxjava.SimpleExample

import com.jakewharton.rxrelay2.BehaviorRelay
import io.reactivex.disposables.CompositeDisposable

object SimpleRx {

    var bag = CompositeDisposable()

    fun simpleValues(){
        println("--------SimpleValues")

        val someInfo = BehaviorRelay.createDefault("1")
        print("${someInfo.value}")

        someInfo.accept("2")

        someInfo.subscribe(){newValue->
            println( "newValue $newValue")
        }

        someInfo.accept("3")
    }

}