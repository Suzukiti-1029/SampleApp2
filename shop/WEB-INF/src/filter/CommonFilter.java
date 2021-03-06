package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class CommonFilter implements Filter {
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
  throws IOException, ServletException {
    HttpServletRequest hRequest = (HttpServletRequest)request;
    HttpServletResponse hResponse = (HttpServletResponse)response;

    hRequest.setCharacterEncoding("UTF-8");
    hResponse.setCharacterEncoding("UTF-8");

    chain.doFilter(hRequest, hResponse);
  }
}
