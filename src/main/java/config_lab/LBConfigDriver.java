package config_lab;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.util.LinkedHashMap;
import java.util.Properties;

/**
 * Created by mdb on 1/15/18.
 */
public class LBConfigDriver {
    public static void main(String args[]){
        System.out.println("LBConfigDriver.main()");


        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
        map.put("parser","pfsense");
        map.put("mdtsdbUrl","mdtsdb-4.fractal");
        map.put("mdtsdbPort","8080");
        map.put("clAdmKey","ApkdHBJdvIfEPE");
        map.put("clAdmSecretKey","clAdmSecretKey");
        Properties properties  = new Properties() ;

        /*

        properties.put("parser","pfsense");
        properties.put("mdtsdbUrl","mdtsdb-4.fractal");
        properties.put("mdtsdbPort","8080");
        properties.put("clAdmKey","ApkdHBJdvIfEPE");
        properties.put("clAdmSecretKey","clAdmSecretKey");
        */

        //Config _config = ConfigFactory.parseProperties(properties);
        Config _config = null ;
        _config = ConfigFactory.parseMap(map);

        System.out.println(_config.toString());

        System.out.println(_config.getString("parser"));
        System.out.println(_config.getString("mdtsdbUrl"));
        System.out.println(_config.getString("mdtsdbPort"));

    }

}
