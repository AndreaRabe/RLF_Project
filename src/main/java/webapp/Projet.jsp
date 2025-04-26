<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="ProjetBean" scope="page" class="class_diagram_orm.ProjetProcessor" />
<jsp:setProperty name="ProjetBean" property="*" />
<% String result = ProjetBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProjetList.jsp';
		return true;
	}
// -->
</script>
<head><title>Projet</title>
</head>
<body>
<h1>Projet</h1>
<form method="POST" name="form1" action=Projet.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ProjetBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Titre : </td>
			<td><input type=text name="titre" value="<jsp:getProperty name="ProjetBean" property="titre"/>" /></td>
		</tr>
		<tr>
			<td>Description : </td>
			<td><input type=text name="description" value="<jsp:getProperty name="ProjetBean" property="description"/>" /></td>
		</tr>
		<tr>
			<td>Objectif_financier : </td>
			<td><input type=text name="objectif_financier" value="<jsp:getProperty name="ProjetBean" property="objectif_financier"/>" /></td>
		</tr>
		<tr>
			<td>Montant_collecte : </td>
			<td><input type=text name="montant_collecte" value="<jsp:getProperty name="ProjetBean" property="montant_collecte"/>" /></td>
		</tr>
		<tr>
			<td>Date_debut : </td>
			<td><input type=text name="date_debut" value="<jsp:getProperty name="ProjetBean" property="date_debut"/>" /></td>
		</tr>
		<tr>
			<td>Date_fin : </td>
			<td><input type=text name="date_fin" value="<jsp:getProperty name="ProjetBean" property="date_fin"/>" /></td>
		</tr>
		<tr>
			<td>Visuels : </td>
			<td><input type=text name="visuels" value="<jsp:getProperty name="ProjetBean" property="visuels"/>" /></td>
		</tr>
		<tr>
			<td>Status_projet : </td>
			<td><input type=text name="status_projet" value="<jsp:getProperty name="ProjetBean" property="status_projet"/>" /></td>
		</tr>
		<tr>
			<td>Porteur_porteurID : </td>
			<td><input type=text name="porteur_porteurID" value="<jsp:getProperty name="ProjetBean" property="porteur_porteurID"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
