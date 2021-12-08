package com.maven;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
       System.out.println("project started");
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory f=cfg.buildSessionFactory();
       
       Student s1=new Student();
       s1.setId(100);
       s1.setName("giri");
       s1.setCity("mysore");
       
       Session se=f.openSession();
       Transaction t=se.beginTransaction();
       
       se.save(s1);
       t.commit();
       se.close();
    }
}
