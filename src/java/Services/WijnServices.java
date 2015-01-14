/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import DAL.HibernateUtil;
import DAL.Wijntbl;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Christel
 */
public class WijnServices {

    public static Wijntbl Save(Wijntbl wijn) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(wijn);
        session.getTransaction().commit();
        session.close();
        return wijn;
    }

    public static List<Wijntbl> GetAllWijnen() {
        System.out.println("begin GetAllWijnen");
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntbl");
        System.out.println("na query GetAllWijnen");
        return q.list();

    }

    public static List<Wijntbl> GetAllWijnen2(String qString) {
        System.out.println("begin GetAllWijnen2 " + qString);

        Session session
                = HibernateUtil.getSessionFactory().openSession();

        Query q = session.createQuery(qString);
        System.out.println("na query GetAllWijnen2 " + qString);
        return q.list();

    }

    public static void deleteWijn(int ID) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntbl wijn where wijn.id=" + ID);
        Wijntbl wijn = (Wijntbl) q.uniqueResult();
        session.beginTransaction();
        session.delete(wijn);
        session.getTransaction().commit();
    }

    public static Wijntbl getWijn(int ID) {
        Session session
                = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from Wijntbl wijn where wijn.id=" + ID);
        return (Wijntbl) q.uniqueResult();
    }
}
