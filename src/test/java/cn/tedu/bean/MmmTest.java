package cn.tedu.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MmmTest {
       @Test
       public void testHellomm(){
    	   ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
    	   HelloMM hm = (HelloMM) ac.getBean("hi");
    	   hm.hellomm();
       }
}
