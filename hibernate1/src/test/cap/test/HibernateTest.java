package cap.test;

import cap.bean.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import javax.security.auth.login.Configuration;

public class HibernateTest {
    private SessionFactory sessionFactory;

    @Before
    public void init(){
        org.hibernate.cfg.Configuration configuration=new org.hibernate.cfg.Configuration().configure();
        sessionFactory=configuration.buildSessionFactory();
    }

    @Test
    public void testAdd() {
        Session session = sessionFactory.openSession(); //开启事务
        Transaction tx = session.beginTransaction();
        Product product = new Product();
        product.setStock(12);        //添加数据
        product.setPrice(33.0);
        product.setName("jsp ");
        product.setSerialNumber("vfdfd");
        session.save(product);   //保存
        tx.commit();
        session.close();

    }
    @Test
    public void testFind(){
        Session session=sessionFactory.openSession();
        Product product=session.get(Product.class,1);
        System.out.println(product.getName()+":"+product.getSerialNumber());
        session.close();

    }
}
