<%-- 
    Document   : cadastroSucesso
    Created on : 5 de dez. de 2022, 05:32:41
    Author     : Amanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="view/fonts/icomoon/style.css">

    <link rel="stylesheet" href="view/css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="view/css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="view/css/style.css">
    <style>
                    body{
                        background: linear-gradient(170deg, #2B4C5D, #50808E, #6A8595, #84B59F);
                        background-repeat: no-repeat;
                        width: 100vh;
                        height: 100vh;
                    }
                    .card{
                        height: 20vh;
                        width: 100vh;
                        margin-left: 50%;
                        margin-top: 20%;
                        display: flex;
                        flex-direction: column;
                        justify-content: center;
                        align-items: center;
                        color: #DDD8C4;
                        background-color: #2B4C5D;
                        cursor: pointer;
                        border-radius: 10px;
                    }
                    .Mensagem{
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        cursor: pointer;
                    }
            
                </style>
        <title>Parabéns</title>
    </head>
    <body>
        <form action="Login">
           <div class="card"><div class="Mensagem"><h1>Cadastro feito com Sucesso!</h1>
            <button type="submit" value="Log In"  class="btn btn-block btn-primary">Login</button></div></div>
        </form>
    </body>
</html>
