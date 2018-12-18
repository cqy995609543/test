package cn.tedu.bean;

import java.util.Calendar;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.dao.UserDao;
import cn.tedu.dao.UserDaoImpl;
    
public class LoginTest {
	 @Test
       public void TestLogin(){
    	   ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
    	   UserDao lg = (UserDaoImpl)ac.getBean("login",UserDaoImpl.class);
    	   Calendar cd = ac.getBean("factory",Calendar.class );
    	   lg.login();
    	   Calendar cd1 =cd.getInstance();
    	   System.out.println(cd.getTime());
    	   
    	  
    	   Calendar cda = ac.getBean("c",Calendar.class);
    	   
    	   System.out.println(cda.getTime());
       }
	 
	  @Test
      public void testBeanLife(){
   	    ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
   	    BeanLife bf =  ac.getBean("beanlife",BeanLife.class);
   	    bf.doBean();
      } 
	 
}
