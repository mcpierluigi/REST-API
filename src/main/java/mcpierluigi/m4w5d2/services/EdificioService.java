package mcpierluigi.m4w5d2.services;
import mcpierluigi.m4w5d2.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mcpierluigi.m4w5d2.entities.Edificio;

@Service
public class EdificioService {
	@Autowired
	private EdificioRepository edificioRepo;
	
	public Edificio create(Edificio e) {
		Edificio newEdificio = new Edificio (e.getNome(), e.getIndirizzo(), e.getCitta());
		return edificioRepo.save(newEdificio);
	}
}
