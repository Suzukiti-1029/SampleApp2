import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import msg.Worker;

@WebServlet("/Sample2_1")
public class Sample2_1 extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    String name = request.getParameter("firstname");
    String age = request.getParameter("age");

    Worker worker = new Worker(name, age);

    request.setAttribute("myWorker", worker);

    getServletContext()
      .getRequestDispatcher("/resources/jsp/result2_1.jsp")
        .forward(request, response);
  }
}
