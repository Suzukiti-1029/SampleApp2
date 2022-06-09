package Logic;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;

public class messageLogic {
  public Connection DBconnect() throws ServletException {
    Connection con = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      // データベースへ接続
      con = DriverManager.getConnection(
        "jdbc:mysql://msgboard-mysql-docker:3306/messageapp",
        "root",
        "256133"
      );
    } catch (Exception e) {
      throw new ServletException(e);
    }
    return con;
  }
}
