package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bdvendas", "teste", "123");
            
            
        }catch (Exception erro) {
            throw new RuntimeException(erro);

    }
}

}
