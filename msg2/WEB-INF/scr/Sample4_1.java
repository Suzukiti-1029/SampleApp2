import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Sample4_1 extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    String name = request.getParameter("firstname");
    String age = request.getParameter("age");

    PrintWriter out = response.getWriter();
    out.println("<h1>Result</h1>");
    out.println("名前：" + name + "<br/>");
    out.println("年齢：" + age + "才<br/>");
    out.println("<a href=\"/msg2/resources/jsp/index4_1.jsp\">戻る</a>");
    out.close();
  }
}
