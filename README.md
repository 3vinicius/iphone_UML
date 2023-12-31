## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

Repositorio do desafio  [https://github.com/digitalinnovationone/trilha-java-basico](https://github.com/digitalinnovationone/trilha-java-basico)


### Resolução

###### Diagrama UML

![UML](src/diagramaLight.drawio.png)


###### Implementação
```java
package challenge;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Adicionar músicas
        iphone.addMusic("Song 1");
        iphone.addMusic("Song 2");
        iphone.addMusic("Song 3");

        // Reproduzir música
        iphone.play();

        // Avançar para a próxima música
        iphone.nextMusic();

        // Pausar a música
        iphone.pauseMusic();

        // Fazer uma chamada
        iphone.call("123456789");

        // Adicionar um contato
        iphone.addPerson("987654321", "John Doe");

        // Adicionar à lista de favoritos
        iphone.addFavorites("987654321", "John Doe");

        // Navegar na internet
        iphone.searchLink("https://www.example.com");
        iphone.nextPage();
        iphone.previousPage();

        // Criar uma nova aba
        iphone.newAba();

        // Lidar com chamadas
        iphone.answerCall(true);
        iphone.onHold("987654321");

        // Remover música
        iphone.removeMusic("Song 2");

        // Reproduzir música novamente
        iphone.play();
    }
}


```


