package cn.pers.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by JohnBi on 2017/11/14. 20:39
 *
 * @author Lemon
 */
@XmlRootElement(name = "User")
public class User {
    private Integer id;
    private String username;
    private String city;

    public User() {
    }

    public User(Integer id, String username, String city) {

        this.id = id;
        this.username = username;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +

                ", username='" + username + '\'' +
                ", city='" + city + '\'' +
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
