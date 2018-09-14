package cap.action;
import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;
@ParentPackage("login")
@Namespace("/")
@InterceptorRefs(@InterceptorRef(value = "mystack"))
@Results({@Result(name = "success", location = "/result.jsp"),
        @Result(name = "login", location = "/login.jsp")})
public class TimerAction extends ActionSupport {
    @Action(value = "count", results = {
            @Result(name = "success", location = "result.jsp")
    })
    public String count(){
        try{
            Thread.sleep(500);

        }catch(Exception e){
            e.printStackTrace();
        }
        return  SUCCESS;
    }
}
