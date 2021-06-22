package tads.eaj.ufrn.aulapw03.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping ("/cliente")
public class ClienteController {

    @Autowired
    ServletContext servletContext;

    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        response.getWriter().println("Hello cliente from Get");
        String cliente = (String) request.getAttribute("cliente");
        response.getWriter().println(cliente);

        String mensagem = (String) servletContext.getAttribute("mensagem");
        response.getWriter().println(mensagem);

        String ingrediente = servletContext.getInitParameter("batatinha");
        response.getWriter().println(ingrediente);

    }
}
