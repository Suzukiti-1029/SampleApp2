package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entity.Message;
import jakarta.servlet.ServletException;

public class MessageDao {
  // JSP用
  public MessageDao() {
  }

  public List<Message> select() throws ServletException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    List<Message> messages = new ArrayList<Message>();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      // データベースへ接続
      con = DriverManager.getConnection(
        "jdbc:mysql://msgboard-mysql-docker:3306/messageapp",
        "root",
        "256133"
      );

      // SQLの実行
      pstmt = con.prepareStatement("select created_at, title, contents from messages");
      rs = pstmt.executeQuery();

      // Viewへ引き渡す値を設定
      while (rs.next()) {
        Date date = rs.getTimestamp("created_at");
        String title = rs.getString("title");
        String contents = rs.getString("contents");
        messages.add(new Message(date, title, contents));
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
    return messages;
  }

  public void save(Message message) throws ServletException {
    Connection con = null;
    PreparedStatement pstmt = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      // データベースへ接続
      con = DriverManager.getConnection(
          "jdbc:mysql://msgboard-mysql-docker:3306/messageapp",
          "root",
          "256133");

      // SQLの実行
      String sql = "insert into messages(title, contents) values (?, ?)";
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, message.getTitle());
      pstmt.setString(2, message.getContents());
      pstmt.executeUpdate();
      pstmt.clearParameters();
    } catch (Exception e) {
      throw new ServletException(e);
    } finally {
      try {
        pstmt.close();
        con.close();
      } catch (Exception e) {
      }
    }
  }
}