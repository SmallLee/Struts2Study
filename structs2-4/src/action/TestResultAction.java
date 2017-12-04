package action;

import com.sun.net.httpserver.Authenticator;

public class TestResultAction {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public String execute(){
        if (number == 0) {
            return "success";
        } else if (number == 1) {
            return "error";
        } else {
            return "login";
        }
    }
}
