package com.xy.git_dome;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/git")
public class GitServlet extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response){

    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response){
        doGet(request, response);
    }
}
