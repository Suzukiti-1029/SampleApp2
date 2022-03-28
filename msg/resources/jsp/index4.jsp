<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>index</title>
</head>

<body>
  <%
    // Javaプログラム
    String str = "Hello JSP";
  %>
  <!-- 変数の出力 -->
  <h1><%= str %></h1>
</body>

</html>