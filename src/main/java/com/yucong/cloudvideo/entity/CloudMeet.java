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
    @Column(name = "meet_id")
    private String meetId;

    /** 开会人员 */
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, mappedBy = "meetId")
    private List<MeetMember> meetMembers;

    /** 会议创建人，关联CloudPower中的userId */
    @Column(name = "creator_id")
    private String creatorId;

    /** 会议类型：0预约会议，1即时会议，2周期会议 */
    @Column(name = "meet_type")
    private String meetType;

    /** 预约会议-是否发出通知：0未通知，1已通知，即时会议立即发送通知 */
    @Column(name = "is_msg")
    private String isMsg;

    /** 创建时间 */
    @Column(name = "create_time")
    private Date createTime;


    /** 会议开始时间，第三方提供 */
    @Column(name = "start_time")
    private Date startTime;

    /** 会议结束时间，第三方提供 */
    @Column(name = "end_time")
    private Date endTime;

    /** 会议主题，第三方提供 */
    @Column(name = "topic ")
    private String topic;

    /** 会议号码，第三方提供 */
    @Column(name = "meeting_no ")
    private String meetingNo;

    /** 会议时长，单位分钟，不能小于30分钟，不能大于6个小时，必须在60天内，不能小于当前时间，第三方提供 */
    @Column(name = "duration ")
    private String duration;

    /** 会议类型，第三方提供，0普通会议 1高清会议 */
    @Column(name = "meeting_type ")
    private String meetingType;

    /** 会议信息，记录第三方的json数据 */
    @Column(name = "note ")
    private String note;

    public String getMeetId() {
        return meetId;
    }

    public void setMeetId(String meetId) {
        this.meetId = meetId;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMeetingNo() {
        return meetingNo;
    }

    public void setMeetingNo(String meetingNo) {
        this.meetingNo = meetingNo;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
