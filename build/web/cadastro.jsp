<%-- 
    Document   : cadastro
    Created on : 5 de dez. de 2022, 09:50:44
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
        <title>Cadastro</title>
    </head>
   <body>
    <div class="d-lg-flex half">
    <div class="bg order-1 order-md-2" style="background-image: url('view/images/Background-Image.jpg');"></div>
    <div class="contents order-2 order-md-1">

      <div class="container">
        <div class="row align-items-center justify-content-center">
          <div class="col-md-7">
            <h3>É um Prazer te Conhecer! <strong>| OliveiraTrade |</strong><p>Fazer Cadastro:</p></h3>
          <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p>
            <form action="CadastrarUsuario" method="post">
                <div class="form-group first">
                    <label for="Nome">Nome:</label>
                    <input class="form-control" placeholder="Nome:" type="text" name="nomeUser" id="nomeUser" title="inserirNome">
                    
                    <label for="CPF">CPF:</label>
                    <input type="text" class="form-control" placeholder="Cpf:" name="cpfUser" id="cpfUser" title="inserirCpf">
                
                    <label for="Telefone">Insira o seu Email:</label>
                    <input class="form-control" placeholder="Endereço:" type="email" name="emailUser" id="emailUser" title="inserirEmail">

                    <label for="Telefone">Insira o seu Telefone:</label>
                    <input class="form-control" placeholder="Telefone:" type="tel" name="telefoneUser" id="telefoneUser" title="inserirTelefone">
                </div>
                <div class="form-group last mb-3">
                    <label for="Nascimento">Insira a sua Data de nascimento:</label>
                    <input class="form-control" placeholder="Data de Nascimento:" type="date" name="nascimentoUser" id="nascimento" title="inserirNascimento">

                    <label for="Endereco">Insira o seu Endereço: </label>
                    <input class="form-control" placeholder="Endereço:" type="text" name="enderecoUser" id="endereco" title="inserirEndereco">
                    
                    <label for="Genero">Insira o seu Gênero:</label>
                        <select class="form-control" name="generoUser" id="generoUser" placeholder="Gênero:">
                            <option value="x"></option>
                            <option value="f">Feminino</option>
                            <option value="m">Masculino</option>
                            <option value="nb">Não-Binário</option>
                            <option value="o">Outro</option>
                        </select>

                   <label for="Senha">Insira uma Senha:</label>
                   <input type="password" class="form-control" placeholder="Senha:" name="senhaUser" id="senhaUser" title="senhaUser">

                    <label for="RepitaSenha">Repita a Senha</label>
                    <input type="password" class="form-control" placeholder="Repetir senha:" name="repetirSenhaUser" id="repetirSenhaUser" title="inserirSenha">
                </div>

                <button type="submit" value="Cadastro"  class="btn btn-block btn-primary">Salvar</button>

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
        <script src="view/js/jquery-3.3.1.min.js"></script>
        <script src="view/js/popper.min.js"></script>
        <script src="view/js/bootstrap.min.js"></script>
        <script src="view/js/main.js"></script>
</body>
</html>
<!-- <h3>É um Prazer te Conhecer! <strong>| OliveiraTrade |</strong><p>Fazer Cadastro:</p></h3>
          <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p>
            <form action="Cadastro" method="post">
                <div class="form-group first">
                    <label for="Nome">Nome:</label>
                    <input class="form-control" placeholder="Nome:" type="text" name="nomeUser" id="nomeUser" title="inserirNome">
                    
                    <label for="CPF">CPF:</label>
                    <input type="text" class="form-control" placeholder="Cpf:" name="cpfUser" id="cpfUser" title="inserirCpf">
                
                    <label for="Telefone">Insira o seu Email:</label>
                    <input class="form-control" placeholder="Endereço:" type="email" name="emailUser" id="emailUser" title="inserirEmail">

                    <label for="Telefone">Insira o seu Telefone:</label>
                    <input class="form-control" placeholder="Telefone:" type="tel" name="telefoneUser" id="telefoneUser" title="inserirTelefone">
                </div>
                <div class="form-group last mb-3">
                    <label for="Nascimento">Insira a sua Data de nascimento:</label>
                    <input class="form-control" placeholder="Data de Nascimento:" type="date" name="nascimentoUser" id="nascimento" title="inserirNascimento">

                    <label for="Endereco">Insira o seu Endereço: </label>
                    <input class="form-control" placeholder="Endereço:" type="text" name="enderecoUser" id="endereco" title="inserirEndereco">
                    
                    <label for="Genero">Insira o seu Gênero:</label>
                        <select class="form-control" name="generoUser" id="generoUser" placeholder="Gênero:">
                            <option value="x"></option>
                            <option value="f">Feminino</option>
                            <option value="m">Masculino</option>
                            <option value="nb">Não-Binário</option>
                            <option value="o">Outro</option>
                        </select>

                   <label for="Senha">Insira uma Senha:</label>
                   <input type="password" class="form-control" placeholder="Senha:" name="senhaUser" id="senhaUser" title="senhaUser">

                    <label for="RepitaSenha">Repita a Senha</label>
                    <input type="password" class="form-control" placeholder="Repetir senha:" name="repetirSenhaUser" id="repetirSenhaUser" title="inserirSenha">
                </div> -->