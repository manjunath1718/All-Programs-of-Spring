<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
   		<h1 style=' color: red; text-align:center'> Registration Application</h1>
         <form:form method="post" modelAttribute="impl" >
            <table>
                  <tr>
                  <th> Implementers ID</th>
                  <td> <form:input path="id"/></td>
                  </tr>
                  
                   <tr>
                  <th> Implementers Name</th>
                  <td> <form:input path="iname"/></td>
                  </tr>
                  
                  <tr>
                  <th> Implementers City</th>
                  <td> <form:input path="icity"/></td>
                  </tr>
                  
                   <tr>
                  <th> Implementers Salary</th>
                  <td> <form:input path="isalary"/></td>
                  </tr>
                  
                   <tr>
                 
                  <td> <input type="submit" value="Register"></td>
                  </tr>
            
            
            </table>
         
         </form:form>
         
   </center>
</body>
</html>