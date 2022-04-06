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
  %>
  <h1>Result</h1>
  <p>選択された色は<%= color %></p>
  <a href="index2-2.jsp">index2-2.jspへ戻る</a>
</body>

</html>