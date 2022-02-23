<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script src="https://kit.fontawesome.com/3777a421c8.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link href="estilos/style.css" rel="stylesheet" type="text/css"/>
      
    </head>
    <body id="body">
        <form id="formulario" action="${pageContext.request.contextPath}/ServletControlador" method="post">
          <div class="mb-3">
            <label for="empleado" class="form-label">Empleado</label>
            <input type="text" class="form-control" id="empleado" aria-describedby="empleadoHelp">
          </div>
          <div class="mb-3">
            <label for="contrasenha" class="form-label">Contraseña</label>
            <input type="password" class="form-control" id="contrasenha">
          </div>
          <button id="botonEnviar" type="submit" class="btn btn-primary" name="accion" value="enviar">Enviar</button>
        </form>
        <jsp:include page="WEB-INF/paginas/comunes/footer.jsp"></jsp:include>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
