package mcpierluigi.m4w5d2.entities;

import lombok.*;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "utenti")
@Data
@NoArgsConstructor
public class Utente {
	@Id
	@GeneratedValue
	private UUID id;
	private String name, surname, email;
	
	public Utente(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
}
