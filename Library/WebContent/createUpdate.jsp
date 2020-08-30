<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
		 Book ID<input type="text" id="id" name="id"><br><br>
        Book Name<input type="text" id="name" name="name"><br><br>
        Author's Name<input type="text" id="author" name="author"><br><br>
        Publisher's name<input type="text" id="publisher" name="publisher"><br><br>
    
        <button id="create" value="create" formaction="create.jsp">Create Book</button>
        <button id="update" value="update" formaction="update.jsp">update Book</button>
      </form>  
</body>
</html>