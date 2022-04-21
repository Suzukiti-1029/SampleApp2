import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("Sample2_2")
public class Sample2_2 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    String color = request.getParameter("color");

    PrintWriter out = response.getWriter();
    out.println("<p style=\"color:" + color + "\">" + color + "</p>");
    out.close();
  }
}
