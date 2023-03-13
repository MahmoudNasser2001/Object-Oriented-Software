package c322.Homeworks.Homework6.PartA;

import java.util.ArrayList;
import java.util.List;
public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
    }

    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }
    public boolean hasMore() {
        lazyInit();
        return currentPosition < emails.size();
    }
}