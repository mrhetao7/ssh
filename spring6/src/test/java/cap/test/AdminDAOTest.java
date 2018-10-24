package cap.test;

import cap.aop.CglibProxy;
import cap.aop.JDKProxy;
import cap.dao.AdminDAO;
import cap.dao.impl.AdminDAOImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminDAOTest {
    @Test
    public void testSayHello() {
        try {
            JDKProxy jdkProxy=new JDKProxy();
            AdminDAO adminDAO= (AdminDAO) jdkProxy.newOnject(new AdminDAOImpl());
            System.out.println(adminDAO.SayHello());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSayHi2() {
        try {
            CglibProxy proxy = new CglibProxy();
            AdminDAO adminDAO = (AdminDAO) proxy.createProxyObject(new AdminDAOImpl());
            System.out.println(adminDAO.SayHello());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSayHi3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDAO adminDAO = (AdminDAO) context.getBean("logProxy");
        System.out.println(adminDAO.SayHello());

    }

    @Test
    public void testSayHi4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        System.out.println(adminDAO.SayHello());

    }
}
