package mcpierluigi.m4w5d2.services;

import mcpierluigi.m4w5d2.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mcpierluigi.m4w5d2.entities.Citta;

@Service
public class CittaService {
	@Autowired
	private CittaRepository cittaRepo;
	
	public Citta create(Citta c) {
		Citta newCitta = new Citta (c.getNomeCitta());
		return cittaRepo.save(newCitta);
	}
}
