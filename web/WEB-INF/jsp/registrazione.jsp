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
        <h2>Registrati qui!</h2>
        <form:form method="POST" action="doRegister" modelAttribute="utente">
             <form:input type="hidden" path="responsabile" id="responsabile" value="no"/>
            <table>
            <tr>
                <td><label for="nome">Nome: </label> </td>
                <td><form:input path="nome" id="nome"/></td>
            </tr>
            <tr>
                <td><label for="cognome">Cognome: </label> </td>
                <td><form:input path="cognome"  id="cognome"/></td>
            </tr>
            <tr>
                <td><label for="username">Username: </label> </td>
                <td><form:input path="username" id="username"/></td>
            </tr>
            <tr>
                <td><label for="pass">Password: </label> </td>
                <td><form:input path="pass" id="pass"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Registrati"/>
                </td>
            </tr>
        </table>
        </form:form>
    </body>
</html>
