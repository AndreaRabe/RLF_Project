<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!" -->
<!-- Licensee: License Type: Purchased -->
<html lang="en">
<jsp:useBean id="PaiementBean" scope="page" class="class_diagram_orm.PaiementProcessor"/>
<jsp:setProperty name="PaiementBean" property="*"/>
<% String result = PaiementBean.process();
    if ("insert".equals(request.getParameter("action")) && result.contains("Insert success")) {
        response.sendRedirect("ContributionList.jsp");
        return;
    }

    if ("delete".equals(request.getParameter("action"))) {
        response.sendRedirect("PaiementList.jsp");
        return;
    }

    String montantParam = request.getParameter("montantContribution");
    int montant = -1;
    if (montantParam != null) {
        try {
            montant = Integer.parseInt(montantParam);
            PaiementBean.setMontant_paiement(montant); // Optionnel : setter dans le bean
        } catch (NumberFormatException ignored) {
        }
    }
%>

<!-- Récupération des contributions existantes -->
<jsp:useBean id="ContributionBean" scope="page" class="class_diagram_orm.ContributionProcessor"/>
<%
    class_diagram_orm.Contribution[] contributions = class_diagram_orm.Contribution.listContributionByQuery(null, null);
%>

<head>
    <title>Paiement</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
</head>
<body class="min-h-screen bg-gray-100 flex flex-col items-center justify-start p-8">
<!-- Navbar -->
<nav class="w-full flex justify-center mb-8">
    <h1 class="text-4xl text-[#213448] font-bold">Paiement</h1>
</nav>
<!-- Formulaire -->
<form method="POST" name="form1" action="Paiement.jsp"
      class="bg-white p-8 rounded-lg shadow-md w-full max-w-md space-y-6">
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">ID :</label>
        <input readonly type="text" name="ID" value="<jsp:getProperty name='PaiementBean' property='ID'/>"
               class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400"/>
    </div>
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Montant paiement :</label>
        <input type="number" name="montant_paiement" min="0" readonly
               value="<%= montant != -1 ? montant : PaiementBean.getMontant_paiement() %>"
               class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400"/>
    </div>
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Date paiement :</label>
        <input type="date" readonly name="date_paiement" id="date_paiement"
               value="<jsp:getProperty name='PaiementBean' property='date_paiement'/>"
               class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400"/>
    </div>
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Methode paiement :</label>
        <select name="methode_paiement"
                class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400">
            <option value="">-- Selectionnez une methode --</option>
            <option value="carte_bancaire" <%= "carte_bancaire".equals(PaiementBean.getMethode_paiement()) ? "selected" : "" %>>
                Carte bancaire
            </option>
            <option value="virement" <%= "virement".equals(PaiementBean.getMethode_paiement()) ? "selected" : "" %>>
                Virement
            </option>
            <option value="paypal" <%= "paypal".equals(PaiementBean.getMethode_paiement()) ? "selected" : "" %>>PayPal
            </option>
        </select>
    </div>
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Statut paiement :</label>
        <select name="status_paiement"
                class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400">
            <option value="">-- Selectionnez un statut --</option>
            <option value="en_attente" <%= "en_attente".equals(PaiementBean.getStatus_paiement()) ? "selected" : "" %>>
                En attente
            </option>
            <option value="valide" <%= "valide".equals(PaiementBean.getStatus_paiement()) ? "selected" : "" %>>Valide
            </option>
            <option value="echec" <%= "echec".equals(PaiementBean.getStatus_paiement()) ? "selected" : "" %>>Echec
            </option>
        </select>
    </div>
    <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Contribution :</label>
        <%
            String lastContributionID = "";
            if (contributions != null && contributions.length > 0) {
                lastContributionID = String.valueOf(contributions[contributions.length - 1].getORMID());
            }
        %>
        <input type="text" name="contribution_contributionID"
               class="border rounded px-4 py-2 bg-gray-200 focus:outline-none focus:ring-2 focus:ring-blue-400"
               value="<%= lastContributionID %>" readonly/>
    </div>
    <input type="hidden" name="action" value=""/>
    <div class="flex flex-wrap justify-center gap-4 mt-6">
        <!-- Boutons avec Iconify -->
        <button type="button" onclick="return listAll();"
                class="flex items-center gap-2 bg-blue-500 hover:bg-blue-600 text-white font-semibold py-2 px-4 rounded">
            <iconify-icon icon="mdi:format-list-bulleted"></iconify-icon>
            Lister
        </button>
        <%--        <button type="button" onclick="return perform('search');"--%>
        <%--                class="flex items-center gap-2 bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-4 rounded">--%>
        <%--            <iconify-icon icon="mdi:magnify"></iconify-icon>--%>
        <%--            Rechercher--%>
        <%--        </button>--%>
        <button type="button" onclick="return perform('insert');"
                class="flex items-center gap-2 bg-purple-500 hover:bg-purple-600 text-white font-semibold py-2 px-4 rounded">
            <iconify-icon icon="mdi:plus-box"></iconify-icon>
            Ajouter
        </button>
        <button type="button" onclick="return perform('update');"
                class="flex items-center gap-2 bg-yellow-500 hover:bg-yellow-600 text-white font-semibold py-2 px-4 rounded">
            <iconify-icon icon="mdi:content-save-edit"></iconify-icon>
            Modifier
        </button>
        <button type="button" onclick="return perform('delete');"
                class="flex items-center gap-2 bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-4 rounded">
            <iconify-icon icon="mdi:delete"></iconify-icon>
            Supprimer
        </button>
        <button type="reset"
                class="flex items-center gap-2 bg-gray-400 hover:bg-gray-500 text-white font-semibold py-2 px-4 rounded">
            <iconify-icon icon="mdi:restore"></iconify-icon>
            Reinitialiser
        </button>
    </div>
</form>
<hr class="w-full my-8"/>
<!-- Résultat -->
<div class="bg-white p-6 rounded shadow-md w-full max-w-2xl text-center">
    <h3 class="text-lg font-bold text-gray-700 mb-2">Resultat :</h3>
    <p class="text-gray-600"><%= result %>
    </p>
</div>
<!-- Scripts -->
<script>
    function perform(command) {
        form1.action.value = command;
        form1.submit();
        return true;
    }

    function listAll() {
        window.location.href = "PaiementList.jsp";
        return true;
    }
</script>
<script>
    const input = document.getElementById('date_paiement');
    if (!input.value) {
        const today = new Date().toISOString().split('T')[0];
        input.value = today;
    }
</script>
</body>
</html>
