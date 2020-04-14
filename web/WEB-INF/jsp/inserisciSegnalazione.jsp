<%-- 
    Document   : inserisciSegnalazione
    Created on : 14-apr-2020, 21.22.13
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERISCI SEGNALAZIONE</title>
    </head>
    <body>
        <h2>Inserisci qui la tua segnalazione!</h2>
        <form:form method="POST" action="doSegnalazione" modelAttribute="segnalazione"> 
        <form:input type="hidden" path="idSegnalazione" id="idSegnalazione" value=""/>
        <table>
            <tr>
                <td><label for="data">Data: </label> </td>
                <td><form:input  path="data" id="data"/></td>
            </tr>
            <tr>
                <td><label for="tipo">Tipo: </label> </td>
                <td><form:input  path="tipo" id="tipo"/></td>
            </tr>
            <tr>
                <td><label for="descrizione">Descrizione: </label> </td>
                <td><form:input  path="descrizione" id="descrizione"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Inserisci"/>
                </td>
            </tr>
        </table>
    </body>
</html>
