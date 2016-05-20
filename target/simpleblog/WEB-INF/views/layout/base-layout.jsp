<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <t:insertAttribute name="base-styles"/>
    <t:insertAttribute name="personal-style"/>
    <title><t:insertAttribute name="title"/></title>
</head>
<body>
<main class="main">
    <div class="container">
        <header>
            <t:insertAttribute name="header"/>
        </header>

        <div class="content">
            <t:insertAttribute name="content"/>
        </div>

        <footer>
            <t:insertAttribute name="footer"/>
        </footer>
    </div>
    <t:insertAttribute name="base-script"/>
    <t:insertAttribute name="personal-script"/>
</main>
</body>
</html>