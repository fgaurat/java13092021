package com.m2i.tpio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < 1024; i++) {

			try {
				Socket s = new Socket("5.196.102.147", i);
				System.out.println(i + " OK");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}

	public static void main_writeoo(String[] args) {

		System.out.println("Ecriture");
		// Ecriture
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objects.bin", true))) {
			Carre c = new Carre(2);
			System.out.println(c.getSurface());
			oos.writeObject(c);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Lecture");
		// Lecture
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.bin"))) {

			Carre c = (Carre) ois.readObject();

			System.out.println(c);
			System.out.println(c.getSurface());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main_read_system_in(String[] args) {
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
