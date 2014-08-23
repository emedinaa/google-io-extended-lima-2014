package com.gdglima.myapp.entity;

import java.io.Serializable;

/**
 * Created by ALUMNO on 23/08/2014.
 */
public class UserEntity implements Serializable {

    private int id;
    private String name;
    private String skills;
    private int img;

    public UserEntity(int id, String name, String skills, int img) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.img = img;
    }

    public UserEntity(int id, String name, String skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
