<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!" -->
<!-- Licensee: License Type: Purchased -->
<html lang="en">
  <jsp:useBean id="ContributionBean" scope="page" class="class_diagram_orm.ContributionProcessor" />
  <jsp:setProperty name="ContributionBean" property="*" />
  <% String result = ContributionBean.process(); %>
  
  <!-- Récupération des contributeurs existants -->
  <jsp:useBean id="ContributeurBean" scope="page" class="class_diagram_orm.ContributeurProcessor" />
  <% 
    class_diagram_orm.Contributeur[] contributeurs = class_diagram_orm.Contributeur.listContributeurByQuery(null, null);
  %>
  
  <!-- Récupération des projets existants -->
  <jsp:useBean id="ProjetBean" scope="page" class="class_diagram_orm.ProjetProcessor" />
  <% 
    class_diagram_orm.Projet[] projets = class_diagram_orm.Projet.listProjetByQuery(null, null);
  %>

  <head>
    <title>Contribution</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
  </head>
  <body class="min-h-screen bg-gray-100 flex flex-col items-center justify-start p-8">
    <!-- Navbar -->
    <nav class="w-full flex justify-center mb-8">
      <h1 class="text-4xl text-[#213448] font-bold">Contribution</h1>
    </nav>
    <!-- Formulaire -->
    <form method="POST" name="form1" action="Contribution.jsp" class="bg-white p-8 rounded-lg shadow-md w-full max-w-md space-y-6">
      <div class="flex flex-col">
        <label class="text-gray-700 mb-2">ID :</label>
        <input readonly type="text" name="ID" value="<jsp:getProperty name='ContributionBean' property='ID'/>" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400" />
      </div>
      <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Montant contribution :</label>
        <input type="number" name="montant_contribution" value="<jsp:getProperty name='ContributionBean' property='montant_contribution'/>" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400" />
      </div>
      <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Date contribution :</label>
        <input type="date" name="date_contribution" value="<jsp:getProperty name='ContributionBean' property='date_contribution'/>" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400" />
      </div>
	  <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Type contribution :</label>
        <select name="type_contribution" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400">
          <option value="">-- Type de contribution --</option>
          <option value="don" <%= "don".equals(ContributionBean.getType_contribution()) ? "selected" : "" %>>Don</option>
          <option value="financement" <%= "financement".equals(ContributionBean.getType_contribution()) ? "selected" : "" %>>Financement</option>
        </select>
      </div>
      <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Contributeur :</label>
        <select name="contributeur_contributeurID" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400">
          <option value="">-- Selectionnez un contributeur --</option>
          <%
            if (contributeurs != null) {
              for (int i = 0; i < contributeurs.length; i++) {
                out.print("<option value=\"" + contributeurs[i].getORMID() + "\"");
                if (contributeurs[i].getORMID() == ContributionBean.getContributeur_contributeurID()) {
                  out.print(" selected");
                }
                out.print(">");
                out.print(contributeurs[i].getNom() + " " + contributeurs[i].getPrenom());
                out.print("</option>");
              }
            }
          %>
        </select>
      </div>
      <div class="flex flex-col">
        <label class="text-gray-700 mb-2">Projet :</label>
        <select name="projet_projetID" class="border rounded px-4 py-2 focus:outline-none focus:ring-2 focus:ring-blue-400">
          <option value="">-- Selectionnez un projet --</option>
          <%
            if (projets != null) {
              for (int i = 0; i < projets.length; i++) {
                out.print("<option value=\"" + projets[i].getORMID() + "\"");
                if (projets[i].getORMID() == ContributionBean.getProjet_projetID()) {
                  out.print(" selected");
                }
                out.print(">");
                out.print(projets[i].getTitre());
                out.print("</option>");
              }
            }
          %>
        </select>
      </div>
      <input type="hidden" name="action" value="" />
      <div class="flex flex-wrap justify-center gap-4 mt-6">
        <!-- Boutons avec Iconify -->
        <button type="button" onclick="return listAll();" class="flex items-center gap-2 bg-blue-500 hover:bg-blue-600 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:format-list-bulleted"></iconify-icon>
          Lister
        </button>
        <button type="button" onclick="return perform('search');" class="flex items-center gap-2 bg-green-500 hover:bg-green-600 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:magnify"></iconify-icon>
          Rechercher
        </button>
        <button type="button" onclick="return perform('insert');" class="flex items-center gap-2 bg-purple-500 hover:bg-purple-600 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:plus-box"></iconify-icon>
          Ajouter
        </button>
        <button type="button" onclick="return perform('update');" class="flex items-center gap-2 bg-yellow-500 hover:bg-yellow-600 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:content-save-edit"></iconify-icon>
          Modifier
        </button>
        <button type="button" onclick="return perform('delete');" class="flex items-center gap-2 bg-red-500 hover:bg-red-600 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:delete"></iconify-icon>
          Supprimer
        </button>
        <button type="reset" class="flex items-center gap-2 bg-gray-400 hover:bg-gray-500 text-white font-semibold py-2 px-4 rounded">
          <iconify-icon icon="mdi:restore"></iconify-icon>
          Reinitialiser
        </button>
      </div>
    </form>
    <hr class="w-full my-8" />
    <!-- Résultat -->
    <div class="bg-white p-6 rounded shadow-md w-full max-w-2xl text-center">
      <h3 class="text-lg font-bold text-gray-700 mb-2">Resultat :</h3>
      <p class="text-gray-600"><%= result %></p>
    </div>
    <!-- Scripts -->
    <script>
      function perform(command) {
        form1.action.value = command;
        form1.submit();
        return true;
      }
      function listAll() {
        window.location.href = "ContributionList.jsp";
        return true;
      }
    </script>
  </body>
</html>