package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//classe responsável pela regra de negócio, onde vamos fazer a lógica de negócios
@Service
public class AnimeService {
    private static List<Anime> animes;
    static {
        animes = new ArrayList<>(List.of(new Anime(1l, "DB2"), new Anime(2L, "Berserk")));
    }
    //private final AnimeRepository animeRepository;

    //vc não vai colocar esse método na aplicação, senão todos os usuários poderão fazer a listagem do seu BD inteiro na aplicação
    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3,100000));
        animes.add(anime);
        return anime;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }
}
