package service;

import jakarta.servlet.http.HttpServletRequest;
import logic.CartItemLogic;

public class CashresisterService {
  private HttpServletRequest request;
  private CartItemLogic cartItemLogic;
  public CashresisterService(HttpServletRequest request) {
    this.request = request;
    this.cartItemLogic = new CartItemLogic(request);
  }

  public void getCartItemsInfo() {
    cartItemLogic.getAllCartItems();
    cartItemLogic.getCartItemsPrice();
  }

  public void settle() {
    cartItemLogic.getCartItemsPrice();
    // カート個数初期化
    request.getSession(false).invalidate();
  }
}
