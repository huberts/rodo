<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t"  tagdir="/WEB-INF/tags" %>
<jsp:useBean id="tasks" scope="request" type="java.util.List"/>

<t:main>
    <jsp:body>
        <a href="dodaj" class="btn btn-primary" role="button">Dodaj nową aktywnosć</a>
        <table class="table">
            <caption>Lista aktywności</caption>
            <thead>
            <tr>
                <th>Data</th>
                <th>Osoba</th>
                <th>Klient</th>
                <th>Zadanie</th>
                <th>Dane osobowe</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${tasks}" var="task">
                <tr>
                    <td>${task.getDate()}</td>
                    <td>${task.getPerson().getName()}</td>
                    <td>${task.getClient().getName()}</td>
                    <td>${task.getTopic().getName()}</td>
                    <td>${task.getHasPersonalData() ? "Tak" : "Nie"}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </jsp:body>
</t:main>
