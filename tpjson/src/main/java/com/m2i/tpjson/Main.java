package com.m2i.tpjson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main_jackson_read_collection(String[] args) {
		final String fileName = "list_rectangle.json";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			List<Rectangle> todos = objectMapper.readValue(new File(fileName), new TypeReference<List<Rectangle>>() {
			});

			System.out.println(todos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main_gson_read_collection(String[] args) {

		try {
			final String fileName = "list_rectangle.json";
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			Type type = new TypeToken<ArrayList<Rectangle>>() {
			}.getType();

			List<Rectangle> l = gson.fromJson(new FileReader(fileName), type);

			l.forEach(System.out::println);

		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main_gson_write_collection(String[] args) {
		Rectangle r1 = new Rectangle(1, 2);
		Rectangle r2 = new Rectangle(11, 12);
		Rectangle r3 = new Rectangle(21, 22);
		final String fileName = "list_rectangle.json";
		List<Rectangle> l = new ArrayList<Rectangle>();
		l.add(r1);
		l.add(r2);
		l.add(r3);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (FileWriter f = new FileWriter(fileName)) {

			gson.toJson(l, f);

		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main_gson_read(String[] args) {
		final String fileName = "rectangle.json";
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try {
			Rectangle r = gson.fromJson(new FileReader(fileName), Rectangle.class);
			System.out.println(r);

		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main_gson_write(String[] args) {
		Rectangle r = new Rectangle(12, 13);

		final String fileName = "rectangle.json";
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try (FileWriter f = new FileWriter(fileName)) {

			gson.toJson(r, f);

		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
