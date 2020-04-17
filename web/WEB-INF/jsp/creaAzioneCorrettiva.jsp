<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CREAZIONE AZIONE CORRETTIVA</title>
        <style type="text/css">
            #costo:hover{
                background-color: #ececec;
            }
        
            #data:hover{
                background-color: #ececec;
            }
            
            #descrizione:hover{
                background-color: #ececec;
            }
            
            #team:hover{
                background-color: #ececec;
            }
        
            #bottone:hover{
                background-color: #ececec;
            }   
        
    </style>
    </head>
    <body style="background-color: #a0dbff;">
        <h2 style="text-align: center; margin-top: 26px;font-size: 50px;">Crea l'azione correttiva</h2>
        <form:form style="margin-left: 39%;" method="GET" action="doCreazioneAzione" modelAttribute="azionec"> 
        <table>            
            <tr style="height: 60px;">
                <td style="text-align: end;"><label for="costo" style="font-size: 22px;">Costo: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="costo" id="costo"/></td>
            </tr>
            <tr style="height: 60px;">
                <td style="text-align: end;"> <label for="data" style="font-size: 22px;">Data: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="data" id="data"/></td>
            </tr>
            <tr style="height: 60px;">
                <td style="text-align: end;"><label style="font-size: 22px;" for="team">Inserisci il team:  </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="team" id="team"/></td>
            </tr>
            <tr style="text-align: center; height: 110px;">
                <td colspan="2">
                    <button id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="button" onclick="javascript:history.back()">Torna al Menù</button>
                    <input id="bottone" style="width: 199px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="submit" value="Crea l'azione correttiva"/>
                </td>
            </tr>
        </table>
    </form:form>
    </body>
</html>
