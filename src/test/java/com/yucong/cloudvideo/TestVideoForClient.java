package com.yucong.cloudvideo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
    public void test_findByMeetId() {

        List<CloudPower> meetId = cloudPowerDao.findByMeetId("");

        System.out.println(JSON.toJSONString(meetId));

    }
}
