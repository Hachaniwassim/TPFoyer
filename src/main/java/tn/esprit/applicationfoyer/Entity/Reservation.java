package tn.esprit.applicationfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
     String idReservation;
     Date anneeUniversitaire;
     boolean estValide;

    @ToString.Exclude
    @ManyToMany
     Set<Etudiant> etudiant;
}
