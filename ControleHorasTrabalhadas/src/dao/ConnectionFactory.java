package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    String url, user, senha, classforname;

    public Connection getConnection() throws ClassNotFoundException {
        url = "jdbc:hsqldb:file:./db/horario";
        user = "sa";
        senha = "";

        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}