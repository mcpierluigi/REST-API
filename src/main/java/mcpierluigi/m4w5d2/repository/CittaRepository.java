package mcpierluigi.m4w5d2.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mcpierluigi.m4w5d2.entities.Citta;

@Repository
public interface CittaRepository extends JpaRepository<Citta, UUID> {
	
}
