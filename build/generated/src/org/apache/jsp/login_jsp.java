package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!DOCTYPE html>\n");
      out.write("        <html lang=\"en\">\n");
      out.write("\n");
      out.write("        <head>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("            <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("                id=\"bootstrap-css\">\n");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"./assets/css/login.css\">\n");
      out.write("            <title>Login</title>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("            <div id=\"logreg-forms\">\n");
      out.write("                <form class=\"form-signin\" action=\"login\" method=\"post\">\n");
      out.write("                    <h1 class=\"h3 mb-3 font-weight-normal\" style=\"text-align: center\"> Sign in</h1>\n");
      out.write("                    <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                    <input type=\"username\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Username\" required=\"\"\n");
      out.write("                        autofocus=\"\" name=\"user\">\n");
      out.write("                    <input type=\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required=\"\"\n");
      out.write("                        name=\"pass\">\n");
      out.write("\n");
      out.write("                    <button class=\"btn btn-success btn-block\" type=\"submit\"><i class=\"fas fa-sign-in-alt\"></i> Sign\n");
      out.write("                        in</button>\n");
      out.write("                    <a href=\"#\" id=\"forgot_pswd\">Forgot password?</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <!-- <p>Don't have an account!</p>  -->\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"button\" id=\"btn-signup\"><i\n");
      out.write("                            class=\"fas fa-user-plus\"></i>\n");
      out.write("                        Sign up New Account</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <form action=\"/reset/password/\" class=\"form-reset\">\n");
      out.write("                    <input type=\"email\" id=\"resetEmail\" class=\"form-control\" placeholder=\"Email address\" required=\"\"\n");
      out.write("                        autofocus=\"\">\n");
      out.write("                    <button class=\"btn btn-primary btn-block\" type=\"submit\">Reset Password</button>\n");
      out.write("                    <a href=\"#\" id=\"cancel_reset\"><i class=\"fas fa-angle-left\"></i> Back</a>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </body>\n");
      out.write("\n");
      out.write("        </html>");
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
