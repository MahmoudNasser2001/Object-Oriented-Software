package c322.Homeworks.Homework6.PartA;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileID);
    ProfileIterator createCoworkersIterator(String profileID);
}