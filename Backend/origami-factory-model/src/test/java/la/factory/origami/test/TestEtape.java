package la.factory.origami.test;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEtape {
	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
	}

}
