package utils;

import entities.City;
import entities.Weather;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtils {
    private static SessionFactory DB_SESSION=null;
     public static SessionFactory getDbSession(){
        if(DB_SESSION==null){
            DB_SESSION=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
                    .addAnnotatedClass(Weather.class).buildSessionFactory();
        }
        return DB_SESSION;
    }
}
