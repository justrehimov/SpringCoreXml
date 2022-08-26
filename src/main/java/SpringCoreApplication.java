import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Coach coach = context.getBean("footballCoach", Coach.class);
        Coach coach2 = context.getBean("footballCoach", Coach.class);
        System.out.println(coach.hashCode());
        System.out.println(coach2.hashCode());
        System.out.println(coach.eatEgg());
    }
}
