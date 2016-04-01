<%-- 
    Document   : newjsp
    Created on : Mar 29, 2016, 9:09:37 PM
    Author     : Niranjan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="image_finder_class.Image_Source"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            
            <input type="text" name="input" value="" /><br/>
            <input type="submit" value="submit" /><input type="reset" value="reset" />
            
        </form>
       
        <% Image_Source jv = new Image_Source();%>
        <%jv.setImage_name(request.getParameter("input"));%>
        <%jv.image();%>
        <img src="<%out.println(jv.getFilepath());%>" width="<%out.println(jv.getImage_width()/2);%>" height=" <%out.println(jv.getImage_height()/2);%>"/> 
        
       

    </body>
</html>
