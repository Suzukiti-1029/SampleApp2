package Service;

import java.io.IOException;
import java.util.Date;

import Entity.Message;
import Repository.MessageDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class messageService {
  public void addMessages(HttpServletRequest request)
  throws IOException, ServletException {
    Date date = new Date();
    // 入力値を受け取る
    String title = request.getParameter("title");
    String contents = request.getParameter("contents");

    Message msg = new Message(date, title, contents);
    MessageDao dao = new MessageDao();
    dao.save(msg);
  }
}
