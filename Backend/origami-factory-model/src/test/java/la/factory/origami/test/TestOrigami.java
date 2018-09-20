package la.factory.origami.test;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.factory.origami.factory.model.Niveau;
import la.factory.origami.factory.model.Origami;
import la.factory.origami.factory.repository.IRepoOrigami;


public class TestOrigami {
	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		
		IRepoOrigami daoOrigami = context.getBean(IRepoOrigami.class);

		Origami cocotte = new Origami();
		cocotte.setActif(true);
		cocotte.setImageOri("www.google.com");
		cocotte.setNbFeuille(1);
		cocotte.setNiveau(Niveau.Niv1);
		cocotte.setNom("Cocotte en papier");
		cocotte.setNote((float) 4.5);
		cocotte.setTempsRea("20 mn");
		cocotte.setYoutube("www.youtube.com");
		daoOrigami.save(cocotte);
		
		
		
		context.close();
		
		
	}

}
