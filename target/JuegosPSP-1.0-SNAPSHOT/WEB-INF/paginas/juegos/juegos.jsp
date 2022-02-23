<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    
<div class="row">
    <c:forEach var="juego" items="${juegos}">
    <div class="card" style="width: 18rem;">
      <img src="https://res.cloudinary.com/titolas82/image/upload/v1634816302/silent_hill-1692494_epkke8.jpg" class="card-img-top" alt="...">

      <ul class="list-group list-group-flush">
        <p class="Titulo">${juego.nombre}</p>
        <p class="Plataforma">${juego.plataforma}</p>
      </ul>
      <div class="card-body">
        <a href="#" class="btn btn-light"><img src="img/editar.png" />Editar</a>
        <a href="#" class="btn btn-light"> <img src="img/borrar.png" />Borrar</a>
      </div>
    </div>
    </c:forEach>
</div>
</div>