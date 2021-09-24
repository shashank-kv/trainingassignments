package com.epsilon.bookorders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/bookorders/config.xml");
        
   	 	orders o1 = (orders)ctx.getBean("o1");
        
        System.out.println(o1);
    }
}
