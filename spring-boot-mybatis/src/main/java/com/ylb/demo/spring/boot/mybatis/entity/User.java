package com.ylb.demo.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "ylbdb..user")
public class User {
    @Id
    private String uid;

    private String name;

    private String email;

    private String tele;

    private Long age;

    /**
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return tele
     */
    public String getTele() {
        return tele;
    }

    /**
     * @param tele
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * @return age
     */
    public Long getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Long age) {
        this.age = age;
    }
}