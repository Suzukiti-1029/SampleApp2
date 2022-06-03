package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Sample") // localhost:8080/dbcon/Sample で接続
public class Sample extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    String a = "";
    try {
      Class.forName("com.mysql.jdbc.Driver");
//        .getDeclaredConstructor()
//          .newInstance();
      
      Connection con = DriverManager.getConnection(
        "jdbc:mysql://dbcon-mysql:3306/sample",
        "root",
        "pass"
      );
      Statement statement = con.createStatement();
      ResultSet rs = statement.executeQuery("select id, name from test");
      while (rs.next()) {
        a += rs.getInt("id") + ":" + rs.getString("name");
      }
      rs.close();
      statement.close();
      con.close();
    } catch (Exception e) {
      a = e.toString();
      e.printStackTrace();
    }

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Sample</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Result</h1>");
    out.println("<p>" + a + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
