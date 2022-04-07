<%@ page contentType="text/html; charset=UTF-8" %>
<%-- 文字コード(エンコーディング)を指定(文字化け防止) --%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>index</title>
  <link rel="stylesheet" type="text/css" href="/msgboard/resources/css/stylesheet.css">
</head>
<body>
  <h1>Index</h1>
  <form action="send.jsp" method="post">
    タイトル：<br>
    <input type="text" name="title" /><br>
    メッセージ：<br>
    <textarea name="contents"></textarea><br>
    <button>click</button>
  </form>
</body>
</html>