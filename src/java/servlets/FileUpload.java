package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
@MultipartConfig
public class FileUpload extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
        
            HttpSession session = request.getSession();
            String FN = "img" + session.getAttribute("LRID").toString() + ".jpg";
            String RealPath = getServletContext().getRealPath("/");
            String FileName = RealPath + "UploadedImages\\" + FN;

            java.io.OutputStream out1;
            out1 = new java.io.FileOutputStream(FileName);

            Part part = request.getPart("FL");
            java.io.InputStream input = part.getInputStream();

            byte[] bytes = new byte[1024];
            int res;

            while ((res=input.read(bytes))!= -1) {
                out1.write(bytes, 0, res);
            }
            out1.close();
            input.close();

            session.setAttribute("UIMG", FN);
            int RID = Integer.parseInt(session.getAttribute("LRID").toString());
            datalayer.DALUser objDAL = new datalayer.DALUser();
            objDAL.changeProfilePicture(RID);
            response.sendRedirect("UserPages/Welcome.jsp");



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
