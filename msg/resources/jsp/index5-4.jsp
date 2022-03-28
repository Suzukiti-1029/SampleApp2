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
    boolean bl = false;
  %>

  <!-- if-else文 ここから -->
  <% if (bl) { %>
    <h1>Ok True.</h1>
  <% }else{ %>
    <h1>No, False.</h1>
  <% } %>
  <!-- if-else文 ここまで -->
</body>

</html>