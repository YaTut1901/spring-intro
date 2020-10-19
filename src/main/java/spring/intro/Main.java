package spring.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user1 = new User("user1@gmail.com", "password");
        User user2 = new User("user2@gmail.com", "password");
        User user3 = new User("user3@gmail.com", "password");

        userService.add(user1);
        userService.add(user2);
        userService.add(user3);

        userService.listUsers().forEach(System.out::println);
    }
}
