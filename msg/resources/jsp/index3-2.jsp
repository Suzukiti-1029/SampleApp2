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
    // タグの記載
    out.println("<h1>" + str + "</h1>");
  %>
</body>

</html>