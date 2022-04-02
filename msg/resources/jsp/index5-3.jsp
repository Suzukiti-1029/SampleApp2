<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>index</title>
</head>

<body>
  <%
    // boolean型を初期化
    boolean bl = true;
  %>

  <!-- if文 ここから -->
  <% if (bl) { %>
    <h1>Ok, True.</h1>
  <% } %>
  <!-- if文 ここまで -->
</body>

</html>