package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Xiang Lan
 * Created on 2019-05-10 01:05
 */
public class myServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理中");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<strong>来自服务器</strong>");
    }
}
