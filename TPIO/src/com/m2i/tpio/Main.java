package com.m2i.tpio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		System.out.println("Votre nom : ");
		// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// String nom = in.readLine();
		String nom = System.console().readLine();
		System.out.println("Bonjour " + nom);
	}

	public static void main_read(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("le-fichier.txt"));

		) {

			br.lines().forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main_write(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("le-fichier.txt"));

		) {

			bw.write("Hello World !");
			bw.newLine();
			bw.write("Hello World !");
			bw.newLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}