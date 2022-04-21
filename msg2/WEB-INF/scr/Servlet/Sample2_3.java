package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("Sample2_3")
public class Sample2_3 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");

    String param = request.getParameter("count");
    int count = Integer.parseInt(param);

    PrintWriter out = response.getWriter();
    Random rand = new Random();
    for (int i = 0; i < count; i++) {
      int r = rand.nextInt(256);
      int g = rand.nextInt(256);
      int b = rand.nextInt(256);
      String color = "rgb(" + r + "," + g + "," + b + ")";
      out.println("<span style=\"color:" + color + "\">");
      out.println("■" + color + "<br/>");
      out.println("</span>");
      // System.out.println(color);
    }
    out.close();
  }
}
