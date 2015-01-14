<%-- 
    Document   : lijstWijnen
    Created on : 28-dec-2014, 22:09:22
    Author     : Christel


<%@page import="DAL.Wijntbl"%>
<%@page import="ViewModels.LijstWijnenViewModel"%>

<%
    LijstWijnenViewModel vm
            = (LijstWijnenViewModel) session.getAttribute("ViewModel");

%>

--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

        <title>Lijst wijnen</title>
        <style type="text/css">
            .footer{ position:absolute; bottom:0; width:100%; text-align:center; background-color:#CCC; margin:0; padding:5px 0;}
            body{margin:0;}
        </style>
    </head>
    <body>
        <img src="foto/Banner01.png" alt="DeDruiwekorrel"> 
        <img src="foto/Banner02.png" alt="DeDruiwekorrel"> 
        <img src="foto/Banner03.jpg" alt="DeDruiwekorrel"> 
        <img src="foto/Banner04.jpg" alt="DeDruiwekorrel"> 
        <img src="foto/Banner05.jpg" alt="DeDruiwekorrel"> 

        <ul class="nav nav-tabs" style="background-color: #ffffcc">
            <li class="active"><a style="border-color: #ffcc66; background-color: #ffffcc" href="index">Home</a></li>

            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="LandController">Landen</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="LandstreekController">Landstreken</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="WijnController">Wijnen</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="lijstGerechten.jsp">Gerechten</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="lijstFotos.jsp">Foto's</a></li>
            <li><a style="border-color: #ffcc66; background-color: #ffffcc" href="contact.jsp">Contact</a></li>
        </ul>


        <h1>Lijst wijnen</h1>
        <table class="table">
            <tr>
                <th>Naam</th>
                <th>Omschrijving</th>
                <th></th>
            </tr>
        
              <%                for (Wijntbl wijn : vm.getWijnen()) {
              %>

            <tr>
                <td><img src="foto/<%= wijn.getFototbl().getFilenaam()%>" width="80" height="80"></td>
                <td><%= wijn.getNaam()%></td>
                <td><%= wijn.getOmschrijving()%></td>
                <td><%= wijn.getWijnhuistbl().getNaam()%></td>
                 <td><%= wijn.getWijntypetbl().getNaam()%></td>
                 <td><a class="btn btn-primary btn-sm" href="WijnVerwijderen?id=<%=wijn.getId()%>"> delete </a>
                </td>

            </tr>

            <%  }%>

        </table>
        <p>Er zijn <%=vm.getAantal()%> records gevonden
        </p>
            

            <br><br>
            <a href="nieuwWijn.jsp" class="btn btn-default">Voeg wijn Toe</a>
            <br><br>
            <a href="menuNew.html" class="btn btn-default">Terug naar Menu</a>

            <div class="footer"><p>Copyright © 2015  xx 't Wijnhuisje BVBA - Provinciesteenweg 442   2530 Boechout - Gsm: 0485/63.86.37</p>
            </div>
    </BODY>
</HTML>