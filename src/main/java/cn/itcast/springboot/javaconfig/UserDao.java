package cn.itcast.springboot.javaconfig;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> query() {
        List<User> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(i);
            user.setName("name_" + i);
            user.setSex("sex_" + i);
            result.add(user);
        }
        return result;
    }
}
