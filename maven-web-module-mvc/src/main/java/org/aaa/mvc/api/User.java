package org.aaa.mvc.api;

/**
 * @Author:江Sir
 * @Date:03 2022/09/03 15:14
 * @description: Exercise
 * @Version 1.0.0
 */
public class User {
    private Integer id;
    private String username;

    public User() {
    }

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
