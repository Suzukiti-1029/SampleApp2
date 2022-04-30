<%@ page contentType="text/html; charset=UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="ja">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="/shop/resources/css/stylesheet.css">
  <title>index</title>
</head>

<body>
  <h1>Index</h1>

  <table>
    <tr>
      <th>商品名</th>
      <th>価格</th>
      <th>個数</th>
      <th>カートへ移動</th>
      <th>カートクリア</th>
    </tr>
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
        <!-- ショッピングカートへ追加 -->
        <a href="#">追加</a>
      </td>
      <td>
        <!-- ショッピングカートをクリア -->
        <a href="#">クリア</a>
      </td>
    </tr>
  </table>

  <a href="/shop/cashresister/index">レジへ</a>
</body>

</html>