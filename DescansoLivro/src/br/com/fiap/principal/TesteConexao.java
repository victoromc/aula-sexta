package br.com.fiap.principal;

import java.sql.Connection;

import br.com.fiap.conexao.Conexao;

public class TesteConexao {

	public static void main(String[] args) {
		Connection conectar = null;
		try {
			conectar = Conexao.queroConectar();
			System.out.println("Conectou");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conectar.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
