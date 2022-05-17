package controller.cart;

import java.io.IOException;

import controller.servletBase;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CartService;

@WebServlet("/cart/index")
public class index extends servletBase {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    super.doGet(request, response);
    CartService cartService = new CartService(request);
    cartService.getAllItems();

    forward("/resources/jsp/cart/index.jsp");
  }
}
