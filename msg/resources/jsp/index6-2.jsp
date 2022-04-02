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
    // 拡張for文
    for (String name: names) {
      out.println(name + "<br/>"); // 改行される
    }
  %>
</body>

</html>