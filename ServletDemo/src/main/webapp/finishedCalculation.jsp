<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Completed Calculation</title>
</head>
<body>
<p>The total of your calculation is: ${finishedCalculation.getNum1()} ${finishedCalculation.getOperation()} ${finishedCalculation.getNum2()} = ${finishedCalculation.getTotal()} <br>
<a href="index.jsp">Perform another calculation <br></a>
<a href ="prompt.jsp"> Main page</a>
</p>
</body>
</body>
</html>