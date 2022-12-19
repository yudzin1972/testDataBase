package com.example.testDataBase.entity;

import com.example.testDataBase.classes.MyTemp;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "temp")
public class TempEntity extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "field2")
    private MyTemp field2;

    @Column(name="d1")
    @JsonFormat(pattern = "dd.MM.yyyy HH:mm:ss",timezone = "Europe/Minsk")
    private Date d1;

    public TempEntity() {
    }

    public MyTemp getField2() {
        return field2;
    }

    public void setField2(MyTemp field2) {
        this.field2 = field2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }
}
