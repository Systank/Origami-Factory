package la.factory.origami.test;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.factory.origami.factory.model.Admin;
import la.factory.origami.factory.repository.IRepoAdmin;


public class TestAdmin {
	public static void main(String[] args)  {
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
	
	IRepoAdmin daoAdmin = context.getBean(IRepoAdmin.class);
	
	Admin charloulou = new Admin(); 
	charloulou.setUsername("Charloulou"); 
	charloulou.setPassword("loulou");
	
	daoAdmin.save(charloulou); 
	
	context.close();
}
}
