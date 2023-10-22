package tn.esprit.applicationfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idchambre;

     Long Numerochambre;

    @Enumerated(EnumType.STRING)
     TypeChambre TypeC;

    @ToString.Exclude
    @OneToMany
     Set<Reservation> reservations;

    @ToString.Exclude
    @ManyToOne
    Bloc Bloc;
}
