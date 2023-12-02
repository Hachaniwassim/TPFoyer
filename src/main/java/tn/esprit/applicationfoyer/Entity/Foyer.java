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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idfoyer;

     String nomFoyer;

     Long capaciteFoyer;

    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
     Universite Universite;

    @ToString.Exclude
    @OneToMany(mappedBy = "foyer")
     Set<Bloc> bloc;


}
