package hibernate;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
  
    
public class My_Main {
	private static SessionFactory factory;
public static void main(String[] args) {    
        
        
    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();        
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
   try {
	   factory = meta.getSessionFactoryBuilder().build();  
	   Session session = factory.openSession();  
	   Transaction t = session.beginTransaction();   
            
	   Employee e1=new Employee();    
	   e1.setId(101);    
	   e1.setName("Gaurav");    
	   e1.setSalary(50000);
	   
        
	   session.save(e1);  
	   t.commit();
	   System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
	   System.out.println("successfully saved");    
	   factory.close();  
	   session.close();
   }catch(Exception ex) {
	   ex.printStackTrace();
	   }
        
}    
}  