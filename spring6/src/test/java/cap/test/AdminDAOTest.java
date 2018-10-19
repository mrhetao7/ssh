package cap.test;

import cap.aop.CglibProxy;
import cap.aop.JDKProxy;
import cap.dao.AdminDAO;
import cap.dao.impl.AdminDAOImpl;
import org.junit.Test;

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
}
