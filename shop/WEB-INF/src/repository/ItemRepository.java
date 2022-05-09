package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Item;

public class ItemRepository {
  // 仮DB
  private static List<Item> items = new ArrayList<Item>();

  static {
    items.add(new Item("1", "お茶", 120));
    items.add(new Item("2", "紅茶", 130));
    items.add(new Item("3", "水", 110));
    items.add(new Item("4", "ジュース", 140));
    items.add(new Item("5", "コーヒー", 350));
  }

  // Return all Items
  public List<Item> selectAllItems() {
    return items;
  }

  // Return Item of specified id
  public Item selectById(String id) {
    for (Item item : items) {
      if (item.getId().equals(id)) {
        return item;
      }
    }
    return null;
  }
}
