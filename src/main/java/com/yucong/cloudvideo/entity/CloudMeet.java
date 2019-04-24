package com.yucong.cloudvideo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 云视讯-会议实体类
 *
 */
@Entity
@Table(name = "vwt_cloud_meet")
public class CloudMeet implements Serializable {

    private static final long serialVersionUID = 3536855375264200130L;

    /** 主键 */
    /** 会议id，由第三方提供 */
    @Id
    private String id;

    /** 开会人员 */
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "meetId")
    private List<MeetMember> meetMembers;

    /** 会议创建人，关联CloudPower中的userId */
    @Column(name = "creator_id")
    private String creatorId;

    /** 企会议类型：0预约会议，1即时会议，2周期会议 */
    @Column(name = "meet_type")
    private String meetType;

    /** 预约会议是否发出通知：0未通知，1已通知，即时会议立即发送通知 */
    @Column(name = "isMsg")
    private String isMsg;

    /** 创建时间 */
    @Column(name = "create_time")
    private Date createTime;

    /** 预约时间 */
    @Column(name = "order_time")
    private Date orderTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<MeetMember> getMeetMembers() {
        return meetMembers;
    }

    public void setMeetMembers(List<MeetMember> meetMembers) {
        this.meetMembers = meetMembers;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getMeetType() {
        return meetType;
    }

    public void setMeetType(String meetType) {
        this.meetType = meetType;
    }

    public String getIsMsg() {
        return isMsg;
    }

    public void setIsMsg(String isMsg) {
        this.isMsg = isMsg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

}
