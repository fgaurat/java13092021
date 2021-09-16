package com.m2i.tpio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {
			final String fileName = "lefichier_nio.txt";
			Path f = Paths.get(fileName);
			Files.createFile(f);

			System.out.println(f.toFile().exists());

			BufferedReader br = Files.newBufferedReader(f);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main_properties(String[] args) {
		Properties p = new Properties();

		try (FileReader fr = new FileReader("config.properties");) {

			p.load(fr);
			System.out.println(p);
			System.out.println(p.getProperty("user"));
			p.setProperty("user", "root");
			FileWriter fw = new FileWriter("config.properties");
			p.store(fw, "change user name");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main_socket_http(String[] args) {

		try (Socket s = new Socket("5.196.102.147", 80)) {

			System.out.println("OK");

			OutputStream os = s.getOutputStream();

			InputStream is = s.getInputStream();

			PrintStream ps = new PrintStream(os);

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ps.println("GET /index.php");

			br.lines().forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main_scan_port(String[] args) {

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

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Hello " + s);
		sc.close();
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
