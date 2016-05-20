<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="inc/tags.jsp" %>

<form class="form-signin" name="f" action="/login" method="POST">
    <h2 class="form-signin-heading">Please sign in</h2>

    <input type="text" name="username" class="form-control" placeholder="Name" required autofocus>
    <input type="password" name="password" class="form-control" placeholder="Password" required>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
</form>