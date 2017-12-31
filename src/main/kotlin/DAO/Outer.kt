package DAO

/**
 * Created by mdb on 12/30/17.
 */

class Outer{
    inner class Nested{
        fun foo() = "foo from Outer.Nested.foo()"
    }
}