<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="java.util.List" %>
<%@ page import="entity.CartItem" %>

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

  <%
    List<CartItem> cartItems = (List<CartItem>)request.getAttribute("cartItems");
    int totalPrice = (int)request.getAttribute("totalPrice");
  %>
  <table>
    <tr>
      <th>商品名</th>
      <th>価格</th>
      <th>個数</th>
      <th>小計</th>
    </tr>
    <!-- メッセージをすべて出力 -->
    <% for(CartItem cartItem: cartItems) { %>
    <tr>
      <td>
        <!-- 商品名を出力 -->
        <%= cartItem.getName() %>
      </td>
      <td>
        <!-- 価格を出力 -->
        <%= cartItem.getPrice() %>円
      </td>
      <td>
        <!-- 個数を出力 -->
        <%= cartItem.getCount() %>個
      </td>
      <td>
        <!-- 金額 -->
        <%= cartItem.getPrice() * cartItem.getCount() %>円
      </td>
    </tr>
    <% } %>
    <tr>
      <th colspan="3">お支払い金額(税抜)</th>
      <td>
        <!-- 金額合計 -->
        <%= totalPrice %>円
      </td>
    </tr>
  </table>

  <a href="/shop/cart/index">戻る</a>
  <a href="/shop/cashresister/create">支払い</a>
</body>

</html>