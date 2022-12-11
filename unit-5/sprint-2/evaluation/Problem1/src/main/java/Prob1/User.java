package Prob1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@NamedQuery(name="abc",query = "select e from User e where UserName=:name")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", p=" + p +
                '}';
    }

    private String UserName;
    private String emailId;
    @Embedded
    @ElementCollection
    @JoinTable(name = "Phone")
    private List<PhoneNumber> p=new ArrayList<>();

    public User() {
    }

    public User(String userName, String emailId, List<PhoneNumber> p) {
        UserName = userName;
        this.emailId = emailId;
        this.p = p;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<PhoneNumber> getP() {
        return p;
    }

    public void setP(List<PhoneNumber> p) {
        this.p = p;
    }
}
