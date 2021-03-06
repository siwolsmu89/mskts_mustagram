package com.muskets.mustagram.vo;

public class User {
    private String id;
    private String name;
    private String password;
    private String telephone;
    private String email;
    private String gender;
    private String birthdate;
    private String address;
    private String image;
    private String nickname;
    private String sns;

    public User() {}

    public String toString() {
        String result = "";

        result += "User ID: " + id;
        result += "\nUser Name: " + name;
        result += "\nUser password: " + password.replaceAll(".", "*");
        result += "\nUser telePhone: " + telephone;
        result += "\nUser email: " + email;
        result += gender != null ? "\nUser Gender: " + gender : "";
        result += birthdate != null ? "\nUser Birthdate: " + birthdate : "";
        result += address != null ? "\nUser Address: " + address : "";
        result += image != null ? "\nUser Image: " + image : "";
        result += "\nUser Nickname: " + nickname;
        result += "\nUser SNS: " + sns;

        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSns() {
        return sns;
    }

    public void setSns(String sns) {
        this.sns = sns;
    }
}
