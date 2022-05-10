package service;

import java.util.List;

import entity.Item;
import jakarta.servlet.http.HttpServletRequest;
import repository.ItemRepository;

public class CartService {
  private static final ItemRepository itemRepository = new ItemRepository();

  private HttpServletRequest request;

  public CartService(HttpServletRequest request) {
    this.request = request;
  }

  public void getAllItems() {
    List<Item> items = itemRepository.selectAllItems();
    request.setAttribute("items", items);
  }
}
