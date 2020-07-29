package com.example.junitsamples

open class MyDatabase {

    open fun getUsers():List<String>{
        return listOf()
    }

    open fun getUserById(userId:Int):String{
        return ""
    }

    open fun getIdByUser(user:User) : Int{
        return 0
    }
}