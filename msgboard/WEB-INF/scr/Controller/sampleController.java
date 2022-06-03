package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import Repository.MessageDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sample")
public class sampleController extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");

    MessageDao dao = new MessageDao();
    Map<String, Object> data = dao.connectDB();

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Sample</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Result</h1>");
    out.println("<p>" + data.get("id") + "</p>");
    out.println("<p>" + data.get("name") + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
