package com.example.testDataBase.model;

import com.example.testDataBase.entity.UserEntity;

public class User {
    private Long id;
    private String name;
    private String email;
    private Byte[] photoData;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte[] getPhotoData() {
        return photoData;
    }

    public void setPhotoData(Byte[] photoData) {
        this.photoData = photoData;
    }
    public static User toModel(UserEntity userEntity){
        User user = new User();
        user.setId(userEntity.getId());
        user.setName(userEntity.getName());
        user.setEmail(userEntity.getEmail());
        user.setPhotoData(userEntity.getPhotoData());
        return user;
    }
}
