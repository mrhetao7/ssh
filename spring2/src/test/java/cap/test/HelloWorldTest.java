package cap.test;

import cap.service.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class HelloWorldTest {
    @Test
    public void testSayHi(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.SayHi("cap"));
    }
    @Test
    public void testSayHi1(){
        Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        HelloWorld helloWorld=(HelloWorld) factory.getBean("helloWorld");
        System.out.println(helloWorld.SayHi("root1"));
    }
    @Test
    public void testSayHi2(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorld helloWorld=(HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.SayHi("cap2"));
    }
}
