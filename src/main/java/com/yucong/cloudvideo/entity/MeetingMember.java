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
public class MeetingMember implements Serializable {

    private static final long serialVersionUID = 326519822203933465L;

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "vwt_cloud_member_gen")
    @SequenceGenerator(name = "vwt_cloud_member_gen", sequenceName = "vwt_cloud_member_seq", allocationSize = 1)
    private Long id;

    /** 会议id，关联到CloudMeeting中的meetingId */
    @Column(name = "meeting_id")
    private String meetingId;

    /** 关联CloudPower中的userId */
    @Column(name = "user_id")
    private String userId;

    /** 是否进入会议：0未进入，1已进入 */
    @Column(name = "status")
    private String status;

}
