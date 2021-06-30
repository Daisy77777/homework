package com.example.demo;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.TriangleAvatar;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@WebServlet(name = "avatarServlet", value = "/avatarServlet")
public class avatarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        int a = Integer.parseInt(req.getParameter("number"));
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();
        BufferedImage b =  avatar.create(a);
        ImageIO.write(b,"png",response.getOutputStream());

    }
}
