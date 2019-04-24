package com.yucong.cloudvideo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.yucong.CloudVideoApp;
import com.yucong.cloudvideo.dao.CloudMeetDao;
import com.yucong.cloudvideo.dao.CloudPowerDao;
import com.yucong.cloudvideo.dao.MeetMenberDao;
import com.yucong.cloudvideo.entity.CloudPower;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CloudVideoApp.class)
public class TestVideoForClient {

    @Autowired
    private CloudPowerDao cloudPowerDao;
    @Autowired
    private MeetMenberDao meetMenberDao;
    @Autowired
    private CloudMeetDao cloudMeetDao;

    @Test
    public void test_ddl() {}


    @Test
    public void test_findByCorpId() {
        Page<CloudPower> page = cloudPowerDao.findByCorpId(PageRequest.of(0, 2));

        System.out.println(JSON.toJSONString(page.getContent()));
    }

}
