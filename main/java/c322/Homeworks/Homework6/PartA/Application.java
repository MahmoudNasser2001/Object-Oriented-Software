package c322.Homeworks.Homework6.PartA;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private SocialNetwork network;
    private SocialSpammer spammer;

    public Application(SocialNetwork network,SocialSpammer spammer )
    {
        this.network = network;
        this.spammer = spammer;
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(profile.getName(), "spam");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(profile.getName(), "spam");
    }

    public static void main(String[] args)
    {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("My name", "Date"));
        profiles.add(new Profile("My name1", "Date1"));
        profiles.add(new Profile("My name2", "Date2"));
        profiles.add(new Profile("My name3", "Date3"));
        SocialNetwork n = new Facebook(profiles);
        SocialSpammer s = new SocialSpammer(n);
        Application a = new Application(n,s);
        s.send("fakeEmail", "spam message");

    }
}