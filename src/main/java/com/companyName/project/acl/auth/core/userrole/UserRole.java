package com.companyName.project.acl.auth.core.userrole;

import com.companyName.project.acl.auth.core.role.Role;
import com.companyName.project.acl.auth.core.user.User;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ACL_USER_ROLE")
public class UserRole {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // its not work here
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    User user;
    @ManyToOne
    Role role;

    // System log fields
    Date creationDateTime;
    String creationUser;
    Date lastUpdateDateTime;
    String lastUpdateUser;


    public UserRole(){
    }
    public UserRole(User user, Role role, Date creationDateTime, String creationUser) {
        this.user = user;
        this.role = role;
        this.creationDateTime = creationDateTime;
        this.creationUser = creationUser;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Date getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(Date lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }


}
