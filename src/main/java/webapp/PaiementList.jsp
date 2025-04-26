<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Paiement List</title>
</head>
<body>
<center>
<h1>Paiement List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Montant_paiement</td>
		<td>Date_paiement</td>
		<td>Methode_paiement</td>
		<td>Status_paiement</td>
		<td>Contribution(FK)</td>
		<td></td>
	</tr>
<%
class_diagram_orm.Paiement[] paiements = class_diagram_orm.Paiement.listPaiementByQuery(null, null);
for(int i = 0; i < paiements.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(paiements[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(paiements[i].getMontant_paiement());
		out.println("</td>");
		out.print("<td>");
		out.print(paiements[i].getDate_paiement());
		out.println("</td>");
		out.print("<td>");
		out.print(paiements[i].getMethode_paiement());
		out.println("</td>");
		out.print("<td>");
		out.print(paiements[i].getStatus_paiement());
		out.println("</td>");
		
		class_diagram_orm.Contribution contribution = paiements[i].getContribution();
		if(contribution != null) {
			out.print("<td>");
			out.print("<a href=\"Contribution.jsp?action=search&ID=");
			out.print(contribution.getORMID());
			out.print("\">");
			out.print(contribution.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Paiement.jsp?action=search&ID=");
		out.print(paiements[i].getORMID());
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
<a href="Paiement.jsp">Add Paiement</a>
</center>
</body>
</html>
