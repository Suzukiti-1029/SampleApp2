package service;

import java.util.List;
import java.util.Map;

import entity.CartItem;
import entity.Item;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import repository.ItemRepository;
import utility.CartItemUtility;

public class CartService {
  private static final ItemRepository itemRepository = new ItemRepository();

  private HttpServletRequest request;
  private CartItemUtility cartItemUtility;
  public CartService(HttpServletRequest request) {
    this.request = request;
    cartItemUtility = new CartItemUtility(this.request);
  }


  public void getAllItems() {
    List<Item> itemsList = itemRepository.selectAllItems();

    Map<String, CartItem> cartItemsMap = cartItemUtility.getCartItemsAsMap();

    request.setAttribute("itemsList", itemsList);
    request.setAttribute("cartItemsMap", cartItemsMap);
  }

  public void addItemToCart() {
    String id = request.getParameter("id");
    Map<String, CartItem> cartItemsMap = cartItemUtility.getCartItemsAsMap();

    CartItem cartItem = cartItemsMap.get(id);
    if (cartItem == null) {
      Item item = itemRepository.selectById(id);
      cartItemsMap.put(id, new CartItem(item, 1));
    } else {
      int itemCount = cartItem.getCount();
      cartItem.setCount(++itemCount);
    }

    HttpSession session = request.getSession(true);
    session.setAttribute("cartItemsMap", cartItemsMap);
  }

  public void deleteCartItem() {
    String id = request.getParameter("id");
    Map<String, CartItem> cartItemsMap = cartItemUtility.getCartItemsAsMap();

    CartItem cartItem = cartItemsMap.get(id);
    if (cartItem != null) {
      cartItemsMap.remove(id);
    }

    HttpSession session = request.getSession(true);
    session.setAttribute("cartItemsMap", cartItemsMap);
  }


  
}
