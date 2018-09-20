package la.factory.origami.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.factory.origami.factory.model.Categorie;
import la.factory.origami.factory.model.Niveau;
import la.factory.origami.factory.model.Origami;
import la.factory.origami.factory.repository.IRepoCategorie;
import la.factory.origami.factory.repository.IRepoOrigami;


public class TestCategorie {

	public static void main(String[] args) {
		
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
		
		IRepoCategorie daoCategorie = context.getBean(IRepoCategorie.class);

		Categorie animaux = new Categorie();
		animaux.setNom("Animaux");
		daoCategorie.save(animaux); 
		
		Categorie dragons = new Categorie(); 
		dragons.setNom("Dragons");
		dragons.setSuperCat(animaux);
		daoCategorie.save(dragons);

		
		
		Categorie pokemons = new Categorie(); 
		pokemons.setNom("Pokemons");
		pokemons.setSuperCat(animaux);
		daoCategorie.save(pokemons);
		
		animaux.getOrigamis().add(cocotte);
		
		 
	

		
		context.close();



	}

}
