package com.yucong.cloudvideo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vwt_cloud_member")
public class MeetMember implements Serializable {

    private static final long serialVersionUID = 326519822203933465L;

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "vwt_cloud_member_gen")
    @SequenceGenerator(name = "vwt_cloud_member_gen", sequenceName = "vwt_cloud_member_seq", allocationSize = 1)
    private Long id;

    /** 会议id，关联到CloudMeet中的id */
    @Column(name = "meet_id")
    private String meetId;

    /** 关联CloudPower中的userId */
    @Column(name = "user_id")
    private String userId;

    /** 此次会议角色：1主持人，2参会人 */
    @Column(name = "role")
    private String role;

}
