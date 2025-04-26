<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Administrateur List</title>
</head>
<body>
<center>
<h1>Administrateur List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nom</td>
		<td>Prenom</td>
		<td>Email</td>
		<td>Mots_passe</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Administrateur[] administrateurs = class_diagram_orm.Administrateur.listAdministrateurByQuery(null, null);
for(int i = 0; i < administrateurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(administrateurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(administrateurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(administrateurs[i].getPrenom());
		out.println("</td>");
		out.print("<td>");
		out.print(administrateurs[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(administrateurs[i].getMots_passe());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Administrateur.jsp?action=search&ID=");
		out.print(administrateurs[i].getORMID());
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
<a href="Administrateur.jsp">Add Administrateur</a>
</center>
</body>
</html>
