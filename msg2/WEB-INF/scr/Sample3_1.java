import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("Sample3_1")
public class Sample3_1 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    String name = request.getParameter("name");

    PrintWriter out = response.getWriter();
    out.println(name);
    out.close();
  }
}
