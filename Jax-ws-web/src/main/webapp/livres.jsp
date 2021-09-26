<%@page import="webservices.Auteur"%>
<%@page import="webservices.Livre"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
    
		#livres {
		  font-family: Arial, Helvetica, sans-serif;
		  border-collapse: collapse;
		  width: 100%;
		}
		
		#livres td, #livres th {
		  border: 1px solid #ddd;
		  padding: 8px;
		}
		
		#livres tr:nth-child(even){background-color: #f2f2f2;}
		
		#livres tr:hover {background-color: #ddd;}
		
		#livres th {
		  padding-top: 12px;
		  padding-bottom: 12px;
		  text-align: left;
		  background-color: #04AA6D;
		  color: white;
		}
		  
		input {
			height: 20px
		
		}
		
		select {
			height: 26px
		}
	
</style>
</head>
<body>

<div class="container">
	<% List<Livre> livres = (List<Livre>) request.getAttribute("livres"); %>
 
<form action="LivreController" method="post">
	<select name="type">
		<option  value="id">ID</option>
		<option value="titre">Titre</option>
		<option value="auteur">Auteur</option>
	</select>
	<input name="value" type="text">
	<input name="submit" type="submit" value="recherche">
</form>
<br/>

 



 
    <table id="livres" class="styled-table">
    <tr>
        <tr>
        <th scope="col">IDentifiant</th>
        <th scope="col">Titre</th>
        <th scope="col">Prix</th>
        <th scope="col">Auteurs</th>
    </tr>
        
  <% for(Livre livre : livres) { %>     

   <tr>
        <td scope="row"><%= livre.getId() %></th>
        <td><%= livre.getTitre() %></td>
        <td><%= livre.getPrix() %></td>
        <td rowspan="<%= livre.getAuteur().size() %>">
        	<% for(Auteur auteur : livre.getAuteur()) { %>
        	<ul>
        		<li> <%= auteur.getNom() %>  <%= auteur.getPrenom() %>  </li>
        	</ul> 
        	<% } %>
        </td>
   </tr>

<tr>
<% } %>
         </tr>
    <tbody>   
 
           
    </tbody>
    </table>
     
 </div>
</body>
</html>