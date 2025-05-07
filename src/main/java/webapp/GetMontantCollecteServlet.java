package webapp;

import class_diagram_orm.Projet;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GetMontantCollecteServlet")
public class GetMontantCollecteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String projetIdStr = request.getParameter("projetId");
        int montantCollecte = 0;
        try {
            if (projetIdStr != null && !projetIdStr.isEmpty()) {
                int projetId = Integer.parseInt(projetIdStr);
                Projet projet = Projet.loadProjetByORMID(projetId);
                if (projet != null) {
                    montantCollecte = projet.getMontant_collecte();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject json = new JSONObject();
        json.put("montantCollecte", montantCollecte);
        response.setContentType("application/json");
        response.getWriter().write(json.toString());
    }
}