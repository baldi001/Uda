<%-- 
    Document   : azioniDaFare
    Created on : 14-apr-2020, 19.46.02
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style type="text/css">
        table {
            border-collapse: collapse;
            background-color: white; 
        }

        table, th, td {
            border: 1px solid black;
        }
        #bottone:hover{
                background-color: #ececec;
        }     
    </style>
    <title>Lista Azioni Correttive Utente</title>
</head>
 
 
<body style="background-color: #a0dbff;">
    <h2 style="text-align: center; margin-top: 40px;font-size: 50px;">Azioni da eseguire</h2>  
    <table style="text-align: center;margin-left: 25.2%;width: 50%;border: 1px solid black;">
        <tr style="height:30px; background-color:#ececec ">
            <th style="width:25%;">IdAzione</th>
            <th style="width:25%;">Costo</th>
            <th style="width:25%;">Data</th>
            <th style="width:25%;">Segnalazione</th>
	</tr>
	<c:forEach items="${listaAzioni}" var="a">
            <tr style="height:40px;">
			<td>${a.idAzione}</td>
			<td>${a.costo}</td>
			<td>${a.data}</td>
                        <td>${a.segnalazione.getDescrizione()}</td>
            </tr>
	</c:forEach>
    </table>
    <button id="bottone" style="width: 150px;height: 40px;margin-top: 65px;font-size: 15px;text-align: center;margin-left: 46%;font-size: 17px;border-radius: 30px;border: 1px solid #7b7b7b;" type="button" onclick="javascript:history.back()">Torna al menù</button>
</body>
</html>