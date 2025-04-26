<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Porteur List</title>
</head>
<body>
<center>
<h1>Porteur List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Biographie</td>
		<td>Nom</td>
		<td>Prenom</td>
		<td>Email</td>
		<td>Mots_passe</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Porteur[] porteurs = class_diagram_orm.Porteur.listPorteurByQuery(null, null);
for(int i = 0; i < porteurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(porteurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(porteurs[i].getBiographie());
		out.println("</td>");
		out.print("<td>");
		out.print(porteurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(porteurs[i].getPrenom());
		out.println("</td>");
		out.print("<td>");
		out.print(porteurs[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(porteurs[i].getMots_passe());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Porteur.jsp?action=search&ID=");
		out.print(porteurs[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Porteur.jsp">Add Porteur</a>
</center>
</body>
</html>
