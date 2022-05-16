package service;

import jakarta.servlet.http.HttpServletRequest;
import logic.CartItemLogic;

public class CashresisterService {
  private CartItemLogic cartItemLogic;
  public CashresisterService(HttpServletRequest request) {
    this.cartItemLogic = new CartItemLogic(request);
  }

  public void getCartItemsInfo() {
    cartItemLogic.getAllCartItems();
    cartItemLogic.getCartItemsPrice();
  }
}
