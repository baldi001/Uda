<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERISCI SEGNALAZIONE</title>
        <style type="text/css">
            #utente:hover{
                background-color: #ececec;
            }
        
            #azioneCorrettiva:hover{
                background-color: #ececec;
            }

        
            #bottone:hover{
                background-color: #ececec;
            }   
        
    </style>
    </head>
    <body style="background-color: #a0dbff;">
        <h2 style="text-align: center; margin-top: 26px;margin-left: 55px;font-size: 50px;">Fai Verificare Un'Azione Correttiva</h2>
        <form:form style="margin-left: 27%;" method="GET" action="verificaAzione2" modelAttribute="azionedaveri"> 
        <table>          
            <tr style="height: 60px;">
                <td style="text-align: end;"><label for="utente" style="font-size: 22px;">Inserisci l'username dell'utente che deve verificare: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="utente" id="utente"/></td>
            </tr>
            <tr style="height: 60px;">
                <td style="text-align: end;"><label style="font-size: 22px;" for="azioneCorrettiva">Inserisci l'id dell'azione correttiva da verificare: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="azioneCorrettiva" id="azioneCorrettiva"/></td>
            </tr>
            <tr style="text-align: center; height: 110px;">
                <td colspan="2">
                    <button id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="submit" value="Fai verificare"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
