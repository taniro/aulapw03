package tads.eaj.ufrn.aulapw03.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    ServletContext servletContext;

    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        if (login.equals("taniro") && senha.equals("123")){
            request.setAttribute("cliente", "Bem-vindo");

            servletContext.setAttribute("mensagem", "hello from login");

            RequestDispatcher dispatcher = request.getRequestDispatcher("/cliente");
            dispatcher.forward(request, response);
        }else{
            response.sendRedirect("/loja/");
        }
    }
}
