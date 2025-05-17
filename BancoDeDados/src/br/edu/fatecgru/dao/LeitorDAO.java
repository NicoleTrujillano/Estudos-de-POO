package br.edu.fatecgru.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.fatecgru.model.Leitor;
import br.edu.fatecgru.util.ConnectionFactory;

public class LeitorDAO {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Leitor leitor;

	public LeitorDAO() throws Exception {
		/*
		 * chama a classe ConnectionFactory e estabele uma conexão
		 */
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("erro: \n" + e.getMessage());
		}
	}

	// método de salvar
	public void salvar(Leitor leitor) throws Exception {
		if (leitor == null)
			throw new Exception("O valor passado nao pode ser nulo");
		try {
			String SQL = "INSERT INTO tbleitor (codLeitor, nomeLeitor, tipoLeitor) " + "values (?, ?, ?)";
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, leitor.getCodLeitor());
			ps.setString(2, leitor.getNomeLeitor());
			ps.setString(3, leitor.getTipoLeitor());
			ps.executeUpdate();
		} catch (SQLException sqle) {
			throw new Exception("Erro ao inserir dados " + sqle);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
	}
}