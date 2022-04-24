<%@ page contentType="text/html; charset=UTF-8" %>
<%-- 文字コード(エンコーディング)を指定(文字化け防止) --%>
<% request.setCharacterEncoding("UTF-8"); %>

<%@ page import="java.util.Date" %>
<%@ page import="Repository.MessageDao" %>
<%@ page import="Entity.Message" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>send</title>
  <link rel="stylesheet" type="text/css" href="/msgboard/resources/css/stylesheet.css">
</head>
<body>
  <h1>Send</h1>
  <% 
    Date date = new Date();
    // 入力値を受け取る
    String title = request.getParameter("title");
    String contents = request.getParameter("contents");

    Message msg = new Message(date, title, contents);
    MessageDao dao = new MessageDao();

    dao.save(msg);
  %>
  
  <p>保存完了</p>
  <a href="index.jsp">戻る</a>
</body>
</html>