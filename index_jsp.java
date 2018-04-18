package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EPR1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>Item II - Ejercicio 1</h1>\n");
      out.write("\n");
      out.write("        ");

            String[] objetos = new String[20];

            objetos[0] = "Cereales";
            objetos[1] = "Leche";
            objetos[2] = "Café";
            objetos[3] = "Té";
            objetos[4] = "Azucar";
            objetos[5] = "Mermelada";
            objetos[6] = "Mayonesa";
            objetos[7] = "Ketchup";
            objetos[8] = "Mostaza";
            objetos[9] = "Queso";
            objetos[10] = "Jamon";
            objetos[11] = "Maní";
            objetos[12] = "Papas fritas";
            objetos[13] = "Lechuga";
            objetos[14] = "Tomate";
            objetos[15] = "Pan";
            objetos[16] = "Salsa de tomate";
            objetos[17] = "Tallarines";
            objetos[18] = "Arroz";
            objetos[19] = "Jugo";

        
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>");
out.println("Productos");
      out.write("</strong></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
for (int i = 0; i < objetos.length; i++) { 
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
out.println(objetos[i]);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <h1>Item II - Ejercicio 2</h1>\n");
      out.write("\n");
      out.write("        ");

            String[][] precios = new String[2][10];

            precios[0][0] = "$1990";
            precios[0][1] = "$990";
            precios[0][2] = "$2490";
            precios[0][3] = "$1890";
            precios[0][4] = "$990";
            precios[0][5] = "$690";
            precios[0][6] = "$1460";
            precios[0][7] = "$1290";
            precios[0][8] = "$1190";
            precios[0][9] = "$2990";
            precios[1][0] = "$1590";
            precios[1][1] = "$790";
            precios[1][2] = "$1990";
            precios[1][3] = "$1990";
            precios[1][4] = "$1260";
            precios[1][5] = "$1190";
            precios[1][6] = "$890";
            precios[1][7] = "$590";
            precios[1][8] = "$690";
            precios[1][9] = "$990";
        
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td><strong>");
out.println("Productos");
      out.write("</strong></td>\n");
      out.write("                <td><strong>");
out.println("Precios");
      out.write("</strong></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                for (int i = 0; i < precios.length; i++) {
                    for (int x = 0; x < precios[i].length; x++) {

            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
out.println(objetos[x]);
      out.write("</td>\n");
      out.write("                <td>");
out.println(precios[i][x]);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
