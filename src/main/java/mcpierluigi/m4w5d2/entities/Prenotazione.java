package mcpierluigi.m4w5d2.entities;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Table(name = "prenotazioni")
@Data
@NoArgsConstructor
public class Prenotazione {
	@Id
	@GeneratedValue
	private UUID id;
	private LocalDate dataPrenotata;
	private LocalDate dataPrenotazione;
	
	@ManyToOne
	@NonNull
	private Postazione postazione;
	
	@ManyToOne
	@NonNull
	private Utente utente;
	
	public Prenotazione(LocalDate dataPrenotata, LocalDate dataPrenotazione, Postazione postazione, Utente utente) {
		super();
		this.dataPrenotata = dataPrenotata;
		this.dataPrenotazione = dataPrenotazione;
		this.postazione = postazione;
		this.utente = utente;
	}
}
