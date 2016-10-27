package br.unipe.mlpIII.pontoextra.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propriedades {

	public static void main(String[] args) {

		FileInputStream inputProperties;
		Properties properties = new Properties();

		try {

			inputProperties = new FileInputStream("properties\\database.properties");
			properties.load(inputProperties);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = properties.getProperty("conexao.url");
		String database = properties.getProperty("conexao.database");
		String user = properties.getProperty("conexao.usuario");
		String password = properties.getProperty("conexao.senha");
		String port = properties.getProperty("conexao.porta");

		System.out.println(url);
		System.out.println(database);
		System.out.println(user);
		System.out.println(password);
		System.out.println(port);

	}

}
