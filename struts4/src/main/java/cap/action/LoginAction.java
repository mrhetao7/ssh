package cap.action;

import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.convention.annotation.*;
import java.util.Map;
@ParentPackage("login")
@Namespace("/")
@InterceptorRefs(@InterceptorRef(value = "mystack"))
@Results({@Result(name = "success", location = "/result.jsp"),
        @Result(name = "login", location = "/login.jsp")})
public class LoginAction extends ActionSupport implements SessionAware {   //实现SessionAware接口
    private Admin admin;
    Map<String,Object>session;   //提供一个参数，session,赋值给admin

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    @Action(value = "login", results = {
            @Result(name = "success", location = "/result.jsp"),
            @Result(name = "error", location = "/error.jsp"),
            @Result(name = "input", location = "/login.jsp")}
    )
    public String login(){
        if(admin.getUsername().equals("cap")&&admin.getPassword().equals("cap")){
            session.put("admin",admin);     //将全局变量加到session里面
            return SUCCESS;
        }else{
            return ERROR;
        }
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session=session;    //设置变量


    }
}
