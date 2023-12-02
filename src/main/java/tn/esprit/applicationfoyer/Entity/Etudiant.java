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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idEtudiant;
     String nomEt;
     String prenomEt;
     Long cin;
     String ecole;
     Date dateNaissance;

    @ToString.Exclude
    @ManyToMany(mappedBy = "etudiant")
     Set<Reservation> reservation;
}
