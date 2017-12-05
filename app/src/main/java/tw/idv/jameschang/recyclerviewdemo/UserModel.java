package tw.idv.jameschang.recyclerviewdemo;

/**
 * Created by cyy on 2017/12/5.
 */

public class UserModel {
    String account;
    String sport;
    String sex;
    int age;

    public UserModel(String account, String sport, String sex, int age) {
        this.account = account;
        this.sport = sport;
        this.sex = sex;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
