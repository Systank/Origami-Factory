//package la.factory.origami.test;
//
//import java.text.ParseException;
//
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import la.factory.origami.factory.model.Etape;
//import la.factory.origami.factory.repository.IRepoEtape;
//
//public class TestEtape {
//	public static void main(String[] args) throws ParseException {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
//		
//		IRepoEtape etapeRepo = context.getBean(IRepoEtape.class);
//		
//		Etape etape1 = new Etape();
//		etape1.setNumeroEtape(1);
//		etape1.setDescription("Quelle fantastique réalisation que vous êtes sur le point de réaliser");
//		etape1.setImageEtape("http://www.popstickers.fr/4637-large_default/homer-hourra-des-simpsons.jpg");
//		etapeRepo.save(etape1);
//	
//		context.close();
//	}
//
//}
