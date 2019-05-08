package com.yucong.cloudvideo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 云视讯-人员权限实体类
 *
 */
@Entity
@Table(name = "vwt_cloud_power")
public class CloudPower implements Serializable {

    private static final long serialVersionUID = 5738879509242396501L;

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 用户id，通讯录获取 */
    @Column(name = "user_id")
    private String userId;

    /** 企业id */
    @Column(name = "corp_id")
    private String corpId;

    /** 手机号码 */
    @Column(name = "mobile")
    private String mobile;

    /** 用户名 */
    @Column(name = "username")
    private String username;

    /** 虚拟号码 */
    @Column(name = "virtual_mobile")
    private String virtualMobile;

    /** 虚拟用户id，获取virtualMobile时会返回虚拟userId */
    @Column(name = "virtaul_user_id")
    private String virtaulUserId;

    /** 是否删除：0未删除 1已删除 */
    @Column(name = "is_del")
    private String isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVirtualMobile() {
        return virtualMobile;
    }

    public void setVirtualMobile(String virtualMobile) {
        this.virtualMobile = virtualMobile;
    }

    public String getVirtaulUserId() {
        return virtaulUserId;
    }

    public void setVirtaulUserId(String virtaulUserId) {
        this.virtaulUserId = virtaulUserId;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

}
