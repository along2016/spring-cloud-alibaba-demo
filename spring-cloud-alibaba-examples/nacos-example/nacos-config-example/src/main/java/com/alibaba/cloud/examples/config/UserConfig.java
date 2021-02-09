package com.alibaba.cloud.examples.config;

import com.alibaba.cloud.examples.entity.User;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2021/2/7 0007.
 */
@ConfigurationProperties(prefix = "user")
public class UserConfig {

    private String name;

    private int age;

    private String hr;

    private Map<String, Object> map;

    private List<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hr='" + hr + '\'' +
                ", map=" + map +
                ", users=" + users +
                '}';
    }
}
