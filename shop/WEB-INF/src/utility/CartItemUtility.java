package utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.CartItem;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class CartItemUtility {
  private HttpServletRequest request;
  public CartItemUtility(HttpServletRequest request) {
    this.request = request;
  }

  public static int calcTotalPrice(List<CartItem> cartItems) {
    int totalPrice = 0;
    for (CartItem cartItem : cartItems) {
      totalPrice += cartItem.getPrice() * cartItem.getCount();
    }
    return totalPrice;
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

  public List<CartItem> getCartItemsAsList() {
    Map<String, CartItem> cartItemsMap = getCartItemsAsMap();
    List<CartItem> cartItemsList = new ArrayList<CartItem>();
    for (String key : cartItemsMap.keySet()) {
      cartItemsList.add(cartItemsMap.get(key));
    }
    return cartItemsList;
  }
}
