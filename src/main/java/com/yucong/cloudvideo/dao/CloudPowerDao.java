package com.yucong.cloudvideo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yucong.cloudvideo.entity.CloudPower;

public interface CloudPowerDao extends JpaRepository<CloudPower, Long> {


    /**
     * 获取所有开通云视讯的用户id
     */
    @Query("select p from CloudPower p where p.corpId = :corpId and p.isDel = '0'")
    Page<CloudPower> findByCorpId(@Param("corpId") String corpId, Pageable pageable);

    /**
     * 根据ids批量删除CloudPower，将isDel状态值改为 1
     */
    @Modifying
    @Query("update CloudPower c set c.isDel = '1' where c.userId in (:ids)")
    int deleteByids(@Param("ids") List<String> ids);

    /**
     * 校验该用户是否开通视频会议 and 批量保存判断用户是否存在，不需要判断参数isDel
     */
    @Query("select p from CloudPower p where p.corpId = :corpId and p.mobile = :mobile")
    CloudPower findByCorpIdAndMobile(@Param("corpId") String corpId, @Param("mobile") String mobile);

    /**
     * 查询mobiles是否存在
     */
    // @Query(nativeQuery = true, value = "select c.mobile from vwt_cloud_power c where c.mobile in
    // (:mobiles) and c.is_del = '0'")
    @Query("select c.mobile from CloudPower c where c.mobile in (:mobiles) and c.isDel = '0'")
    List<String> findByMobiles(@Param("mobiles") List<String> mobiles);

    // @Query(nativeQuery = true, value = "select c.virtaul_user_id from vwt_cloud_power c where
    // c.virtaul_user_id in (:virtualIds) and c.is_del = '0'")

    @Query("select c.virtaulUserId from CloudPower c where c.virtaulUserId in (:virtualIds) and c.isDel = '0'")
    List<String> judgeVirtualIdIsExist(@Param("virtualIds") List<String> virtualIds);

}
