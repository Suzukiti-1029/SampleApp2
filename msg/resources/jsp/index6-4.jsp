<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>index</title>
</head>

<body>
  <%
    String[] names = {"Taro", "Hanako"};
  %>
  <!-- for文ここから -->
  <% for (String name: names) { %>
    <!-- if-else文ここから-->
    <% if ("Taro".equals(name)) { %>
      <div style="color: blue;">He is Taro</div>
    <% }else{ %>
      <div style="color: red;">She is Hanako</div>
    <% } %>
    <!-- if-else文ここまで-->
  <% } %>
  <!-- for文ここまで -->
</body>

</html>