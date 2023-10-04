package challenge;

public interface Phone {
    public void call(String number);
    public void answerCall(boolean answerCall);
    public void onHold(String number);
    public void addPerson(String number, String name);
    public void addFavorites(String number, String name);
}
