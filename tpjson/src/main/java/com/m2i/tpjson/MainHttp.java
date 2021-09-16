package com.m2i.tpjson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainHttp {

	public static void main(String[] args) {
		final String addr = "https://jsonplaceholder.typicode.com/todos";
		try {
			URL url = new URL(addr);
			HttpsURLConnection client = (HttpsURLConnection) url.openConnection();
			client.setRequestMethod("GET");
			// type MIME : text/html, text/plain, application/json
			client.setRequestProperty("Content-Type", "application/json");
			System.out.println(client.getResponseCode());
			ObjectMapper objectMapper = new ObjectMapper();

			List<Todo> todos = objectMapper.readValue(client.getInputStream(), new TypeReference<List<Todo>>() {
			});

			// todos.forEach(System.out::println);

			for (Todo todo : todos) {

				dao.save(todo);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
