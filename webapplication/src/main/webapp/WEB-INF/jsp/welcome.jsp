<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Student Web Application</title>
</head>

<body>
     <font color="red">${errorMessage}</font>
   Hello ${name} !!!
   <BR/>
   <a href="/createStudent">Create Student</a>
    <BR/>
   <a href="/displayAllStudents">Display All Students</a>
    <BR/>
   
</body>

</html>
