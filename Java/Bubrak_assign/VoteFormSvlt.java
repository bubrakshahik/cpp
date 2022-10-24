/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package PresentationLayer;

import BusinessLayer.ManageVoter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DataLayer.MyDBHelper;

/**
 *
 * @author Bubrak Sher
 */
public class VoteFormSvlt extends HttpServlet {
    private ManageVoter voterManager;
    private static boolean isSubmitted = false;
    
    /**
     *
     */
    @Override
    public void init() {
        MyDBHelper.PATH = getServletContext().getRealPath(File.separator);
        MyDBHelper.getObj();
        voterManager = ManageVoter.getObj();
    }
    
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
        response.setContentType("text/html;charset=UTF-8");
        
        if(isSubmitted == false){
            String stdId = request.getParameter("stdid");
            String selectedCandidate = request.getParameter("candidates");
            isSubmitted = voterManager.insertVoterData(stdId, selectedCandidate);
            sucessfullyCasted(request, response);
        }
        
        if(isSubmitted)
            alreadyCasted(request, response);
    }

    public void sucessfullyCasted(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Submit Application</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><table width=\"800\" border=\"1\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");
            out.println("<tr align=\"center\">");
            out.println("<td><h1>Your Vote Casted Sucessfully.</h1></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    public void alreadyCasted(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Submit Application</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><table width=\"800\" border=\"1\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");
            out.println("<tr align=\"center\">");
            out.println("<td><h1>You Already Casted the Vote!</h1></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
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
