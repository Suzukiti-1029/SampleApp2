package controller.cashresister;

import java.io.IOException;

import controller.servletBase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CashresisterService;

@WebServlet("/cashresister/index")
public class index extends servletBase {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    super.doGet(request, response);
    CashresisterService cashresisterService = new CashresisterService(request);
    cashresisterService.getCartItemsInfo();

    forward("/resources/jsp/cashresister/index.jsp");
  }
}
