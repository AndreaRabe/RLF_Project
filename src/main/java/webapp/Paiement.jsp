<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="PaiementBean" scope="page" class="class_diagram_orm.PaiementProcessor" />
<jsp:setProperty name="PaiementBean" property="*" />
<% String result = PaiementBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PaiementList.jsp';
		return true;
	}
// -->
</script>
<head><title>Paiement</title>
</head>
<body>
<h1>Paiement</h1>
<form method="POST" name="form1" action=Paiement.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="PaiementBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Montant_paiement : </td>
			<td><input type=text name="montant_paiement" value="<jsp:getProperty name="PaiementBean" property="montant_paiement"/>" /></td>
		</tr>
		<tr>
			<td>Date_paiement : </td>
			<td><input type=text name="date_paiement" value="<jsp:getProperty name="PaiementBean" property="date_paiement"/>" /></td>
		</tr>
		<tr>
			<td>Methode_paiement : </td>
			<td><input type=text name="methode_paiement" value="<jsp:getProperty name="PaiementBean" property="methode_paiement"/>" /></td>
		</tr>
		<tr>
			<td>Status_paiement : </td>
			<td><input type=text name="status_paiement" value="<jsp:getProperty name="PaiementBean" property="status_paiement"/>" /></td>
		</tr>
		<tr>
			<td>Contribution_contributionID : </td>
			<td><input type=text name="contribution_contributionID" value="<jsp:getProperty name="PaiementBean" property="contribution_contributionID"/>" /></td>
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
