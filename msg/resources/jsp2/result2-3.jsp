<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>result</title>
</head>

<body>
  <%
    String color = request.getParameter("color");
    String colorJa = "青";
    if ("red".equals(color)) {
      colorJa = "赤";
    }
  %>
  <h1>Result</h1>
  <p style="color: <%= color %> ">選択された色は<%= colorJa %></p>
  <a href="index2-3.jsp">index2-3.jspへ戻る</a>
</body>

</html>