package com.yucong.cloudvideo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yucong.cloudvideo.entity.CloudPower;

public interface CloudPowerDao extends JpaRepository<CloudPower, Long> {


    /**
     * 获取所有开通云视讯的用户id
     */
    // @Query("select p from CloudPower p where p.corpId = :corpId")
    Page<CloudPower> findByCorpId(PageRequest page);
}
