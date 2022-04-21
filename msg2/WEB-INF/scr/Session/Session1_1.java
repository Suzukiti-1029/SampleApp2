package Session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Session1_1 extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    HttpSession session = request.getSession(true);
    int count = 1;

    Object value = session.getAttribute("count");
    if (value != null) {
      count = (Integer)value;
    }

    PrintWriter out = response.getWriter();
    out.println("訪問回数：" + count + "回");
    session.setAttribute("count", ++count);
    out.close();
  }
}
