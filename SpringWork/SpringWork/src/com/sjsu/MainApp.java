package com.sjsu;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("com/sjsu/Beans.xml");
		
		QueryDao qd=(QueryDao)ac.getBean("dao");
		Employee e = new Employee();
		e.setId(11);
		e.setName("Harry");
		e.setAddress("Jammu");
		qd.delete(e);
		//hw.print();

	}

}
