package Entity;

import java.util.Date;

public class Message {
  // JSP用
  public Message() {
  }

  public Message(Date date, String title, String contents) {
    this.date = date;
    this.title = title;
    this.contents = contents;
  }

  private Date date;
  private String title;
  private String contents;

  public Date getDate() {
    return date;
  }
  public String getTitle() {
    return title;
  }
  public String getContents() {
    return contents;
  }
}
