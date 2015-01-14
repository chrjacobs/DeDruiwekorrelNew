/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Services.WijnServices;
import ViewModels.LijstWijnenViewModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Christel
 */
@WebServlet(name = "WijnController", urlPatterns = {"/WijnController"})
public class WijnController extends HttpServlet {

   private String qString;
    private String land;
    private String landstreek;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("WijnController");
        land = (request.getParameter("land"));
        landstreek = (request.getParameter("landstreek"));
        System.out.println("land : " + land + " landstreek : " + landstreek);
        response.setContentType("text/html;charset=UTF-8");

        qString = "";

        if (land != null) {
            System.out.println("land niet null " + land);
            qString = "land = \"" + land + "\"";
        }
        if (landstreek != null) {
            System.out.println("landstreek niet null " + landstreek);
            if (!"".equals(qString)) {
                qString = qString + " and ";
            }
            qString = qString + "landstreek = \"" + landstreek + "\"";
       }

        if ("".equals(qString)) {
            qString = "from Wijntbl";
        } else {
            qString = "from Wijntbl where " + qString;
        }

        System.out.println(
                "qString : " + qString);
        LijstWijnenViewModel vm
                = new LijstWijnenViewModel(
                        WijnServices.GetAllWijnen2(qString));

        System.out.println(
                "na getallwijnen");

        HttpSession session = request.getSession();

        session.setAttribute(
                "ViewModel", vm);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("lijstWijnen.jsp");

        dispatcher.forward(request, response);
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
