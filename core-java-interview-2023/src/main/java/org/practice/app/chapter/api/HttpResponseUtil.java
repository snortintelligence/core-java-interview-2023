package org.practice.app.chapter.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class HttpResponseUtil {
   public static JSONObject convertHttpResponseToJSONObject(String httpResponsePayload) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject)parser.parse(httpResponsePayload);
        return object;
    }

    public static  JSONArray convertHttpResponseToJSONArray(String httpResponsePayload) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONArray object = (JSONArray)parser.parse(httpResponsePayload);
        return object;
    }

}
