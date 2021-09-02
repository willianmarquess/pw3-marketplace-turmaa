<%-- 
    Document   : index
    Created on : 05/08/2021, 13:19:46
    Author     : willi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Usuário</h1>
        <form action="<%=request.getContextPath()%>/CadastrarUsuario" method="POST">
            <label>Digite seu E-mail:</label><br>
            <input type="email" id="email" name="email"><br>
            <label>Digite sua senha:</label><br>
            <input type="password" id="senha" name="senha"><br><br>
            <button>Cadastrar</button>
        </form>
    </body>
</html>
