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
    <h1><%= name %></h1>
  <% } %>
  <!-- for文ここまで -->
</body>

</html>