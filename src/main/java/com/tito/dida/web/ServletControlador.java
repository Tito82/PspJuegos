package com.tito.dida.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.tito.dida.dominio.Juego;
import com.tito.dida.datos.JuegoDAOJDBC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;


@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
 //@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      
        request.getRequestDispatcher("login.jsp").forward(request, response);
   
    }
    
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       String accion = request.getParameter("accion");
       
       JuegoDAOJDBC juegoDao = new JuegoDAOJDBC();
       List<Juego>juegos = new ArrayList<Juego>();
       if(accion != null){
           
       
       switch(accion){
           case "enviar":
               juegos = new JuegoDAOJDBC().listar();
                request.setAttribute("juegos", juegos);
                request.getRequestDispatcher("listaJuegos.jsp").forward(request, response);
            break ; 
           default:System.err.println("no entra");
       }
      }else{
           System.err.println("no entra otra vez");
       }
//        System.out.println("hola");
//        List<Juego>juegos = new JuegoDAOJDBC().listar();
//        System.out.println("juegos = " + juegos);
//        request.setAttribute("juegos", juegos);
//        request.getRequestDispatcher("login.jsp").forward(request, response);

   
    }
    
}
