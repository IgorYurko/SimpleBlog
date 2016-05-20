<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="inc/tags.jsp" %>

<h4><c:out value="${user.name}"/></h4>
<h4><c:out value="${user.password}"/></h4>
<h4><c:out value="${user.email}"/></h4>

<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
    Add New Blog
</button>

<!-- Modal -->
<f:form method="POST" commandName="blogForm" class="form-horizontal formValidate">
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">New Blog</h4>
                </div>
                <div class="modal-body">

                    <div class="form-group">
                        <label for="name" class="col-sm-2 control-label">Name:</label>

                        <div class="col-sm-10">
                            <f:input path="name" maxlength="30" placeholder="Name" cssClass="form-control"/>
                            <f:errors path="name" cssClass="error" element="label"/>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="url" class="col-sm-2 control-label">Url:</label>

                        <div class="col-sm-10">
                            <f:input path="url" maxlength="30" placeholder="Url" cssClass="form-control"/>
                            <f:errors path="url" cssClass="error" element="label"/>
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-warning" data-dismiss="modal">Close</button>
                    <f:button class="btn btn-success">Save</f:button>
                </div>
            </div>
        </div>
    </div>
</f:form>

<!-- Nav tabs -->
<ul class="nav nav-tabs" role="tablist">
    <c:forEach var="blog" items="${user.blogs}">
        <li role="presentation">
            <a href="#blog_${blog.id}" aria-controls="profile" role="tab" data-toggle="tab">
                <c:out value="${blog.name}"/>
            </a>
        </li>
    </c:forEach>
</ul>

<!-- Tab panes -->
<div class="tab-content">
    <c:forEach var="blog" items="${user.blogs}">
        <div role="tabpanel" class="tab-pane" id="blog_${blog.id}">
            <p>
                <a href="<s:url value='/blog/remove/${blog.id}.html'/>" class="btn btn-danger triggerRemove">Remove</a>
            </p>
            <table class="table table-striped table-hover table-bordered table-striped">
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Description</th>
                    <th>Links</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${blog.items}">
                    <tr>
                        <td><c:out value="${item.title}"/></td>
                        <td><c:out value="${item.description}"/></td>
                        <td><c:out value="${item.link}"/></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </c:forEach>
</div>

<!-- Modal -->
<div class="modal fade" id="modalRemove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Remove blog</h4>
            </div>
            <div class="modal-body">
                Really remove?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <a href="" class="btn btn-danger btnRemove">Remove</a>
            </div>
        </div>
    </div>
</div>