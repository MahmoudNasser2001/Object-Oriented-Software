package c322.Homeworks.Homework6.PartA;

public class SocialSpammer {
    public SocialNetwork SNetwork;
    public ProfileIterator Piterator;

    public SocialSpammer(SocialNetwork network) {
        this.SNetwork = network;
    }
    public void send(String profileEmail, String message) {
        Piterator = SNetwork.createCoworkersIterator(profileEmail);
        System.out.println("sending a message");
        while (Piterator.hasMore()) {
            Profile profile = Piterator.getNext();
            send(profile.getName(), message);
        }
    }
}