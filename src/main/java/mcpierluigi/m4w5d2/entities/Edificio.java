package mcpierluigi.m4w5d2.entities;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="edifici")
@Data
@NoArgsConstructor
public class Edificio {
	@Id	
	@GeneratedValue
	private UUID id;
	private String nome;
	private String indirizzo;
	
	@ManyToOne
	private Citta citta;
	
	public Edificio(String nome, String indirizzo, Citta citta) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
}
