package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletBase extends HttpServlet {
  private HttpServletRequest request;
  private HttpServletResponse response;

  public void doGet(HttpServletRequest request, HttpServletResponse response)
  throws IOException, ServletException {
    this.request = request;
    this.response = response;
  }

  public void forward(String contextPath) throws IOException, ServletException {
    getServletContext()
      .getRequestDispatcher(contextPath)
        .forward(request, response);
  }

  public void redirect(String url) throws IOException {
    response.sendRedirect(url);
  }
}
