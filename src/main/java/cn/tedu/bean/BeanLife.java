package cn.tedu.bean;

public class BeanLife {
       public void init(){
    	   System.out.println("这是init方法");
       }
       public void doBean(){
    	   System.out.println("这是选c方法");
       }
       
       public void destroy(){
    	   System.out.println("这是destroy销毁");
       }
       
       
       
}
