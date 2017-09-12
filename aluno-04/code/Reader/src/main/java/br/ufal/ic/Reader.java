package br.ufal.ic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
	
	public String readAll(String path) throws IOException{
		BufferedReader buffer  = null; 
		StringBuilder stringB = new StringBuilder();
		File arquivo = new File(path);
        try{
            InputStream stream = new FileInputStream(arquivo);
            String linha;
            try{
                buffer = new BufferedReader(new InputStreamReader(stream, "ISO-8859-1"));
                while((linha = buffer.readLine()) != null) {
                	stringB.append(linha).append("\n");
                }
            }finally {
                stream.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return stringB.toString();
	}

}
