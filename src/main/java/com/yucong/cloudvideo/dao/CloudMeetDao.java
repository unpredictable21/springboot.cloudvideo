package com.yucong.cloudvideo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yucong.cloudvideo.entity.CloudMeet;

public interface CloudMeetDao extends JpaRepository<CloudMeet, String> {



    @Query("select m from CloudMeet m, CloudPower p where p.userId = m.creatorId and m.meetId = :meetId and p.mobile = :mobile")
    CloudMeet judgeIsCreator(@Param("meetId") String meetId, @Param("mobile") String mobile);


}
