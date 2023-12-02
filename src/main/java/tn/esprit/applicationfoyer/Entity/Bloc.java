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
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idBloc;
     String nomBloc;
     Long capaciteBloc;

     @ToString.Exclude
    @OneToMany(mappedBy = "bloc")
     Set<Chambre> chambre;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    Foyer foyer;
}
