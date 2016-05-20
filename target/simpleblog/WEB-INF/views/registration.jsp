<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="inc/tags.jsp" %>

<c:if test="${errors != null}">
    <c:set var="nameClass" value="${errors.contains('name') ? 'has-error' : 'has-success'}"/>
    <c:set var="emailClass" value="${errors.contains('email') ? 'has-error' : 'has-success'}"/>
    <c:set var="passwordClass" value="${errors.contains('password') ? 'has-error' : 'has-success'}"/>
</c:if>

<f:form method="POST" commandName="userForm" cssClass="form-horizontal formValidate">
    <c:if test="${param.success == true}">
        <div class="alert alert-success" role="alert">
            <strong>Well done! </strong>Registration successful!!!
        </div>
    </c:if>

    <div class="form-group <c:out value="${nameClass}"/>">
        <label for="name" class="col-sm-2 control-label">Name:</label>

        <div class="col-sm-10">
            <f:input path="name" maxlength="30" placeholder="Your name" cssClass="form-control"/>
            <f:errors path="name" cssClass="error" element="label"/>
        </div>
    </div>

    <div class="form-group <c:out value="${emailClass}"/>">
        <label for="email" class="col-sm-2 control-label">Email:</label>

        <div class="col-sm-10">
            <f:input path="email" maxlength="30" placeholder="Your email" cssClass="form-control"/>
            <f:errors path="email" cssClass="error" element="label"/>
        </div>
    </div>

    <div class="form-group <c:out value="${passwordClass}"/>">
        <label for="password" class="col-sm-2 control-label">Password</label>

        <div class="col-sm-10">
            <f:password path="password" maxlength="30" placeholder="Your password" showPassword="true"
                        cssClass="form-control"/>
            <f:errors path="password" cssClass="error" element="label"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <f:button type="submit" class="btn btn-primary btn-lg">Sign in</f:button>
        </div>
    </div>
</f:form>