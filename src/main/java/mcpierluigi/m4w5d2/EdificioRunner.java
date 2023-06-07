package mcpierluigi.m4w5d2;

import java.util.Locale;
import com.github.javafaker.Faker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mcpierluigi.m4w5d2.services.EdificioService;
import mcpierluigi.m4w5d2.entities.*;
@Component
public class EdificioRunner implements CommandLineRunner {
	@Autowired
	EdificioService edificioService;
	
	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("it"));
		
		for (int i = 0; i < 10; i++) {
			try {
				String name = faker.gameOfThrones().toString();
				String address = faker.address().toString();
				Citta citta = new Citta(faker.name().fullName());
				Edificio edificio = new Edificio(name, address, citta);
				edificioService.create(edificio);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
