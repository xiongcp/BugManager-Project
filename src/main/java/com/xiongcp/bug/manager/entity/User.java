package com.xiongcp.bug.manager.entity;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class User {
    private Long id;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", pswd='" + pswd + '\'' +
                ", createTime=" + createTime +
                ", lastLoginTime=" + lastLoginTime +
                ", status=" + status +
                ", icon=" + Arrays.toString(icon) +
                ", roleStrlist=" + roleStrlist +
                ", perminsStrlist=" + perminsStrlist +
                '}';
    }

    @NotNull
    private String nickname;

    @NotNull
    private String email;

    @NotNull
    private String pswd;

    private Date createTime;

    private Date lastLoginTime;

    private Long status;

    private byte[] icon;
    private List<String> roleStrlist;
    private List<String> perminsStrlist;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }

    public void setRoleStrlist(List<String> roleStrlist) {
        this.roleStrlist = roleStrlist;
    }

    public void setPerminsStrlist(List<String> perminsStrlist) {
        this.perminsStrlist = perminsStrlist;
    }

    public List<String> getRoleStrlist() {
        return roleStrlist;
    }

    public List<String> getPerminsStrlist() {
        return perminsStrlist;
    }
}