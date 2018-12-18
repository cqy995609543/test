package cn.tedu.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
      @Test   
	public void testHelloSpring(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		//ac IOC容器，通过id获取对象
		HelloSpring hello = (HelloSpring) ac.getBean("hello");
		hello.helloSpring();
	}
}                                                
