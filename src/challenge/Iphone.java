package challenge;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Phone,MusicPlay,InternetBrowser {
    private List<PersonNumber> listOfNumbers = new ArrayList<>();
    private List<String> favoritesNumbers = new ArrayList<>();
    private  List<String> listMusic = new ArrayList<>();

    int music = 0;

    @Override
    public void searchLink(String link) {
        System.out.println("search link"+link);
    }

    @Override
    public void nextPage() {
        System.out.println("next page");
    }

    @Override
    public void previousPage() {
        System.out.println("Previous page");
    }

    @Override
    public void newAba() {
        System.out.println("Create new aba");
    }

    @Override
    public void SelectMusic(String nameMusic) {
        System.out.println("Play" + nameMusic);
    }

    @Override
    public void play() {
        System.out.println("play music: " + listMusic.get(music));

    }

    @Override
    public void pauseMusic() {
        System.out.println("music paused");
    }

    @Override
    public void nextMusic() {
        System.out.println("play music: " + listMusic.get(music+1));
    }

    @Override
    public void previousMusic() {
        System.out.println("play music: " + listMusic.get(music-1));
    }

    @Override
    public void volumeMusic() {
        System.out.println("Volume is 100%");
    }

    @Override
    public void addMusic(String name) {
        listMusic.add(name);
    }

    @Override
    public void removeMusic(String name) {
        listMusic.remove(name);
    }


    @Override
    public void call(String number) {
        System.out.println("Call "+number);
    }

    @Override
    public void answerCall(boolean answerCall) {
        if (answerCall){
            System.out.println("Answer call");
        }
        System.out.println("Not Answer call");
    }

    @Override
    public void onHold(String number) {
        System.out.println(number+ "On Hold");
    }

    @Override
    public void addPerson(String number, String name) {
        listOfNumbers.add(new PersonNumber(number,name));
    }

    @Override
    public void addFavorites(String number, String name) {
        listOfNumbers.remove(new PersonNumber(number,name));
    }

    public static void main(String[] args) {

    }
}
