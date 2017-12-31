package DAO

/**
 * Created by mdb on 12/30/17.
 */
class Person(val firstName:String, var age:Int ){
    //class body
    constructor(name : String , age :Int ,message :String):this(name,age){

    }
    override fun toString()= "${firstName}, ${age}"
}

