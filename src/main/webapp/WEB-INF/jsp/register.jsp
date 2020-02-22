<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<link href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css" rel="stylesheet"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<form:form class="ui form" action="/register" modelAttribute="user">
<div class="two fields">
  <div class="field">
    <label>First Name</label>
    <form:input type="text" name="first-name" path="firstName" placeholder="First Name"/>
  </div>
  <div class="field">
    <label>Last Name</label>
    <form:input type="text" name="last-name"  path="lastName" placeholder="Last Name"/>
  </div>
   </div>
   <div class="field">
    <label>Email</label>
    <form:input type="email" name="email"  path="email" placeholder="email"/>
  </div>
  <div class="field">
    <label>password</label>
    <form:input type="password" name="password"  path="password" placeholder="password"/>
  </div>
 
  <div class="field">
    <div class="ui checkbox">
      <input type="checkbox" tabindex="0" class="hidden"/>
      <label>I agree to the Terms and Conditions</label>
    </div>
  </div>
  <button class="ui button" type="submit">Submit</button>
</form:form>
</body>
</html>