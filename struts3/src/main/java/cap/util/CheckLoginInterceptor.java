package cap.util;

import cap.action.LoginAction;
import cap.bean.Admin;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;
public class CheckLoginInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("开始拦截");
        Object o=actionInvocation.getAction();
        if(o instanceof LoginAction){
            System.out.println("不用拦截");
            return actionInvocation.invoke();
        }
        Map<String,Object> session=actionInvocation.getInvocationContext().getSession();
        Admin admin=(Admin)session.get("admin");
        if(admin!=null){
            System.out.println("不用拦截");
            return  actionInvocation.invoke();
        }else {
            System.out.println("重新登录");
            return Action.LOGIN;
        }
    }
}
