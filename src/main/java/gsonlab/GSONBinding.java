package gsonlab;

import com.google.gson.Gson;

import java.util.Arrays;

/**
 * Created by mdb on 12/31/17.
 * https://www.tutorialspoint.com/gson/gson_data_binding.htm
 *
 * Primitives Data Binding :  Converts JSON to and from Java Maps,
 * Lists, Strings, Numbers, Booleans, and NULL objects
 *
 */
public class GSONBinding {
    public static void main(String args[]){
        Gson gson = new Gson() ;
        String name ="Mahesh Kumar";
        long rollNo = 1 ;
        boolean verified = false ;
        int[] marks = {100,90,85};
        //Serialization
        System.out.println("{");
        System.out.println("name: " + gson.toJson(name) +",");
        System.out.println("rollNo: " + gson.toJson(rollNo) +",");
        System.out.println("verified: " + gson.toJson(verified) +",");
        System.out.println("marks:" + gson.toJson(marks));
        System.out.println("}");
        //Derialization
        name = gson.fromJson("\"Mahesh Kumar\"", String.class);
        rollNo = gson.fromJson("1", Long.class);
        verified = gson.fromJson("false",Boolean.class);
        marks = gson.fromJson("[100,90,85]",int[].class);
        //To standard out
        System.out.println("name: " + name);
        System.out.println("rollNo: " + rollNo);
        System.out.println("verified: " +verified);
        System.out.println("marks:" + Arrays.toString(marks));



    }



}
