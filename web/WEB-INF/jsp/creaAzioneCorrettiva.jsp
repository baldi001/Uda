<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CREAZIONE AZIONE CORRETTIVA</title>
    </head>
    <body>
        <h2>Crea l'azione correttiva</h2>
        <form:form style="margin-left: 39%;" method="GET" action="doCreazioneAzione" modelAttribute="azionec"> 
        <table>        
            <tr style="height: 60px;">
                <td><label for="idAzione" style="font-size: 22px;">Id dell'azione:</label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="idAzione" id="idAzione"/></td>
            </tr>    
            <tr style="height: 60px;">
                <td><label for="costo" style="font-size: 22px;">Costo: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="costo" id="costo"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label for="data" style="font-size: 22px;">Data: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="data" id="data"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td><label for="segnalazione" style="font-size: 22px;">Id della Segnalazione: </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="segnalazione"  id="segnalazione"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="team">Inserisci il team:  </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="team" id="team"/></td>
            </tr>
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                    <button style="width: 150px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input style="width: 150px;height: 38px; font-size: 17px;" type="submit" value="Crea l'azione correttiva"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
