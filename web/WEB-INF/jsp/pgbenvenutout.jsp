<%-- 
    Document   : pgbenvenutout
    Created on : 14-apr-2020, 15.40.45
    Author     : favaron
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.xdevapi.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menù</title>
    </head>
    <body>

        <div style="text-align: center;">
            <h1 style="margin-top: 40px;font-size: 60px;"> Benvenuto!</h1>

        <h1> Menù Utente </h1>
            <button style="width: 280px;height: 40px;margin-top: 85px;font-size: 15px;" type="button" onclick="window.location.href='goRegister'">Segnala un problema</button> 
            <br>
            <button style="width: 280px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="window.location.href='listDoAzioni'">Lista azioni correttive da compiere</button> 
            <br>
            <button style="width: 280px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="window.location.href=''">Lista azioni correttive da verificare</button> 
        </div>
    </body>
</html>
