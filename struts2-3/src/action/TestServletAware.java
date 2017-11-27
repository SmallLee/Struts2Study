package action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class TestServletAware implements ServletRequestAware,ServletContextAware {
    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {

    }
    public String execute(){
        return "success";
    }
}
