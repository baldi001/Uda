
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
    <style type="text/css">
        #pass:hover{
            background-color: #ececec;
        }
        
        #username:hover{
            background-color: #ececec;
        }
        
        #bottone:hover{
            background-color: #ececec;
        }
        
    </style>
        <title>LOGIN</title>
 
 
</head>
 
<body style="background-color: #a0dbff;">

    <h2 style="text-align: center; margin-top: 26px;font-size: 50px;">Effettua il login!</h2>
  
    <form:form method="GET" action="checkLogin" modelAttribute="utente" style="margin-left: 39%;">
        <table>
            <tr>
                <td><label style="font-size: 22px;" for="username">Username: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" type="name" path="username" id="username"/></td>
            </tr>
         
     
            <tr style="height: 60px; text-align: end;">
                <td><label style="font-size: 22px;" for="password">Password: </label> </td>
                <td><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" type="password" path="pass" id="pass"/></td>
            </tr>
     
     
            <tr style="text-align: center; height: 110px;">
                <td colspan="2">
                            <input id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px; border: 1px solid #7b7b7b;" type="submit" value="Accedi"/>
                </td>
            </tr>
        </table>
    </form:form>
    <p style="text-align: center;margin-left: 36px;margin-right: 21px;"> Non sei ancora registrato? <a href="<c:url value='/goRegister' />">Registrati qui!</a> </p>
</body>
</html>