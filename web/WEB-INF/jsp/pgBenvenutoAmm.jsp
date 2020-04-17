<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menù</title>
        
       <style type="text/css">
        #bottone:hover{
            background-color: #ececec;
        }     
        </style> 
    </head>
    <body style="background-color: #a0dbff;">
        <div style="text-align: center;">
            <h1 style="text-align: center; margin-top: 40px;font-size: 50px;"> Benvenuto!</h1>
            <button id="bottone" style="width: 350px;height: 60px;margin-top: 85px;font-size: 20px;border-radius: 30px;border: 1px solid #7b7b7b;" type="button" onclick="window.location.href='listSegnalazioni'">Visualizza segnalazioni</button> 
            <br>
            <button id="bottone" style="width: 350px;height: 60px;margin-top: 60px;font-size: 20px;border-radius: 30px;border: 1px solid #7b7b7b;" type="button" onclick="window.location.href='verificaAzione1'">Fai verificare azione correttiva</button> 
            <br>
            <button id="bottone" style="width: 350px;height: 60px;margin-top: 60px;font-size: 20px;border-radius: 30px;border: 1px solid #7b7b7b;" type="button" onclick="window.location.href='/Uda/'">Logout</button>
        </div>
    </body>
</html>
