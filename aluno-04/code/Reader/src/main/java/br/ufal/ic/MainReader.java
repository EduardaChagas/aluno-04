package br.ufal.ic;

import java.io.IOException;

public class MainReader {

	public static void main(String[] args) throws IOException {
		Reader leitor = new Reader();
		System.out.println(leitor.readAll("C:\\Users\\Eduarda\\Desktop\\Reader\\Arquivo.txt"));

	}

}
