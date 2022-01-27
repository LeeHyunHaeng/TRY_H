package com.yjk.sample._1_finalmission.datamodule;

//URL로 부터 가지고 온 데이터를 객체화 시켜서 리사이클러뷰에 넣어주기 위한 클래스입니다.

public class SearchData {
    String videoId;
    String title;
    String ImageUrl;
//    String ViewCount;
//    String ChannelId;

    public SearchData(String videoId, String title, String ImageUrl) {
        this.videoId = videoId;
        this.title = title;
        this.ImageUrl = ImageUrl;
//        this.ViewCount = viewCount;
//        this.ChannelId = channelId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.ImageUrl = imageUrl;
    }

//    public String getViewCount() {
//        return ViewCount;
//    }
//
//    public void setViewCount(String viewCount){
//        this.ViewCount = viewCount;
//    }
//
//    public String getChannelId() {
//        return ChannelId;
//    }
//
//    public void setChannelId(String channelId){
//        this.ChannelId = channelId;
//    }

}
