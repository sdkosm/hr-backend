package com.hrms.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "offer_letter_issue_info")

public class LetterCreation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String role_id;
    private String name;
    private String email_id;
    private String mobile_no;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date issued_date;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private Date joining_date;
    private double ctc;
    private Integer variable_percentage;
    private Integer created_by;
    private Timestamp created_date;
    private String designation_id;
    private String address;

    public Integer getEmployee_id() {
        return id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.id = employee_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Date getIssued_date() {
        return issued_date;
    }

    public void setIssued_date(Date issued_date) {
        this.issued_date = issued_date;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public double getCtc() {
        return ctc;
    }

    public void setCtc(double ctc) {
        this.ctc = ctc;
    }

    public Integer getVariable_percentage() {
        return variable_percentage;
    }

    public void setVariable_percentage(Integer variable_percentage) {
        this.variable_percentage = variable_percentage;
    }


    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Timestamp created_date) {
        this.created_date = created_date;
    }

    public String getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(String designation_id) {
        this.designation_id = designation_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LetterCreation(Integer employee_id, String role_id, String name, String email_id, String mobile_no,
                          Date issued_date, Date joining_date, double ctc, Integer variable_percentage, Integer created_by,
                          Timestamp created_date, String designation_id, String address) {
        super();
        this.id = employee_id;
        this.role_id = role_id;
        this.name = name;
        this.email_id = email_id;
        this.mobile_no = mobile_no;
        this.issued_date = issued_date;
        this.joining_date = joining_date;
        this.ctc = ctc;
        this.variable_percentage = variable_percentage;
        this.created_by = created_by;
        this.created_date = created_date;
        this.designation_id = designation_id;
        this.address = address;
    }


    @Override
    public String toString() {
        return "LetterCreation [employee_id=" + id + ", role_id=" + role_id + ", name=" + name + ", email_id="
                + email_id + ", mobile_no=" + mobile_no + ", issued_date=" + issued_date + ", joining_date="
                + joining_date + ", ctc=" + ctc + ", variable_percentage=" + variable_percentage + ", created_by="
                + created_by + ", created_date=" + created_date + ", designation_id=" + designation_id + ", address="
                + address + "]";
    }


}
