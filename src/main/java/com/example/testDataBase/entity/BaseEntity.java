package com.example.testDataBase.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass

public class BaseEntity {
    @CreatedDate
    @Column(name = "created")
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss",timezone = "Europe/Minsk")
    private Date created;
    @LastModifiedDate
    @Column(name = "updated")
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss",timezone = "Europe/Minsk")
    private Date updated;

    @Column(name = "status")
    private String status;

    public BaseEntity() {
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
