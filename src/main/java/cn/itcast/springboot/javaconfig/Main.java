package cn.itcast.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService service = context.getBean(UserService.class);
        List<User> list = service.query();

        for (User user : list) {
            System.out.println(user.getSex() + ", " + user.getName() + ", " + user.getAge());
        }

        // 销毁该容器
        context.destroy();
    }
}
