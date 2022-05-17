package logic;

import java.util.List;

import entity.CartItem;
import jakarta.servlet.http.HttpServletRequest;
import utility.CartItemUtility;

public class CartItemLogic {
  private HttpServletRequest request;
  private CartItemUtility cartItemUtility;
  private List<CartItem> cartItems;
  public CartItemLogic(HttpServletRequest request) {
    this.request = request;
    this.cartItemUtility = new CartItemUtility(request);
    this.cartItems = cartItemUtility.getCartItemsAsList();
  }

  public void getAllCartItems() {
    request.setAttribute("cartItems", cartItems);
  }

  public void getCartItemsPrice() {
    int totalPrice = CartItemUtility.calcTotalPrice(cartItems);
    request.setAttribute("totalPrice", totalPrice);
  }
}
