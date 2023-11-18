package org.practice.app.chapter.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ControllerImpl implements ControllerI {

    @Override
    public String getPosts(String apiUrl) {
        String lines = "";
        StringBuilder responseBody = new StringBuilder();
        try {
            URL url = new URL(apiUrl);

            //Open Connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //Set Http method request type : GET, POST, PUT, DELETE
            connection.setRequestMethod("GET");

            //che k connection established to the server or not
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new Exception();
            }

            // Get the input stream to read the response
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                while ((lines = reader.readLine()) != null) {
                    responseBody.append(lines);
                }

            }
            connection.disconnect();
        } catch (Exception e) {
            System.out.println("api error : " + e.getMessage());
        }
        return responseBody.toString();
    }


    @Override
    public String createNewPost(String apiUrl, Object payload) {
        String lines = "";
        StringBuilder responseBody = new StringBuilder();
        try {
            URL url = new URL(apiUrl);

            //Open Connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            //Set Http method request type : GET, POST, PUT, DELETE
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Write the JSON payload to the request body
            try (OutputStream os = connection.getOutputStream()) {
            byte[]  data = payload.toString().getBytes("UTF-8");
            os.write(data, 0, data.length);
            }

            //che k connection established to the server or not
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                //create post
                try(InputStream is = connection.getInputStream(); BufferedReader br = new BufferedReader(new InputStreamReader(is))){
                    while ((lines=br.readLine()) != null){
                        responseBody.append(lines);
                    }
                    return responseBody.toString();
                }finally {
                    connection.disconnect();
                }
            }else {
                // Handle error cases
                return "HTTP Error: " + responseBody;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "Request Error: " + e.getMessage();
        }
    }

    @Override
    public String updateNewPost(String apiUrl, Object payload) {
        return null;
    }
}
