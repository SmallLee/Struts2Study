package action;

import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class TestServletActionContext {
    public String execute(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession httpSession = request.getSession();
        ServletContext servletContext = ServletActionContext.getServletContext();
        System.out.println("execute....");
        return "success";
    }
}
