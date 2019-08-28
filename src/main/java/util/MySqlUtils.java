package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlUtils {


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://remotemysql.com:3306/qlZ0b0ldTD", "qlZ0b0ldTD", "uEXIsMFSel");
    }
}
