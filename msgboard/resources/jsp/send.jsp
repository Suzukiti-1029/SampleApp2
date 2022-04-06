<%@ page contentType="text/html; charset=UTF-8" %>
<%-- 文字コード(エンコーディング)を指定(文字化け防止) --%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>send</title>
  <link rel="stylesheet" type="text/css" href="/SampleApp2/resources/css/stylesheet.css">
</head>
<body>
  <h1>Send</h1>
  <% 
    // 入力値を受け取る
    String title = request.getParameter("title");
    String contents = request.getParameter("contents");
  %>
  
  <%= title %><br>
  <%= contents %><br>
  <a href="index.jsp">戻る</a>
</body>
</html>