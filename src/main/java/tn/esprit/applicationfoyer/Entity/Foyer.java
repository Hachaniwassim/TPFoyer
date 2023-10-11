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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToOne(mappedBy = "Foyer")
    private Universite Universite;

    @OneToMany(mappedBy = "Foyer")
    private Set<Bloc> Bloc;


}
