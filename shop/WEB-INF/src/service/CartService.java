package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.CartItem;
import entity.Item;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import repository.ItemRepository;

public class CartService {
  private static final ItemRepository itemRepository = new ItemRepository();

  private HttpServletRequest request;

  public CartService(HttpServletRequest request) {
    this.request = request;
  }

  public void getAllItems() {
    List<Item> itemsList = itemRepository.selectAllItems();

    Map<String, CartItem> cartItemsMap = getCartItemsAsMap();

    request.setAttribute("itemsList", itemsList);
    request.setAttribute("cartItemsMap", cartItemsMap);
  }


  // Use session to retrieve items in the current cart and return them in a map
  private Map<String, CartItem> getCartItemsAsMap() {
    HttpSession session = request.getSession(true);
    Object items = session.getAttribute("cart");
    if (items == null) {
      return new HashMap<String, CartItem>();
    } else {
      return (Map<String, CartItem>)items;
    }
  }
}
