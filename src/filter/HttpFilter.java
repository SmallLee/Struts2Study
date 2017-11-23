package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class HttpFilter implements Filter {
    //用于保存FilterConfig对象
    private FilterConfig filterConfig;
    /**
     * 不建议子类直接覆盖，若覆盖，将可能会导致filterconfig成员变量初始化失败
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        //初始化变量
        init();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        doFilter(request,response,filterChain);
    }

    @Override
    public void destroy() {

    }
    protected void init(){

    }
    //抽象方法，为http请求定制
    abstract void doFilter(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,FilterChain filterChain) throws ServletException, IOException;

    //供子类获取FilterConfig对象
    public FilterConfig getFilterConfig() {
        return filterConfig;
    }
}
