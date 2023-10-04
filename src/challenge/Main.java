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

