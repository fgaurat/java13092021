package com.m2i.tpio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		try {
			File f = new File("le-fichier.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("Hello World !");
			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
