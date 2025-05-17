package br.edu.fatecgru.util;

import java.sql.*;

public class ConnectionFactory {
	public static Connection getConnection() throws Exception {
		try {
			/*
			 * indica qual é o banco de dados que estou utilizando e seu driver
			 */
			Class.forName("com.mysql.jdbc.Driver");
			// estabelece a conexao e retorna uma conexao
			String url = "jdbc:mysql://localhost:3306/QuartoSemestre";
			String login = "root";
			String senha = "";
			return DriverManager.getConnection(url, login, senha);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao Conectar");
		}
	}
}
