<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ja">

<head>
  <link rel="stylesheet" href="/SampleApp2/resources/css/stylesheet.css">
  <title>index</title>
</head>

<body>
  <%
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    out.println(name + ":" + age + "才");
  %>
</body>

</html>