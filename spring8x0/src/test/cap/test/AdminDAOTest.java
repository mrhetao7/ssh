package cap.test;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDAOTest {
    private ApplicationContext context=null;

    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testFindAll(){
        AdminDAO adminDAO= (AdminDAO) context.getBean("adminDAO");
        List<Admin> adminList=adminDAO.findAdmins();
        for(Admin admin:adminList){
            System.out.println("用户:"+admin.getUsername()+"密码:"+admin.getPassword());
        }
    }
    @Test
    public void testFindById(){
        AdminDAO adminDAO= (AdminDAO) context.getBean("adminDAO");
        Admin admin=adminDAO.findById(5);
        System.out.println("用户:"+admin.getUsername()+" "+"密码:"+admin.getPassword());
    }
    @Test
    public  void testAddAdmin(){
        AdminDAO adminDAO= (AdminDAO) context.getBean("adminDAO");
        Admin admin=new Admin("xxx","xxx");
        int res=adminDAO.addAdmin(admin);
        assert  res==1;
    }
    @Test
    public void testDelAdmin(){
        AdminDAO adminDAO= (AdminDAO) context.getBean("adminDAO");
        int res=adminDAO.delAdmin(19);
        assert  res==1;
    }
    @Test
    public void testUpdateAdmin(){
        AdminDAO adminDAO= (AdminDAO) context.getBean("adminDAO");
        Admin admin=new Admin(15,"xx","xx");
        int res=adminDAO.updateAdmin(admin);
        assert  res==1;
    }
}
