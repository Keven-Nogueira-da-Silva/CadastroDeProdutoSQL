package dao;

import model.Produto;
import util.Conexao;

import java.sql.*;
import java.util.*;

public class ProdutoDAO {

    public void inserir(Produto produto) throws Exception {
        Connection conn = Conexao.conectar();
        String sql = "INSERT INTO produtos (nome, preco, quantidade) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, produto.getNome());
        stmt.setDouble(2, produto.getPreco());
        stmt.setInt(3, produto.getQuantidade());
        stmt.execute();
        stmt.close();
        conn.close();
    }

    public List<Produto> listar() throws Exception {
        List<Produto> lista = new ArrayList<>();
        Connection conn = Conexao.conectar();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");

        while (rs.next()) {
            Produto p = new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
            );
            lista.add(p);
        }

        rs.close();
        stmt.close();
        conn.close();
        return lista;
    }
}

