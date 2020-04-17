<%-- 
    Document   : registrazione
    Created on : 14-apr-2020, 14.15.30
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRAZIONE</title>
        <style type="text/css">
            #pass:hover{
                background-color: #ececec;
            }
        
            #username:hover{
                background-color: #ececec;
            }
            
            #nome:hover{
                background-color: #ececec;
            }
            
            #cognome:hover{
                background-color: #ececec;
            }
        
            #bottone:hover{
                background-color: #ececec;
            }   
        
    </style>
    </head>
    <body style="background-color: #a0dbff;">
        <h2 style="text-align: center; margin-top: 26px;font-size: 50px;">Registrati qui!</h2>
        <form:form style="margin-left: 39%;" method="GET" action="doRegister" modelAttribute="utente"> 
             <form:input type="hidden" path="responsabile" id="responsabile" value="no"/>
            <table>
            <tr style="height: 60px;">
                <td style="text-align: end;"><label for="nome" style="font-size: 22px;">Nome: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="nome" id="nome"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td style="text-align: end;"><label for="cognome" style="font-size: 22px;">Cognome: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="cognome"  id="cognome"/></td>
            </tr>
            <tr style="height: 60px;">
                <td style="text-align: end;"><label style="font-size: 22px;" for="username">Username: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" path="username" id="username"/></td>
            </tr>
            <tr style="height: 60px;"> 
                <td style="text-align: end;"><label style="font-size: 22px;" for="pass">Password: </label> </td>
                <td style="padding-left: 20px;"><form:input style="padding-left:12px; width: 245px;height: 35px;border-radius: 10px;border: 1px solid #bdbdbd;" type="password" path="pass" id="pass"/></td>
            </tr>
            <tr style="text-align: center; height: 110px;">
                <td colspan="2">
                    <button id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="button" onclick="javascript:history.back()">Torna al Login</button>
                    <input id="bottone" style="width: 137px;height: 38px; font-size: 17px;border-radius: 25px;border: 1px solid #7b7b7b;" type="submit" value="Registrati"/>
                </td>
            </tr>
        </table>
        </form:form>
       
    </body>
</html>
