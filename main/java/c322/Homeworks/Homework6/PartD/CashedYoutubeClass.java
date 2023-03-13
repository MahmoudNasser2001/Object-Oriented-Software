package c322.Homeworks.Homework6.PartD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class CachedYouTubeClass implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib service;
    private ArrayList<String> listCache;
    private String videoCache;
    private Map<String,Integer> count;

    public CachedYouTubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
        this.listCache = null;
        this.count = new HashMap<>();
    }

    public ArrayList<String> listVideos() {
        return listCache;
    }

    public String getVideoInfo(String id) {
        videoCache = service.getVideoInfo(id);
        return videoCache;
    }

    public void downloadVideo(String id) {
        if (count.containsKey(id)) {
            count.put(id, count.get(id) + 1);
            if(count.get(id) > 3)
                System.out.println("Too many downloads -> library download movie");
            else
                service.downloadVideo(id);
        }
        else
            count.put(id, 1);
    }

}