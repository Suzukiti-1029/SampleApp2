<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="msg.Worker" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" type="text/css" href="/msg3/resources/css/stylesheet.css">
  <title>result</title>
</head>

<body>
  <%
    Worker w = (Worker)request.getAttribute("myWorker");
  %>
  <h1>Result</h1>
  名前：<%= w.getName() %><br>
  年齢：<%= w.getAge() %>才<br>

  <a href="/msg3/resources/jsp/index2_1.jsp">戻る</a>
</body>

</html>