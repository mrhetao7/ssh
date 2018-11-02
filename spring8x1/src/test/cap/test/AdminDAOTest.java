package cap.test;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDAOTest {
    private  ApplicationContext applicationContext;
    @Before
    public void init(){
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindAll(){
        AdminDAO adminDAO= (AdminDAO) applicationContext.getBean("adminDAO");
        List<Admin> adminList=adminDAO.findAdmins();
        for(Admin admin:adminList){
            System.out.println("ID:"+admin.getId()+" "+"用户:"+admin.getUsername()+" "+"密码:"+admin.getPassword());
        }
    }
    @Test
    public void testFindById(){
        AdminDAO adminDAO= (AdminDAO) applicationContext.getBean("adminDAO");
        Admin admin=adminDAO.findById(18);
        System.out.println("ID:"+admin.getId()+" "+"用户:"+admin.getUsername()+" "+"密码:"+admin.getPassword());
    }
    @Test
    public  void testUpdaAdmin(){
        AdminDAO adminDAO= (AdminDAO) applicationContext.getBean("adminDAO");
        Admin admin=new Admin(18,"cap","cap");
        int res=adminDAO.updaAdmin(admin);
        assert res==1;
    }
    @Test
    public void testDelAdmin(){
        AdminDAO adminDAO= (AdminDAO) applicationContext.getBean("adminDAO");
        int res=adminDAO.delAdmin(23);
        assert res==1;
    }
    @Test
    public void testAddAdmin(){
        AdminDAO adminDAO= (AdminDAO) applicationContext.getBean("adminDAO");
        Admin admin=new Admin("cap3","cap3");
        int res=adminDAO.addAdmin(admin);
        assert res==1;
    }
}
