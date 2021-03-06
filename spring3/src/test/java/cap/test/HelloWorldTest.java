package cap.test;

import cap.service.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testSayHello(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld= (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.SayHello("cap"));
    }
    @Test
    public void testSayHello2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld2");
        System.out.println(helloWorld.SayHello("cap201x"));

    }

    @Test
    public void testSayHello3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld3");
        System.out.println(helloWorld.SayHello("cap2018x"));

    }

    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld h1 = (HelloWorld) context.getBean("helloWorld3");
        HelloWorld h2 = (HelloWorld) context.getBean("helloWorld3");
        System.out.println(h1.equals(h2));

    }
}
