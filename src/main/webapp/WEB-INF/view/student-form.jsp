<%--
  Created by IntelliJ IDEA.
  User: jstolorz
  Date: 2017-10-18
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"/>
        <br><br>
        Last name : <form:input path="lastName"/>
        <br><br>

        <form:select path="country">
           <form:options items="${student.countryOptions}"/>

        </form:select>

        <br><br>

        <form:radiobuttons path="favoriteLanguage"
                           items="${student.favoriteLanguageOptions}"/>

        <br><br>

        Operating Systems:
        
        <form:checkboxes path="${student.operatingSystems}" items="${student.systemsOptions}"/>

        <br><br>

        <input type="submit" value="OK">

    </form:form>
</body>
</html>
