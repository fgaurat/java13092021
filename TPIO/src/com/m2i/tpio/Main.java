package com.m2i.tpio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

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
