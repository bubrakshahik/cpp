/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package PresentationLayer;

import BusinessLayer.ManageVoter;
import BusinessLayer.Voter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bubrak Sher
 */
public class SeeVotingDetailSvlt extends HttpServlet {

    private ManageVoter voterManager;
    
    /**
     *
     */
    @Override
    public void init() {
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
        
        Voter voter = voterManager.getVotingDetails();
        
        if(voter.getID()!=null){
            try ( PrintWriter out = response.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");

                out.println("<title>View Application</title>");
                out.println("<meta charset=\"UTF-8\">");
                out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");

                out.println("</head>");
                out.println("<body>");
                out.println("<br><br><br><br><br>");

                String text = "Voting Application";
                out.println("<h1 align=\"center\">" + text + "</h1><br><br>");

                out.println("<table width=\"700px\" border=\"3\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");

                out.println("<tr align=\"center\">");
                out.println("<td colspan=\"2\" style=\"width: 350px\"><b> Application Details</b>");
                out.println("</tr>");

                out.println("<tr align=\"center\">");
                out.println("<td style=\"width: 350px\"><b> Student ID </b></td>");
                out.println("<td style=\"width: 350px\">"+ voter.getID() +"</td>");
                out.println("</tr>");

                out.println("<tr align=\"center\">");
                out.println("<td style=\"width: 350px\"><b> Vote To Party </b></td>");
                out.println("<td style=\"width: 350px\">"+ voter.getCandidate()  +"</td>");
                out.println("</tr>");

                out.println("</table>");
                out.println("<br>");

                out.println("<FORM METHOD = \"POST\" ACTION = \"http://localhost:8080/Assignment3\" NAME = \"optionsform\" >");

                out.println("<table width=\"700px\" border=\"1\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");
                out.println("<tr>");
                out.println("<td align=\"center\" style=\"width: 350px\">Press 'Back' to go back to Voting Application.</td>");
                out.println("</tr>");

                out.println("<br>");
                out.println("<table width=\"700px\" border=\"1\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");
                out.println("<tr align=\"center\">");
                out.println("<td style=\"width: 350px\"> <input name=\"goback\" type=\"submit\" value=\"Back\" size=\"200\"> </td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<br>");

                out.println("</form>");
                out.println("</body>");
                out.println("</html>");

                out.close();
            }
        }
        else{
            
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>View Application</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<br><br><br><table width=\"800\" border=\"1\" align=\"center\" cellpadding=\"10\" cellspacing=\"1\">");
                out.println("<tr align=\"center\">");
                out.println("<td><h1>Kindly Cast The Vote To See Voting Detail.</h1></td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
            }
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
