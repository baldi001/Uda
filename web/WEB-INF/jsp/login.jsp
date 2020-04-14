
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
        <title>Employee Registration Form</title>
 
 
</head>
 
<body>
 
    <h2>Registration Form</h2>
  
    <form:form method="GET" action="checkLogin" modelAttribute="utente">
        <table>
            <tr>
                <td><label for="username">Username: </label> </td>
                <td><form:input path="username" id="username"/></td>
            </tr>
         
     
            <tr>
                <td><label for="password">Password: </label> </td>
                <td><form:input path="pass" id="pass"/></td>
            </tr>
     
     
            <tr>
                <td colspan="2">
                            <input type="submit" value="Register"/>
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>