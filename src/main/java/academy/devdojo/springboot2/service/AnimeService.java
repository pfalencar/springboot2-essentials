package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

//classe responsável pela regra de negócio, onde vamos fazer a lógica de negócios
@Service
public class AnimeService {
    //private final AnimeRepository animeRepository;

    //vc não vai colocar esse método na aplicação, senão todos os usuários poderão fazer a listagem do seu BD inteiro na aplicação
    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Hero"),new Anime(2L,"Bersek"));
    }
}
