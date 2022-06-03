package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Entity.Message;
import jakarta.servlet.ServletException;

public class MessageDao {
  // JSP用
  public MessageDao() {
  }

  // 仮DB
  private static List<Message> messages = new ArrayList<Message>();

  public Map<String, Object> connectDB() throws ServletException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Map<String, Object> data = new HashMap<String, Object>();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      // データベースへ接続
      con = DriverManager.getConnection(
        "jdbc:mysql://msgboard-mysql-docker:3306/sample",
        "root",
        "256133"
      );

      // SQLの実行
      pstmt = con.prepareStatement("select id,name from test");
      rs = pstmt.executeQuery();

      // Viewへ引き渡す値を設定
      while (rs.next()) {
        data.put("id", rs.getInt("id"));
        data.put("name", rs.getString("name"));
      }
    } catch (Exception e) {
      throw new ServletException(e);
    } finally {
      try {
        rs.close();
        pstmt.close();
        con.close();
      } catch (Exception e) {
      }
    }
    return data;
  }

  public void save(Message message) {
    messages.add(message);
  }

  public List<Message> select() {
    return messages;
  }
}
