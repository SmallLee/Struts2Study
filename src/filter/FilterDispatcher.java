package filter;

import filter.HttpFilter;
import pojo.Product;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterDispatcher extends HttpFilter {

    @Override
    protected void init() {
    }

    @Override
    void doFilter(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        //获取ServletPath
        String servletPath = httpServletRequest.getServletPath();
        String path = null;
        System.out.println(servletPath);
        //根据ServletPath转发到不同页面
        if ("/product-input.action".equals(servletPath)){
            path = "/WEB-INF/pages/input.jsp";
        } else if("/product-save.action".equals(servletPath)){
            path = "/WEB-INF/pages/detail.jsp";
        }
        //获取请求信息并封装
        httpServletRequest.setCharacterEncoding("UTF-8");
        String productName = httpServletRequest.getParameter("productName");
        String productDesc = httpServletRequest.getParameter("productDesc");
        String productPrice = httpServletRequest.getParameter("productPrice");
        //struts2不需要Filer，故注释
//        Product product = new Product(productName,productDesc,productPrice);
//        httpServletRequest.setAttribute("product",product);
        if (path != null) {
            httpServletRequest.getRequestDispatcher(path).forward(httpServletRequest,httpServletResponse);
            return;
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
