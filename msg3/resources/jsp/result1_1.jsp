<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" type="text/css" href="/msg3/resources/css/stylesheet.css">
  <title>result</title>
</head>

<body>
  <h1>Result</h1>
  名前：<%= request.getAttribute("firstname2") %><br>
  年齢：<%= request.getAttribute("age2") %>才<br>

  <a href="/msg3/resources/jsp/index1_1.jsp">戻る</a>
</body>

</html>