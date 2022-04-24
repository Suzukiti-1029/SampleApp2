package Repository;

import java.util.ArrayList;
import java.util.List;

import Entity.Message;

public class MessageDao {
  // JSP用
  public MessageDao() {
  }

  // 仮DB
  private static List<Message> messages = new ArrayList<Message>();

  public void save(Message message) {
    messages.add(message);
  }

  public List<Message> select() {
    return messages;
  }
}
