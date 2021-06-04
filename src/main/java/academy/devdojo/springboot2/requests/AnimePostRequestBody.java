package academy.devdojo.springboot2.requests;

import lombok.Data;

//é uma classe DTO. Aqui eu faço diretamente o que eu faria se tivesse um DTO ou qlqr outro tipo de padrão.
//Desta forma vc está aumentando a coesão, apesar de que vai ter um monte de classes para cada um dos métodos
//que vc teria que ter no @RequestBody da classe AnimeController.
//Porém isso facilita a refatoração ou o compartilhamento como se fosse um contrato com outros serviços.

@Data
public class AnimePostRequestBody {
    //qdo vai salvar um anime, não se envia um id, pra por engano não salvar em cima de outro ou num id inexistente.
    //então, pra garantir que nenhum id será enviado:
    private String name;
}
