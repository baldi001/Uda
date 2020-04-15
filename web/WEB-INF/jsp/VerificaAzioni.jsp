<%-- 
    Document   : azioniDaFare
    Created on : 14-apr-2020, 19.46.02
    Author     : favaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista AzioniCorrettive Utente</title>
</head>
 
 
<body>
    <h2>Azioni da verificare</h2>  
    <table>
        <tr>
            <th width="120">IdVerifica</th>
            <th width="80">AzioneCorrettiva</th>
	</tr>
	<c:forEach items="${listaVerificaAzioni}" var="a">
		<tr>
			<td>${a.idVerifica}</td>
			<td>${a.azioneCorrettiva.getIdAzione()}</td>
                        <td><a href="<c:url value='/removeAzioneCorrettiva/${a.idVerifica}'/>">Verifica</a></td>

		</tr>
	</c:forEach>
	</table>
    <button style="width: 150px;height: 40px;margin-top: 20px;font-size: 15px;" type="button" onclick="javascript:history.back()">Torna al menù</button>
</body>
</html>