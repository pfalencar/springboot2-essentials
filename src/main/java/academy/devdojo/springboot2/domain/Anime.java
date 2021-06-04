package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //gera getters, setters, equals, hashCode e toString
@AllArgsConstructor //gera um construtor com todos esses atributos
//domínio representa o que temos do BD.
public class Anime {
    private Long id;
    private String name;

}
