package gsonlab;

import DAOjava.MethodReflection;
import DAOjava.Student;
import general.VariableReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by mdb on 12/31/17.
 */
public class DriverRefl {
    public static void main(String args[]){
      Class<?> _class =  null ;
      try{
          _class = Class.forName("gsonlab.Foo");
      }catch(Exception e){
        e.printStackTrace();
      }



      Foo foo0 = null ;
        Foo foo1 = null ;
        Foo foo2 = null ;
        Constructor<?> cons[] = _class.getConstructors();
      try{
           foo0 = (Foo) cons[0].newInstance();
           foo1 = (Foo) cons[1].newInstance("foo1");
           foo2 = (Foo) cons[1].newInstance("foo2");
        }catch(Exception e){
            e.printStackTrace();
        }

        //foo.print();
        foo1.print();
        foo2.print();
    }

}

class Foo{
    private String str ;
    public Foo(){};
    public Foo(String s){
        this.str = s ;
    }
    public void print(){
        System.out.println("abc");
    }
}
