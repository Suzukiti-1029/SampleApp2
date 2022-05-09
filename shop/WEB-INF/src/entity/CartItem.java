package entity;

public class CartItem extends Item {
  private int count;

  public CartItem(Item item, int count) {
    super(item.getId(), item.getName(), item.getPrice());
    this.count = count;
  }

  // Getter
  public int getCount() {
    return count;
  }
  
  // Setter
  public void setCount(int count) {
    this.count = count;
  }
}
