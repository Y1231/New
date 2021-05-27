package servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/receive-form")
public class ReceiveForm extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream inputStream=req.getInputStream();
        //完整读取http请求体的内容
        //使用它读取
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username);
        System.out.println(password);


    }
}
