<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="ContributionBean" scope="page" class="class_diagram_orm.ContributionProcessor" />
<jsp:setProperty name="ContributionBean" property="*" />
<% String result = ContributionBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ContributionList.jsp';
		return true;
	}
// -->
</script>
<head><title>Contribution</title>
</head>
<body>
<h1>Contribution</h1>
<form method="POST" name="form1" action=Contribution.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ContributionBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Montant_contribution : </td>
			<td><input type=text name="montant_contribution" value="<jsp:getProperty name="ContributionBean" property="montant_contribution"/>" /></td>
		</tr>
		<tr>
			<td>Date_contribution : </td>
			<td><input type=text name="date_contribution" value="<jsp:getProperty name="ContributionBean" property="date_contribution"/>" /></td>
		</tr>
		<tr>
			<td>Type_contribution : </td>
			<td><input type=text name="type_contribution" value="<jsp:getProperty name="ContributionBean" property="type_contribution"/>" /></td>
		</tr>
		<tr>
			<td>Contributeur_contributeurID : </td>
			<td><input type=text name="contributeur_contributeurID" value="<jsp:getProperty name="ContributionBean" property="contributeur_contributeurID"/>" /></td>
		</tr>
		<tr>
			<td>Projet_projetID : </td>
			<td><input type=text name="projet_projetID" value="<jsp:getProperty name="ContributionBean" property="projet_projetID"/>" /></td>
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
