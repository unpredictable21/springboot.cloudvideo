package com.yucong.cloudvideo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 云视讯-参会人员实体类
 *
 */
@Entity
@Table(name = "vwt_cloud_member")
public class MeetMember implements Serializable {

    private static final long serialVersionUID = 326519822203933465L;

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 会议id，关联到CloudMeet中的id */
    @Column(name = "meet_id")
    private String meetId;

    /** userId */
    @Column(name = "user_id")
    private String userId;

    /** 此次会议角色：1主持人，2参会人 */
    @Column(name = "role")
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
