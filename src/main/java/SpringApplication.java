import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver1.startTheTransport();
        driver2.startTheTransport();
        driver3.startTheTransport();
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
        context.close();
    }
}
