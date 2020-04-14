
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
        <title>LOGIN</title>
 
 
</head>
 
<body>
 
    <h2 style="text-align: center;">Effettua il login!</h2>
  
    <form:form method="GET" action="checkLogin" modelAttribute="utente" style="margin-left: 41%;">
        <table>
            <tr>
                <td><label style="font-size: 22px;" for="username">Username: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" type="name" path="username" id="username"/></td>
            </tr>
         
     
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="password">Password: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" type="password" path="pass" id="pass"/></td>
            </tr>
     
     
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                            <input style="width: 137px;height: 38px; font-size: 17px;" type="submit" value="Accedi"/>
                </td>
            </tr>
        </table>
    </form:form>
    <p style="text-align: center;margin-left: 36px;"> Non sei ancora registrato? <a href="<c:url value='/goRegister' />">Registrati!</a> </p>
</body>
</html>