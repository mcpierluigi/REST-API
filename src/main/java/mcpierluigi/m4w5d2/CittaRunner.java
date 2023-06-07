package mcpierluigi.m4w5d2;

import java.util.Locale;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mcpierluigi.m4w5d2.services.CittaService;
import mcpierluigi.m4w5d2.entities.*;
@Component
public class CittaRunner implements CommandLineRunner {
	
	@Autowired
	CittaService cittaService;
	
	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("it"));
		
		for (int i = 0; i < 10; i++) {
			try {
				String name = faker.name().name();
				Citta citta = new Citta(name);
				cittaService.create(citta);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}
