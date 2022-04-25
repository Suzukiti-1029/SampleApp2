<%@ page contentType="text/html; charset=UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ja">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/shop/resources/css/stylesheet.css">
  <title>register</title>
</head>

<body>
  <h1>Register</h1>

  <table>
    <tr>
      <th>商品名</th>
      <th>価格</th>
      <th>個数</th>
      <th>小計</th>
    </tr>
    <!-- メッセージをすべて出力 -->
    <tr>
      <td>
        <!-- 商品名を出力 -->
        お茶
      </td>
      <td>
        <!-- 価格を出力 -->
        100円
      </td>
      <td>
        <!-- 個数を出力 -->
        3個
      </td>
      <td>
        <!-- 金額 -->
        300円
      </td>
    </tr>
    <tr>
      <th colspan="3">お支払い金額(税抜)</th>
      <td>
        <!-- 金額合計 -->
        300円
      </td>
    </tr>
  </table>

  <a href="index.jsp">戻る</a>
  <a href="complete.jsp">支払い</a>
</body>

</html>