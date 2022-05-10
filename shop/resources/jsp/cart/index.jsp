<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>

<%@ page import="entity.Item" %>
<%@ page import="entity.CartItem" %>

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

  <%
    List<Item> items = (List<Item>)request.getAttribute("itemsList");
    Map<String, CartItem> cartItems = (Map<String, CartItem>)request.getAttribute("cartItemsMap");
  %>
  <table>
    <tr>
      <th>商品名</th>
      <th>価格</th>
      <th>個数</th>
      <th>カートへ移動</th>
      <th>カートクリア</th>
    </tr>
    <% for(Item item: items) { %>
      <tr>
        <td>
          <!-- 商品名を出力 -->
          <%= item.getName() %>
        </td>
        <td>
          <!-- 価格を出力 -->
          <%= item.getPrice() %>円
        </td>
        <td>
          <!-- 個数を出力 -->
          <% CartItem cartItem = cartItems.get(item.getId()); %>
          <%= cartItem == null ? 0 : cartItem.getCount() %>個
        </td>
        <td>
          <!-- ショッピングカートへ追加 -->
          <a href="add?id=1">追加</a>
        </td>
        <td>
          <!-- ショッピングカートをクリア -->
          <a href="delete?id=1">クリア</a>
        </td>
      </tr>
    <% } %>
  </table>

  <a href="/shop/cashresister/index">レジへ</a>
</body>

</html>