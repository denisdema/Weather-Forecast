package dao;

import entities.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CityDao extends BaseDao{

    public CityDao(){
        super();
    }

    public List<City>getCities(){
        Session session=sessionFactory.getCurrentSession();
        Transaction tr=null;
        List<City>cities=new ArrayList<>();

        try{
            tr=session.beginTransaction();
            List<City>citiesList=session.createQuery("from city").getResultList();
            tr.commit();
            return citiesList;
        }catch (Exception e){
            tr.rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return null;
    }


}
