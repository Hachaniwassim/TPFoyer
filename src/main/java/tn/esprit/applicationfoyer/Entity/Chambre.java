package tn.esprit.applicationfoyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idchambre;

    private Long Numerochambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;

    @OneToMany
    private Set<Reservation> Reservation;

    @ManyToOne
    Bloc Bloc;
}
