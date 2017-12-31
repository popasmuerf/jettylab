package DAO

/**
 * Created by mdb on 12/30/17.
 */


class Book{
    private var author:String =""
    private var title:String = ""
    private var isbn_10:String = ""
    private var isbn_13:String = ""

    fun printMe(){
        println("author: " + author)
        println("title:" + title)
        println("isbn_10:" + isbn_10 )
        println("isbn_13" + isbn_13)
    }

    override fun toString():String{
        val bookStr:String = ",author: " + author + ",title:" + title + "isbn_10:" + isbn_10 + " isbn_13:" + isbn_13
        return bookStr

    }
}
