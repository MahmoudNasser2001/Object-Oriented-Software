package c322.Homeworks.Homework6.PartA;

import java.util.ArrayList;
import java.util.List;
public class Facebook implements SocialNetwork {

    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friend");
    }

    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworker");
    }
}