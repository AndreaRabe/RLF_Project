<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Projet List</title>
</head>
<body>
<center>
<h1>Projet List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Titre</td>
		<td>Description</td>
		<td>Objectif_financier</td>
		<td>Montant_collecte</td>
		<td>Date_debut</td>
		<td>Date_fin</td>
		<td>Visuels</td>
		<td>Status_projet</td>
		<td>Porteur(FK)</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Projet[] projets = class_diagram_orm.Projet.listProjetByQuery(null, null);
for(int i = 0; i < projets.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(projets[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(projets[i].getTitre());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDescription());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getObjectif_financier());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getMontant_collecte());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDate_debut());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getDate_fin());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getVisuels());
		out.println("</td>");
		out.print("<td>");
		out.print(projets[i].getStatus_projet());
		out.println("</td>");
		
		class_diagram_orm.Porteur porteur = projets[i].getPorteur();
		if(porteur != null) {
			out.print("<td>");
			out.print("<a href=\"Porteur.jsp?action=search&ID=");
			out.print(porteur.getORMID());
			out.print("\">");
			out.print(porteur.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Projet.jsp?action=search&ID=");
		out.print(projets[i].getORMID());
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
<a href="Projet.jsp">Add Projet</a>
</center>
</body>
</html>
