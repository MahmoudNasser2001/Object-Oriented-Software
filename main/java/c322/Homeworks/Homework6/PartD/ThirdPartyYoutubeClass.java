package c322.Homeworks.Homework6.PartD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class ThirdPartyYouTubeClass implements ThirdPartyYoutubeLib{
    public final Map<String, String> apiCall = new HashMap<>(){{put("movie1","1999");
        put("movie2","2000");put("movie3","2012");}};

    @Override
    public ArrayList<String> listVideos() {
        return new ArrayList<>(apiCall.keySet());
    }

    @Override
    public String getVideoInfo(String id) {
        return apiCall.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        if(apiCall.containsKey(id))
            System.out.println("Downloading: " + id);
        else
            System.out.println("Movie does not exist");
    }
}