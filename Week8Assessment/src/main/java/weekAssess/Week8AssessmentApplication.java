package weekAssess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import weekAssess.beans.House;
import weekAssess.controller.BeanConfiguration;
import weekAssess.repository.HouseRepository;

@SpringBootApplication
public class Week8AssessmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8AssessmentApplication.class, args);
	}
	
	@Autowired
	HouseRepository repo;
	
	ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

	House h = appContext.getBean("house", House.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House a = new House("321 East St", "Green", 123456);
		repo.save(a);
		
		List<House> allMyHouses = repo.findAll();
		for(House houses: allMyHouses) {
			System.out.println(houses.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
		
	}

}
