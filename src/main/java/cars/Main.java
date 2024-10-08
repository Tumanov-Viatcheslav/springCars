package cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void ex1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context1.xml");
        Car car = context.getBean("car1", Car.class);
        Human owner = context.getBean("owner1", Human.class);
        System.out.println(owner);
        System.out.println(car);
        System.out.println("======================================");
    }

    public static void ex2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("context2.xml");
        Car car1 = context.getBean("car1", Car.class);
        Car car2 = context.getBean("car2", Car.class);
        Human owner1 = context.getBean("owner1", Human.class);
        Human owner2 = context.getBean("owner2", Human.class);
        Human owner3 = context.getBean("owner3", Human.class);
        System.out.println(owner1);
        System.out.println(owner2);
        System.out.println(owner3);
        System.out.println(car1);
        System.out.println(car2);
    }

    public static void main(String[] args) {
        ex1();
        ex2();
    }
}