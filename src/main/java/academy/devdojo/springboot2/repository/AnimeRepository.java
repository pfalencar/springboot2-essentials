package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//esta classe vai representar o BD (vai ser uma interface depois)
//aqui é a conexão diretamente com o BD (todas as queries vai ficar dentro desta interface=CRUD)
public interface AnimeRepository extends JpaRepository <Anime, Long>{ //tipo do id=Long

}
