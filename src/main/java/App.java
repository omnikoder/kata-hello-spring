import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            var helloBean1 = applicationContext.getBean("helloworld", HelloWorld.class);
            var helloBean2 = applicationContext.getBean("helloworld", HelloWorld.class);
            var catBean1 = applicationContext.getBean(Cat.class, "Puma");
            var catBean2 = applicationContext.getBean(Cat.class, "Lion");

            System.out.printf("\u001b[33m%s\u001b[0m == \u001b[33m%s\u001b[0m: \u001b[32m%b\u001b[0m\n",
                    helloBean1, helloBean2, helloBean1 == helloBean2);
            System.out.printf("\u001b[33m%s\u001b[0m %s == \u001b[33m%s\u001b[0m %s: \u001b[31m%b\u001b[0m\n",
                    catBean1, catBean1.getName(),
                    catBean2, catBean2.getName(),
                    catBean1 == catBean2);
        }
    }
}