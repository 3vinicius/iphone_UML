package challenge;

public interface MusicPlay {


    void SelectMusic(String nameMusic);

    public void play();
    public void pauseMusic();
    public void nextMusic();
    public void previousMusic();
    public void volumeMusic();


    void addMusic(String name);

    void removeMusic(String name);
}
