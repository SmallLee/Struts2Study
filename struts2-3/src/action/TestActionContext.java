package action;

import com.opensymphony.xwork2.ActionContext;
import com.sun.xml.internal.ws.developer.ServerSideException;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.dispatcher.SessionMap;

import java.util.Map;

public class TestActionContext {
    public String execute(){
        System.out.println("execute");
        ActionContext actionContext = ActionContext.getContext();
        //1.获取application对应的map
        Map<String, Object> applicationMap = actionContext.getApplication();
        applicationMap.put("application","applicationValue");
        //获取session对应的map
        Map<String, Object> sessionMap = actionContext.getSession();
        sessionMap.put("sessionKey","sessionValue");
        if (sessionMap instanceof SessionMap){
            SessionMap sm = (SessionMap) sessionMap;
            sm.invalidate();
        }
        //3.获取request
        Map<String,Object> requestMap = (Map<String, Object>) actionContext.get("request");
        //4.获取请求参数对应的map,这个map只能读不能写入数据
        HttpParameters parameters = actionContext.getParameters();
        Parameter parameter = parameters.get("name");
        System.out.println(parameter.getValue());
        return "success";
    }
}
