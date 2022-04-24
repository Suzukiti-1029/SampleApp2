package Controller;

import java.io.IOException;

import Service.messageService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class addController extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    messageService service = new messageService();
    service.addMessages(request);

    response.sendRedirect("/msgboard/resources/jsp/index.jsp");
  }
}
