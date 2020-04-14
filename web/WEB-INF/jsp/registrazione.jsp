<%-- 
    Document   : registrazione
    Created on : 14-apr-2020, 14.15.30
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRAZIONE</title>
    </head>
    <body>
        <h2 style="text-align: center;">Registrati qui!</h2>
        <form:form style="margin-left: 39%;" method="POST" action="doRegister" modelAttribute="utente"> 
             <form:input type="hidden" path="responsabile" id="responsabile" value="no"/>
            <table>
            <tr style="height: 60px;">
                <td><label for="nome" style="font-size: 22px;">Nome: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="nome" id="nome"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td><label for="cognome" style="font-size: 22px;">Cognome: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="cognome"  id="cognome"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="username">Username: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="username" id="username"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td><label style="font-size: 22px;" for="pass">Password: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="pass" id="pass"/></td>
            </tr>
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                    <input style="width: 137px;height: 38px; font-size: 17px;" type="submit" value="Registrati"/>
                </td>
            </tr>
        </table>
        </form:form>
    </body>
</html>
