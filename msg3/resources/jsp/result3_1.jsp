<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="msg.Worker" %>
<jsp:useBean id="myWorker" type="msg.Worker" scope="request" />
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" type="text/css" href="/msg3/resources/css/stylesheet.css">
  <title>result</title>
</head>

<body>
  <h1>Result</h1>
  名前：
  <jsp:getProperty name="myWorker" property="name" /><br>
  年齢：
  <jsp:getProperty name="myWorker" property="age" />才<br>

  <a href="/msg3/resources/jsp/index3_1.jsp">戻る</a>
</body>

</html>