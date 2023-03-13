package c322.Homeworks.Homework6.PartD;

import java.util.ArrayList;

public interface ThirdPartyYoutubeLib {
    public ArrayList<String> listVideos();
    public String getVideoInfo(String id);
    public void downloadVideo(String id);
}