package com.example.plandidrest

import java.net.URI
import java.net.URL
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.URLEncoder
import java.net.HttpURLConnection

class Rest {
    public fun void postImageToPlantID() {
        private val post_endpoint = "https://api.plant.id/v2/identify"

        val client = HttpClient.newBuilder().build();
        val request = HttpRequest.newBuilder()
            .uri(URI.create("http://webcode.me"))
            .build();

        val response = client.send(request, HttpResponse.BodyHandlers.ofString());
        println(response.body())
        fun postImageToPlantID(fname: String): String {
            val url =  URL("https://plant.id/api/v2")
            var reqParam = URLEncoder.encode("username", "UTF-8") + "=" + URLEncoder.encode("chunter", "UTF-8")
            val response = client.send(request, HttpResonse.
            with(url.openConnection() as HttpURLConnection) {
                requestMethod = "GET"  // optional default is GET

                println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

                inputStream.bufferedReader().use {
                    it.lines().forEach { line ->
                        // read jpg into stream, base64 encoded
                    }
                }
            }
        }
    }
}
