import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import p1.*;


public class ViewProducts extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw=res.getWriter();
        res.setContentType("text/html");
        HttpSession hs=req.getSession(false);
        if (hs == null) {
            // No session means user might not be logged in
            pw.println("<p style='color:red;font-weight:bold;'>Session expired. Please <a href='login.html'>login</a> again.</p>");
            return;
        }

        try
        {
         
       
        Connection con=DB_Connection.get_DBConnection();
        
       
            PreparedStatement pst2=con.prepareStatement("select * from products");
            
            ResultSet rs1=pst2.executeQuery();
            
           
            String t="";
            int i=1;
            if(rs1.next())
            {
                
                do
                {
                   

                t=t+"<tr class='info'>";
                t=t+"<td>"+rs1.getString(1);
                t=t+"<td>"+rs1.getString(2);
                t=t+"<td>"+rs1.getString(3);
                t=t+"<td>"+rs1.getString(4);
                t=t+"<td>"+rs1.getString(5);
                t=t+"<td><img class='img-thumbnail zoom' src='"+ "GetProductImage?pcode=" + rs1.getString(1) + "' style='width:35px; height:35px;'/>";
                t=t+"<td style='padding-left:40px'>"+"<button id='btn_delete' type='button' class='fa fa-trash-o' style='border:none;font-size:20px;color:#ff3333;background-color: #d9edf7;'></i></button></tr>";
                
                i++;
                }
                while(rs1.next());
                 pw.println(t);
            }
            else
            {
                
           pw.println("<p style='font-weight:bolder;color:red;font-size:20px'><i style='font-weight:bolder;color:red;font-size:25px' class='fa fa-frown-o'></i> Oopsss....No Products to Display </style> ");

            }
                

        
       
       
      
        
       }    
         
        catch(Exception e)
        {
            pw.println(e);
        }

              
        
    }
}