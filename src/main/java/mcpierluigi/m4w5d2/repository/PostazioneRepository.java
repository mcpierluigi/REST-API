package mcpierluigi.m4w5d2.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mcpierluigi.m4w5d2.entities.Postazione;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, UUID>{

}
