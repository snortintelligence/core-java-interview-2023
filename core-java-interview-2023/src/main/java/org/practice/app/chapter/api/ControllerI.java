package org.practice.app.chapter.api;

public interface ControllerI {
    public String getPosts(String apiUrl);
    public String createNewPost(String apiUrl, Object payload);
    public String updateNewPost(String apiUrl, Object payload);

}
