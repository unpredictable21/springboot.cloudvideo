package com.yucong.cloudvideo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yucong.cloudvideo.entity.MeetMember;

public interface MeetMenberDao extends JpaRepository<MeetMember, Long> {

    /**
     * 根据会议id查询所有参会人员mobile，不包括发起人
     */
    @Query("select p.mobile from MeetMember m, CloudPower p where m.userId = p.userId and m.meetId = :meetId and m.role = '2' and p.isDel = '0'")
    List<String> findAllMobileByMeetId(@Param("meetId") String meetId);

    /**
     * 根据ids批量删除MeetMember
     */
    @Modifying
    @Query("delete from MeetMember c where c.userId in (:ids)")
    int deleteByids(@Param("ids") List<String> ids);

    /**
     * 根据会议id查询会议发起人姓名
     */
    @Query("select p.username from CloudPower p, MeetMember m where m.userId = p.userId and m.meetId = :meetId and m.role = '1'")
    String findCreatorByMeetId(@Param("meetId") String meetId);

    @Query("select m.userId from MeetMember m where m.meetId = :meetId")
    List<String> findAllUserIdByMeetId(@Param("meetId") String meetId);

    /**
     * 根据会议id删除开会人员
     */
    @Modifying
    int deleteByMeetId(String meetId);

}
