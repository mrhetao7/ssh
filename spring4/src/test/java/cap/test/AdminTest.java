package cap.test;

import cap.bean.Admin;
import cap.service.AdminService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminTest {
    ApplicationContext context=null;
    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testAdmin(){
        Admin admin=(Admin) context.getBean("admin");
        System.out.println("ID:"+admin.getId()+"\n"+"姓名:"+admin.getUsernmae()+"\n"+"密码:"+admin.getPassword());
    }
    @Test
    public void testAdmin1(){
        Admin admin=new Admin();
        admin.setId(1);
        admin.setUsernmae("admin1");
        admin.setPassword("admin1");
        System.out.println("ID:"+admin.getId()+"\n"+"姓名:"+admin.getUsernmae()+"\n"+"密码:"+admin.getPassword());
    }
    @Test
    public void testAdmin2(){
        Admin admin=(Admin) context.getBean("admin2");
        System.out.println("ID:"+admin.getId()+"\n"+"姓名:"+admin.getUsernmae()+"\n"+"密码:"+admin.getPassword());
    }
    @Test
    public void testAdmin3(){
        Admin admin=(Admin) context.getBean("admin3");
        System.out.println("ID:"+admin.getId()+"\n"+"姓名:"+admin.getUsernmae()+"\n"+"密码:"+admin.getPassword());
    }
    @Test
    public void testSayHello(){
        AdminService adminService=(AdminService)context.getBean("adminService");
        System.out.println(adminService.SayHello());
    }

}
