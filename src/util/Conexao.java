package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() throws Exception {
        String url = "jdbc:mysql://localhost:3306/estoque";
        String usuario = "root";
        String senha = ""; // se usa XAMPP geralmente não tem senha

        return DriverManager.getConnection(url, usuario, senha);
    }
}

