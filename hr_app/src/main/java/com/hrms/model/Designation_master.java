package com.hrms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "designation_master")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Designation_master {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "designation_code")
    private String designation_code;

    @Column(name = "designation_description")
    private String designation_desc;

    @Column(name = "created_date")
    private Timestamp created_date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesignation_code() {
        return designation_code;
    }

    public void setDesignation_code(String designation_code) {
        this.designation_code = designation_code;
    }

    public String getDesignation_desc() {
        return designation_desc;
    }

    public void setDesignation_desc(String designation_desc) {
        this.designation_desc = designation_desc;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public Designation_master(Integer id, String designation_code, String designation_desc, Timestamp created_date) {
        this.id = id;
        this.designation_code = designation_code;
        this.designation_desc = designation_desc;
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Designation_master{" +
                "id=" + id +
                ", designation_code='" + designation_code + '\'' +
                ", designation_desc='" + designation_desc + '\'' +
                ", created_date=" + created_date +
                '}';
    }
}
