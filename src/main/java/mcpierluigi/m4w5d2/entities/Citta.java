package mcpierluigi.m4w5d2.entities;

import lombok.*;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name="città")
@Data
@NoArgsConstructor
public class Citta {
	@Id
	@GeneratedValue
	private UUID id;
	private String nomeCitta;
	
	public Citta(String nomeCitta) {
		super();
		this.nomeCitta = nomeCitta;
	}
}
