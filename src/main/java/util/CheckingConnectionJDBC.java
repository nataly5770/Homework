package util;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class CheckingConnectionJDBC {

    public static void main(String[] args) {
        try (Connection conn = CheckingConnectionJDBC.getConnection()) {

            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

