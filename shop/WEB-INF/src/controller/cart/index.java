package controller.cart;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CartService;

@WebServlet("/cart/index")
public class index extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    CartService cartService = new CartService(request);
    cartService.getAllItems();

    getServletContext()
      .getRequestDispatcher("/resources/jsp/cart/index.jsp")
        .forward(request, response);
  }
}
