package cn.pers.service.impl;

import cn.pers.domain.Car;
import cn.pers.domain.User;
import cn.pers.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JohnBi on 2017/11/14. 20:43
 *
 * @author Lemon
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("保存了用户: " + user);
    }

    @Override
    public void delete(Integer id) {
        System.out.println("删除了用户: " + id);
    }

    @Override
    public void update(User user) {
        System.out.println("更新了用户: " + user);
    }

    @Override
    public User getOne(Integer id) {
        System.out.println("获取了用户: " + id);
        return new User(1, "rose", "北京");
    }

    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "jack", "NewYork"));
        list.add(new User(2, "Mike", "Japan"));
        return list;
    }

    @Override
    public List<Car> findUserCars(User user) {
        System.out.println("传入的用户为: " + user);
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "奔驰", 99d));
        list.add(new Car(2, "宝马", 98d));
        return list;
    }
}
