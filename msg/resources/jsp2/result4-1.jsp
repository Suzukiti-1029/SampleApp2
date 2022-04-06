<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>result</title>
</head>

<body>
  <h1>Result</h1>
  名前：<%= request.getParameter("firstname") %><br>
  年齢：<%= request.getParameter("age") %>才<br>
  <a href="index4-1.jsp">戻る</a>
</body>

</html>