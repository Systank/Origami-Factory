package la.factory.origami.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import la.factory.origami.factory.model.Categorie;
import la.factory.origami.factory.repository.IRepoCategorie;


public class TestCategorie {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		IRepoCategorie daoCategorie = context.getBean(IRepoCategorie.class);

		Categorie animaux = new Categorie();
		animaux.setNom("Animaux");
		
		Categorie dragons = new Categorie(); 
		dragons.setNom("Dragons");
		
		Categorie pokemons = new Categorie(); 
		pokemons.setNom("Pokemons");
		
		daoCategorie.save(animaux); 
		daoCategorie.save(dragons); 
		daoCategorie.save(pokemons);

		
		context.close();



	}

}
