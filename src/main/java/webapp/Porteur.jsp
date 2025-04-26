<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<jsp:useBean id="PorteurBean" scope="page" class="class_diagram_orm.PorteurProcessor" />
<jsp:setProperty name="PorteurBean" property="*" />
<% String result = PorteurBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PorteurList.jsp';
		return true;
	}
// -->
</script>
<head><title>Porteur</title>
</head>
<body>
<h1>Porteur</h1>
<form method="POST" name="form1" action=Porteur.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="PorteurBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Biographie : </td>
			<td><input type=text name="biographie" value="<jsp:getProperty name="PorteurBean" property="biographie"/>" /></td>
		</tr>
		<tr>
			<td>Nom : </td>
			<td><input type=text name="nom" value="<jsp:getProperty name="PorteurBean" property="nom"/>" /></td>
		</tr>
		<tr>
			<td>Prenom : </td>
			<td><input type=text name="prenom" value="<jsp:getProperty name="PorteurBean" property="prenom"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="PorteurBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>Mots_passe : </td>
			<td><input type=text name="mots_passe" value="<jsp:getProperty name="PorteurBean" property="mots_passe"/>" /></td>
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
