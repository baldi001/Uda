<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERISCI SEGNALAZIONE</title>
    </head>
    <body>
        <h2>Fai Verificare Un'Azione Correttiva</h2>
        <form:form style="margin-left: 39%;" method="GET" action="verificaAzione2" modelAttribute="azionedaveri"> 
        <table>        
            <tr style="height: 60px;">
                <td><label for="idVerifica" style="font-size: 22px;">Id dell'azione </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="idVerifica" id="idVerifica"/></td>
            </tr>    
            <tr style="height: 60px;">
                <td><label for="utente" style="font-size: 22px;">Inserisci l'username dell'utente che deve verificare </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="utente" id="utente"/></td>
            </tr>
            <tr style="height: 60px;">
                <td><label style="font-size: 22px;" for="settore">Inserisci l'id dell'azione correttiva da verificare </label> </td>
                <td><form:input style="width: 245px;height: 35px;" path="azioneCorrettiva" id="azioneCorrettiva"/></td>
            </tr>
            <tr style="text-align: center; height: 75px;">
                <td colspan="2">
                    <button style="width: 150px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input style="width: 150px;height: 38px; font-size: 17px;" type="submit" value="Fai verificare"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
