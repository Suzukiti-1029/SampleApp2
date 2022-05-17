package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Entity.Message;
import jakarta.servlet.ServletException;

public class MessageDao {
  // JSP用
  public MessageDao() {
  }

  private static final long serialVersionUID = 1L;
  // 仮DB
  private static List<Message> messages = new ArrayList<Message>();

  public Map<String, Object> connectDB() throws ServletException {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Map<String, Object> data = new HashMap<String, Object>();

    try {
      // データソースの取得
      Context ctx = new InitialContext();
      DataSource ds = (DataSource)ctx.lookup("java:comp/env/mysql-jdbc");

      // データベースへ接続
      con = ds.getConnection();

      // SQLの実行
      pstmt = con.prepareStatement("select * from sample");
      rs = pstmt.executeQuery();

      // Viewへ引き渡す値を設定
      rs.next();
      data.put("no1", rs.getString("id"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
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
