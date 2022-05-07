import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            HelloWorld bean = applicationContext.getBean("helloworld", HelloWorld.class);
            System.out.println(bean.getMessage());
        }
    }
}