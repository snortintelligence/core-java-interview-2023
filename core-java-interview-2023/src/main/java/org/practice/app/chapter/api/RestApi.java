package org.practice.app.chapter.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.practice.app.chapter.collections.list.Person;

import java.util.HashMap;
import java.util.Map;

public class RestApi{
    public static void main(String[] args) throws ParseException {
        ControllerImpl controller = new ControllerImpl();
        String response = controller.getPosts("https://jsonplaceholder.typicode.com/posts");

        JSONArray postArr = HttpResponseUtil.convertHttpResponseToJSONArray(response);
        Map<Post, Integer> posts = new HashMap<>();
        int count=0;
        for (Object post : postArr){
            JSONObject object = (JSONObject) post;
            posts.put(new Post( Integer.parseInt(object.get("id").toString()) , object.get("title").toString(), object.get("body").toString()) , count++ );
        }
//        System.out.println(posts);

        response = controller.getPosts("https://jsonplaceholder.typicode.com/posts/1");
//        System.out.println(response);
        JSONObject jsonObject = HttpResponseUtil.convertHttpResponseToJSONObject(response);
        Post post = new Post( Integer.parseInt(jsonObject.get("id").toString()) , jsonObject.get("title").toString(), jsonObject.get("body").toString());
        System.out.println(post);

        controller.createNewPost("https://jsonplaceholder.typicode.com/posts", new Object());

    }
}