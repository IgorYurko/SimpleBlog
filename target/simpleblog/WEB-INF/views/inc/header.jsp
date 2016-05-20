<%@ include file="tags.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<e:useAttribute name="current"/>

<!-- Static navbar -->
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<s:url value='/'/>">Java JBA</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="<c:out value='${current == "index" ? "active" : ""}'/>">
                    <a href="<s:url value='/index.html'/>"> Home</a>
                </li>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li class="<c:out value='${current == "users" ? "active" : ""}'/>">
                        <a href="<s:url value='/users.html'/>">Users</a>
                    </li>
                </sec:authorize>
                <li class="<c:out value='${current == "registration" ? "active" : ""}'/>">
                    <a href="<s:url value='/registration.html'/>">Registration</a>
                </li>
                <sec:authorize access="isAuthenticated()">
                    <li class="<c:out value='${current == "account" ? "active" : ""}'/>">
                        <a href="<s:url value='/account.html'/>">My account</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="!isAuthenticated()">
                    <li class="<c:out value='${current == "login" ? "active" : ""}'/>">
                        <a href="<s:url value='/login.html'/>">Login</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li>
                        <a href="<s:url value='/logout'/>">Logout</a>
                    </li>
                </sec:authorize>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
    <!--/.container-fluid -->
</nav>
