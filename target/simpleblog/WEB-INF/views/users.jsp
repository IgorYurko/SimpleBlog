<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="inc/tags.jsp" %>

<table class="table table-striped table-hover table-bordered table-striped" >
    <thead>
    <tr>
        <th>User Name</th>
        <th>Operations</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>
                <a href="<s:url value='/users/${user.id}.html'/>"><c:out value="${user.name}"/></a>
            </td>
            <td>
                <a href="<s:url value='/user/remove/${user.id}.html'/>" class="btn btn-danger triggerRemove">Remove</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="modalRemove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Remove User</h4>
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