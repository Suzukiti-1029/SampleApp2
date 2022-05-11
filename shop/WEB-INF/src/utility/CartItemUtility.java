package utility;

import java.util.HashMap;
import java.util.Map;

import entity.CartItem;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class CartItemUtility {
  private HttpServletRequest request;
  public CartItemUtility(HttpServletRequest request) {
    this.request = request;
  }

  // Use session to retrieve items in the current cart and return them in a map
  public Map<String, CartItem> getCartItemsAsMap() {
    HttpSession session = request.getSession(true);
    Object items = session.getAttribute("cartItemsMap");
    if (items == null) {
      return new HashMap<String, CartItem>();
    } else {
      return (Map<String, CartItem>) items;
    }
  }
}
