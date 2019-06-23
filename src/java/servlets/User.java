package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class User extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getParameter("btnRegister") != null) {
            beans.User us = new beans.User();
            us.setName(request.getParameter("txtName"));
            us.setGender(request.getParameter("rbtGender"));
            us.setFatherName("");
            us.setAddress("");
            us.setCity("");
            us.setContactNo("");
            us.setEmailID("");
            us.setUserID(request.getParameter("txtUserID"));
            us.setPassword(request.getParameter("txtPassword"));
            us.setSecurityQuestion(request.getParameter("ddlSecurityQuestion"));
            us.setAnswer(request.getParameter("txtAnswer"));
            us.setProfilePic("Def.jpg");

            datalayer.DALUser objDAL = new datalayer.DALUser();
            objDAL.register(us);
            response.sendRedirect("Login.jsp");
        } //btnRegister
        else if (request.getParameter("btnLogin") != null) {
            String a = request.getParameter("txtUserID");
            String b = request.getParameter("txtPassword");

            datalayer.DALUser objDAL = new datalayer.DALUser();
            beans.User us = objDAL.authenticateUser(a, b);
            if (us == null) {
                response.sendRedirect("Login.jsp?flag=-1");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("LRID", us.getRegistrationID());
                session.setAttribute("NM", us.getName());
                session.setAttribute("UIMG", us.getProfilePic());
                response.sendRedirect("UserPages/Welcome.jsp");
            }
        } //btnLogin
        else if (request.getParameter("btnUpdate") != null) {
            int RID = Integer.parseInt(request.getSession().getAttribute("LRID").toString());

            beans.User us = new beans.User();
            us.setRegistrationID(RID);
            us.setName(request.getParameter("txtName"));
            us.setGender(request.getParameter("rbtGender"));
            us.setFatherName(request.getParameter("txtFatherName"));
            us.setAddress(request.getParameter("txtAddress"));
            us.setCity(request.getParameter("txtCity"));
            us.setContactNo(request.getParameter("txtContactNo"));
            us.setEmailID(request.getParameter("txtEmailID"));

            datalayer.DALUser objDAL = new datalayer.DALUser();
            objDAL.updateProfile(us);
            HttpSession session = request.getSession();
            session.setAttribute("NM", us.getName());
            response.sendRedirect("UserPages/Welcome.jsp");
        }//btnUpdate
        else if (request.getParameter("uid") != null) {
            String v = request.getParameter("uid");
            datalayer.DALUser objDAL = new datalayer.DALUser();
            boolean ret = objDAL.checkAvailability(v);
            try {
                PrintWriter out1 = response.getWriter();
                if (ret == true) {
                    out1.println("<font color='green'><br>User ID available</br></font>");
                } else {
                    out1.println("<font color='red'><br>User ID not available</br></font>");
                }
            }//try
            catch (Exception ex) {

            }
        }//uid ajx
        else if (request.getParameter("pwd") != null) {
            int RID = Integer.parseInt(request.getSession().getAttribute("LRID").toString());
            String pwd = request.getParameter("pwd");
            beans.User us = new datalayer.DALUser().getUserData(RID);
            PrintWriter out = response.getWriter();
            if (us.getPassword().equals(pwd)) {
                out.println("<font color='green'><br>Password Match</br></font>");
            } else {
                out.println("<font color='Red'><br>Incorrect Password</br></font>");
            }
        }// pass not null
        else if (request.getParameter("btnChange") != null) {
            int RID = Integer.parseInt(request.getSession().getAttribute("LRID").toString());

            String newpwd = request.getParameter("txtNewPassword");

            datalayer.DALUser objDAL = new datalayer.DALUser();
            objDAL.changePassword(RID, newpwd);
            response.sendRedirect("UserPages/Welcome.jsp");

        }// password change code
        else if(request.getParameter("btnSubmit")!=null){
            
            PrintWriter out = response.getWriter();
            out.print("test submitted...");
   
            out.print("<a href=\"http://localhost:40319/WordPower/UserPages/Welcome.jsp\">HOME</a>");
//            RequestDispatcher rd = request.getRequestDispatcher("http://localhost:20370/WordPower/UserPages/Welcome.jsp");
 //           rd.include(request, response);
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
