package gsonlab;
import DAOjava.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mdb on 12/30/17.
 */
public class DriverGson {
    static String jsonStr = null;
    static String filePath = "/Users/mdb/src10/lab/actors/jettylab/src/main/resources/student0";
    static String filePath1 = "/Users/mdb/src10/lab/actors/jettylab/src/main/resources/parser";
    ArrayList<String> arrayList = new ArrayList<String>() ;

    public static void main(String[] args) {
       String jsonstr=  readLineByLineJava8(filePath);
       String jsonstr1 = readLineByLineJava8(filePath1);
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        Student student = gson.fromJson(jsonstr,Student.class);
        
        System.out.println(student.getAge());

    }

    private static String readLineByLineJava8(String filePath) {
        StringBuilder strBuilder = new StringBuilder() ;
        File file = new File(filePath);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        try {

            while ((st = br.readLine()) != null)
                //System.out.println(st);
                strBuilder.append(st);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return strBuilder.toString() ;
    }



}
