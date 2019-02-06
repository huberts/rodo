<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t"  tagdir="/WEB-INF/tags" %>
<jsp:useBean id="persons" scope="request" type="java.util.List"/>
<jsp:useBean id="clients" scope="request" type="java.util.List"/>
<jsp:useBean id="topics" scope="request" type="java.util.List"/>

<t:main>
    <jsp:body>
        <form action="utworz" method="POST">
            <div class="form-group">
                <label for="person">Osoba</label>
                <select class="form-control" id="person" name="person">
                    <option></option>
                    <c:forEach items="${persons}" var="person">
                        <option value="${person.getId()}">${person.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="client">Klient</label>
                <select class="form-control" id="client" name="client">
                    <option></option>
                    <c:forEach items="${clients}" var="client">
                        <option value="${client.getId()}">${client.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="topic">Zadanie</label>
                <select class="form-control" id="topic" name="topic">
                    <option></option>
                    <c:forEach items="${topics}" var="topic">
                        <option value="${topic.getId()}">${topic.getName()}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="true" id="hasPersonalData" name="hasPersonalData">
                <label class="form-check-label" for="hasPersonalData">
                    Wgląd w dane osobowe
                </label>
            </div>
            <button type="submit" class="btn btn-primary">Zapisz</button>
        </form>
    </jsp:body>
</t:main>
