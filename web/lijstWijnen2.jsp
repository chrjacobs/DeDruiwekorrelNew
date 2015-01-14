<%-- 
    Document   : lijstWijnen2
    Created on : 28-dec-2014, 22:08:26
    Author     : Christel
--%>


<%@page import="javax.swing.JTextArea"%>
<%@page import="java.awt.BorderLayout"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
       
        <style>
            p.pos_iframe {
                position: fixed;
                top: 100px;
                right: 300px;
                color: brown;
            }
        </style>
        <style>
            p.pos_land {
                position: fixed;
                top: 150px;
                left :100px;
                color: blue;
            }
        </style>
        <style>
            p.pos_selectie {
                position: fixed;
                top: 100px;
                left :100px;
                color: red;
            }
        </style>

        <title>JSP Page</title>
    </head>
    <body>

        <p class="pos_land">

            Land       : <%= request.getParameter("land")%><br><br>
            Landstreek : <%= request.getParameter("landstreek")%>

        </p>

        <form action="WijnController" method="POST">
            <fieldset class="pos_selectie">

                <legend>Kies land : </legend>
                <select name="land" size="4">
                    <option>Zuid-Afrika</option>
                    <option>Chili</option>
                    <option>Frankrijk</option>
                    <option>Italië</option>
                </select> 
                <input type="submit" value="Zoek Wijn" />

                <legend>Kies landstreek : </legend>
                <select name="landstreek" size="4">
                    <option>Stellenbosch</option>
                    <option>Franshoek</option>
                    <option>Outshoorn</option>
                </select> 

            </fieldset>
        </form>


    </body>
</html>
