<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Purchased-->
<html>
<head><title>Liste des Paiements</title>
	<script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
</head>
<body class="bg-[url(./assets/bg3.jpg)] bg-cover bg-no-repeat bg-center bg-fixed">
	<navbar class="flex justify-center items-center">
		<h1 class="flex m-4 text-4xl text-[#213448] font-bold">Listes des Paiements</h1>
	</navbar>
<div class="flex flex-col items-center justify-center">

<table class="w-4/5 mt-4 text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
	<thead
	class="text-xs text-gray-700 uppercase bg-gray-50 dark:bg-gray-700 dark:text-gray-400"
  >
	<tr>
		<th scope="col" class="px-6 py-3">ID(PK)</th>
		<th scope="col" class="px-6 py-3">Montant_paiement</th>
		<th scope="col" class="px-6 py-3">Date_paiement</th>
		<th scope="col" class="px-6 py-3">Methode_paiement</th>
		<th scope="col" class="px-6 py-3">Status_paiement</th>
		<th scope="col" class="px-6 py-3">Contribution(FK)</th>
		<th scope="col" class="px-6 py-3"></th>
	</tr>
</thead>
<tbody>
<%
class_diagram_orm.Paiement[] paiements = class_diagram_orm.Paiement.listPaiementByQuery(null, null);
for(int i = 0; i < paiements.length; i++) {
		out.print("<tr class=\"bg-white border-b dark:bg-gray-800 dark:border-gray-700 border-gray-200 hover:bg-gray-50 dark:hover:bg-gray-600\">");
		out.print("<th scope=\"row\" " +
		"class=\"px-6 py-4 font-medium text-gray-900 whitespace-nowrap dark:text-white\">");
		out.print(paiements[i].getORMID());
		out.print("</th>");
		out.print("<td class=\"px-6 py-4\">");
		out.print(paiements[i].getMontant_paiement());
		out.println("</td>");
		out.print("<td class=\"px-6 py-4\">");
		out.print(paiements[i].getDate_paiement());
		out.println("</td>");
		out.print("<td class=\"px-6 py-4\">");
		out.print(paiements[i].getMethode_paiement());
		out.println("</td>");
		out.print("<td class=\"px-6 py-4\">");
		out.print(paiements[i].getStatus_paiement());
		out.println("</td>");
		
		class_diagram_orm.Contribution contribution = paiements[i].getContribution();
		if(contribution != null) {
			out.print("<td class=\"px-6 py-4\">");
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
		
		out.print("<td class=\"flex flex-row gap-2 justify-center items-center px-6 py-4\">");
		out.print("<iconify-icon icon=\"line-md:edit-filled\" class=\"text-lg text-green-400\"></iconify-icon>");
		out.print("</iconify-icon>");
		out.print("<a class=\"text-blue-400 text-4\" " + "href=\"Paiement.jsp?action=search&ID=");
		out.print(paiements[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</tbody>
</table><br>
<div class="flex flex-row gap-4">
	<button>
		<a class="text-white bg-gradient-to-r from-blue-500 via-blue-600 to-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-md px-5 py-2.5 me-2 mb-2 dark:bg-blue-600 dark:hover:bg-blue-700 focus:outline-none dark:focus:ring-blue-800" href="index.html">Home</a>
	</button>
	 <!-- | 
	 <button>
		 <a href="Utilisateur.jsp">Add Utilisateur</a>
	 </button>  -->
</div>
</div>
</body>
</html>
