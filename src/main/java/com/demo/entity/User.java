package com.demo.entity;

/**
 * @Auther: geguofeng
 * @Date: 2019/1/10
 * @Description:
 */
public class User {

    private int id;

    private String username;

    private String password;

    private Double account;
    private Integer gender;

    private String genderEnum;

    private String idCard;

    private Boolean perset;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getGenderEnum() {
        return genderEnum;
    }

    public void setGenderEnum(String genderEnum) {
        this.genderEnum = genderEnum;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Boolean getPerset() {
        return perset;
    }

    public void setPerset(Boolean perset) {
        this.perset = perset;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                ", gender=" + gender +
                ", genderEnum='" + genderEnum + '\'' +
                ", idCard='" + idCard + '\'' +
                ", perset=" + perset +
                '}';
    }
}
