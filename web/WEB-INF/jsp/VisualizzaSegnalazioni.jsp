<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista AzioniCorrettive Utente</title>
</head>
 
 
<body>
    <h2>Lista Segnalazioni</h2>  
    <table>
        <tr>
            <th width="120">IdSegnalazione</th>
            <th width="80">Data</th>
            <th width="60">Tipo</th>
            <th width="60">Descrizione</th>
            <th width="60">Utente</th>
	</tr>
	<c:forEach items="${listaSegnalazioni}" var="a">
		<tr>
			<td>${a.idSegnalazione}</td>
			<td>${a.data}</td>
			<td>${a.tipo}</td>
                        <td>${a.descrizione}</td>
                        <td>${a.utente.getUsername()}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>