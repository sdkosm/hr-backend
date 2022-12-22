package com.hrms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Authority class for Authority if we want like admin, user etc
//Authority data parameter

@Table(name = "role_master")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Role_master implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "role_description")
    private String roleDescription;

    //This is implemented method ( GrantAuthority )

    @Override
    public String getAuthority() {

        return roleCode;
    }

    //Getter and Setter

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getRoleCode() {
        return roleCode;
    }


    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }


    public String getRoleDescription() {
        return roleDescription;
    }


    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }


}
