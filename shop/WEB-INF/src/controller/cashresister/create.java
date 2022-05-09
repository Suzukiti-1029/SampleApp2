package controller.cashresister;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cashresister/create")
public class create extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    // 処理

    getServletContext()
      .getRequestDispatcher("/resources/jsp/cashresister/create.jsp")
        .forward(request, response);
  }
}
