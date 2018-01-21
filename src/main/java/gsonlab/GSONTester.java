package gsonlab;

import DAOjava.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Created by mdb on 12/31/17.
 */
public class GSONTester {
    public static void main(String args[]){
        GSONTester  tester  = new GSONTester();
        try{
            Student student = new Student();
            student.setAge(50);
            student.setName("Mahesh the Hession");
            tester.writeJSON(student);
            Student student1 = tester.readJSON();
            System.out.println(student1);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeJSON(Student student) throws IOException{
        GsonBuilder builder = new GsonBuilder() ;
        Gson gson =  builder.create() ;
        FileWriter writer = new FileWriter("student.json");
        writer.write(gson.toJson(student));
        writer.close();
    }
    private Student readJSON() throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder() ;
        Gson gson =  builder.create() ;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("student.json"));
        Student student  = gson.fromJson(bufferedReader,Student.class);
        return student ;
    }
}
