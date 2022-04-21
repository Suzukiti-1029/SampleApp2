import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/Sample")
public class Sample extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    PrintWriter out = response.getWriter();

    out.println("Hello Servlet");
    out.close();
  }
}