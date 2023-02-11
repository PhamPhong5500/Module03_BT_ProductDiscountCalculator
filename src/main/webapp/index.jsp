<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
  <h1>Product Discount Calculator</h1>
    <form action="/DiscountServlet" method="post">
        <div>
            <input type="text" name="Description" placeholder="Description"> <br> <br>
            <input type="text" name="price" placeholder="Price"> <br> <br>
            <input type="text" name="percent" placeholder="Percent"> <br> <br>
            <input type="submit" value="submit">
        </div>
    </form>
</body>
</html>