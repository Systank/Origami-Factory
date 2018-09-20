package la.factory.origami.test;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.factory.origami.factory.model.Etape;
import la.factory.origami.factory.model.Niveau;
import la.factory.origami.factory.model.Origami;
import la.factory.origami.factory.repository.IRepoEtape;
import la.factory.origami.factory.repository.IRepoOrigami;


public class TestOrigami {
	public static void main(String[] args) throws ParseException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		
		IRepoOrigami daoOrigami = context.getBean(IRepoOrigami.class);
		IRepoEtape etapeRepo = context.getBean(IRepoEtape.class);

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
		
		Etape etape1 = new Etape();
		etape1.setNumeroEtape(1);
		etape1.setDescription("Quelle fantastique réalisation que vous êtes sur le point de réaliser");
		etape1.setImageEtape("http://www.popstickers.fr/4637-large_default/homer-hourra-des-simpsons.jpg");
		etape1.setOrigami(cocotte);
		etapeRepo.save(etape1);
		
		context.close();
	}

}
