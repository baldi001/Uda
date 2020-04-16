<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERISCI SEGNALAZIONE</title>
    </head>
    <body>
        <h2>Inserisci qui la tua segnalazione!</h2>
        <form:form style="margin-left: 39%;" method="GET" action="doSegnalazione" modelAttribute="segnalazione"> 
        <table>        
            <tr style="height: 60px;">
                <td><label for="idSegnalazione" style="font-size: 22px;">Id della segnalazione: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="idSegnalazione" id="idSegnalazione"/></td>
            </tr>    
            <tr style="height: 60px;">
                <td><label for="utente" style="font-size: 22px;">Il tuo nickname: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="utente" id="utente"/></td>
            </tr>
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
                <td><form:input style="width: 245px;height: 35px;" path="descrizione" id="descrizione"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="settore">Settore: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="settore" id="settore"/></td>
            </tr>
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                    <button style="width: 150px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input style="width: 150px;height: 38px; font-size: 17px;" type="submit" value="Aggiungi segnalazione"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
