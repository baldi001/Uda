<%-- 
    Document   : CreaSegnalazione
    Created on : 15-apr-2020, 23.10.15
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERISCI SEGNALAZIONE</title>
    </head>
    <body>
        <h2>Inserisci qui la tua segnalazione!</h2>
        <table>
            <form:form style="margin-left: 39%;" method="GET" action="doRSegnalazione" modelAttribute="segnalazione"> 
             <form:input type="hidden" path="idSegnalazione" id="idSegnalazione" value=""/>
            <tr style="height: 60px;">
                <td><label for="data" style="font-size: 22px;">Data: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="data" id="data"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td><label for="tipo" style="font-size: 22px;">Tipo: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="tipo"  id="tipo"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="descrizione">Descrizione: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" type="text" path="descrizione" id="descrizione"/></td>
            </tr>
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                    <button style="width: 150px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input style="width: 137px;height: 38px; font-size: 17px;" type="submit" value="Aggiungi segnalazione"/>
                </td>
            </tr>
        </table>
    </body>
</html>
