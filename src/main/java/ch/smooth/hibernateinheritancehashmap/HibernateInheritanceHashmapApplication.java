package ch.smooth.hibernateinheritancehashmap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class HibernateInheritanceHashmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceHashmapApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ElementRepository repo) {
		return (evt) -> {

			Map<String, Base> map1 = new HashMap<>();
			map1.put("foo-1" , new Foo());
			map1.put("bar-1" , new Bar());
			repo.save(new Element("element-1" , map1));
		};
	}
}
