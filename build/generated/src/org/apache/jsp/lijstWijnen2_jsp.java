package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public final class lijstWijnen2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            p.pos_iframe {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 100px;\n");
      out.write("                right: 300px;\n");
      out.write("                color: brown;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            p.pos_land {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 150px;\n");
      out.write("                left :100px;\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <style>\n");
      out.write("            p.pos_selectie {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 100px;\n");
      out.write("                left :100px;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <p class=\"pos_land\">\n");
      out.write("\n");
      out.write("            Land       : ");
      out.print( request.getParameter("land"));
      out.write("<br><br>\n");
      out.write("            Landstreek : ");
      out.print( request.getParameter("landstreek"));
      out.write("\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <form action=\"WijnController\" method=\"POST\">\n");
      out.write("            <fieldset class=\"pos_selectie\">\n");
      out.write("\n");
      out.write("                <legend>Kies land : </legend>\n");
      out.write("                <select name=\"land\" size=\"4\">\n");
      out.write("                    <option>Zuid-Afrika</option>\n");
      out.write("                    <option>Chili</option>\n");
      out.write("                    <option>Frankrijk</option>\n");
      out.write("                    <option>Italië</option>\n");
      out.write("                </select> \n");
      out.write("                <input type=\"submit\" value=\"Zoek Wijn\" />\n");
      out.write("\n");
      out.write("                <legend>Kies landstreek : </legend>\n");
      out.write("                <select name=\"landstreek\" size=\"4\">\n");
      out.write("                    <option>Stellenbosch</option>\n");
      out.write("                    <option>Franshoek</option>\n");
      out.write("                    <option>Outshoorn</option>\n");
      out.write("                </select> \n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
