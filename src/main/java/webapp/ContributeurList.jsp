<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Contributeur List</title>
</head>
<body>
<center>
<h1>Contributeur List</h1>
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
class_diagram_orm.Contributeur[] contributeurs = class_diagram_orm.Contributeur.listContributeurByQuery(null, null);
for(int i = 0; i < contributeurs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(contributeurs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(contributeurs[i].getNom());
		out.println("</td>");
		out.print("<td>");
		out.print(contributeurs[i].getPrenom());
		out.println("</td>");
		out.print("<td>");
		out.print(contributeurs[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(contributeurs[i].getMots_passe());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Contributeur.jsp?action=search&ID=");
		out.print(contributeurs[i].getORMID());
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
<a href="Contributeur.jsp">Add Contributeur</a>
</center>
</body>
</html>
