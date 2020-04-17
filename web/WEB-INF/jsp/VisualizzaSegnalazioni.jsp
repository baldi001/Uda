<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista AzioniCorrettive Utente</title>
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
</head>
 
 
<body style="background-color: #a0dbff;">
    <h2 style="text-align: center; margin-top: 40px;font-size: 50px;">Lista Segnalazioni</h2>  
    <table style="text-align: center;margin-left: 25.2%;width: 50%;border: 1px solid black;"> 
        <tr style="height:30px; background-color:#ececec ">
            <th style="width:16.6%;">IdSegnalazione</th>
            <th style="width:16.6%;">Data</th>
            <th style="width:16.6%;">Tipo</th>
            <th style="width:16.6%;">Descrizione</th>
            <th style="width:16.6%;">Utente</th>
            <th style="width:16.6%;"></th>
	</tr>
	<c:forEach items="${listaSegnalazioni}" var="a">
		<tr style="height:40px;">
			<td>${a.idSegnalazione}</td>
			<td>${a.data}</td>
			<td>${a.tipo}</td>
                        <td>${a.descrizione}</td>
                        <td>${a.utente.getUsername()}</td>
                        <td><a href="<c:url value='/creazioneAzioneCorrettiva'/>">Crea Azione Correttiva</a></td>
		</tr>
	</c:forEach>
    </table>
    <button id="bottone" style="width: 150px;height: 40px;margin-top: 65px;font-size: 15px;text-align: center;margin-left: 46%;font-size: 17px;border-radius: 30px;border: 1px solid #7b7b7b;" type="button" onclick="javascript:history.back()">Torna al menù</button>
</body>
</html>