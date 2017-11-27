package action;

import com.opensymphony.xwork2.ActionContext;
import com.sun.xml.internal.ws.developer.ServerSideException;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class UserAction implements SessionAware ,ApplicationAware{
    private Map<String,Object> sessionMap = null;
    private String username;
    private Map<String,Object> applicationMap = null;
    //通过setter犯法接受请求参数的值
    public void setUsername(String username) {
        System.out.println("username: "+username);
        this.username = username;
    }

    public String execute(){
        sessionMap.put("username",username);
        Integer count = (Integer) applicationMap.get("count");
        if (count == null) {
            count = 0;
        }
        count ++;
        applicationMap.put("count",count);
        return "login-success";
    }

    public String logout(){
        System.out.println("退出登录");
        Integer count = (Integer) applicationMap.get("count");
        if (count != null && count > 0){
            count --;
            applicationMap.put("count",count);
        }
        if (sessionMap instanceof SessionMap) {
            SessionMap sm = (SessionMap) sessionMap;
            sm.invalidate();
        }
        return "logout";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = map;
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.applicationMap = map;
    }
}
