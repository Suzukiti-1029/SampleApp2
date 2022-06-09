package Controller;

import java.io.IOException;

import Service.messageService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class indexController extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    messageService service = new messageService();
    service.getMessages(request);

    getServletContext()
      .getRequestDispatcher("/resources/jsp/index.jsp")
        .forward(request, response);
  }
}
