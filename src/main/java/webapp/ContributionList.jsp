<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Contribution List</title>
</head>
<body>
<center>
<h1>Contribution List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Montant_contribution</td>
		<td>Date_contribution</td>
		<td>Type_contribution</td>
		<td>Contributeur(FK)</td>
		<td>Projet(FK)</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Contribution[] contributions = class_diagram_orm.Contribution.listContributionByQuery(null, null);
for(int i = 0; i < contributions.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(contributions[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(contributions[i].getMontant_contribution());
		out.println("</td>");
		out.print("<td>");
		out.print(contributions[i].getDate_contribution());
		out.println("</td>");
		out.print("<td>");
		out.print(contributions[i].getType_contribution());
		out.println("</td>");
		
		class_diagram_orm.Contributeur contributeur = contributions[i].getContributeur();
		if(contributeur != null) {
			out.print("<td>");
			out.print("<a href=\"Contributeur.jsp?action=search&ID=");
			out.print(contributeur.getORMID());
			out.print("\">");
			out.print(contributeur.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		class_diagram_orm.Projet projet = contributions[i].getProjet();
		if(projet != null) {
			out.print("<td>");
			out.print("<a href=\"Projet.jsp?action=search&ID=");
			out.print(projet.getORMID());
			out.print("\">");
			out.print(projet.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		

		
		out.print("<td>");
		out.print("<a href=\"Contribution.jsp?action=search&ID=");
		out.print(contributions[i].getORMID());
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
<a href="Contribution.jsp">Add Contribution</a>
</center>
</body>
</html>
