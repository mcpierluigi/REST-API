package mcpierluigi.m4w5d2.entities;

import java.util.UUID;

import enums.tipoPostazione;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="postazioni")
@Data
@NoArgsConstructor
public class Postazione {
	@Id
	@GeneratedValue
	private UUID id;
	private String descrizione;
	private boolean disponibilita;
	
	@ManyToOne
	private Edificio edificio;
	
	@Enumerated(EnumType.STRING)
	private tipoPostazione tipo;
	
	public Postazione(String descrizione, boolean disponibilita, tipoPostazione tipo, Edificio edificio) {
		super();
		this.descrizione = descrizione;
		this.disponibilita = disponibilita;
		this.tipo = tipo;
		this.edificio = edificio;
	}
}
