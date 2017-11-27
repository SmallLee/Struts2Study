package action;

import com.opensymphony.xwork2.interceptor.ParameterNameAware;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class TestAwareAction  implements ApplicationAware,SessionAware,RequestAware{

    private Map<String,Object> applicationMap = null;

    public String execute(){
        applicationMap.put("app2","appvalue2");
        return "success";
    }

    @Override
    public void setApplication(Map<String, Object> map) {
        this.applicationMap = map;
    }

    @Override
    public void setRequest(Map<String, Object> map) {

    }

    @Override
    public void setSession(Map<String, Object> map) {

    }
}
