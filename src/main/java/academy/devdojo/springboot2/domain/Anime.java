package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//domínio representa o que temos do BD.

@Data //gera getters, setters, equals, hashCode e toString
@AllArgsConstructor //gera um construtor com todos esses atributos
@NoArgsConstructor
@Entity //solicita um construtor sem argumentos, por isso coloco o @NoArgsConstructor. É do padrão JPA.
@Builder
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
