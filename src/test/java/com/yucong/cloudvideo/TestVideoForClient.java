package com.yucong.cloudvideo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yucong.CloudVideoApp;
import com.yucong.cloudvideo.dao.CloudMeetDao;
import com.yucong.cloudvideo.dao.CloudPowerDao;
import com.yucong.cloudvideo.dao.MeetMenberDao;
import com.yucong.cloudvideo.entity.CloudMeet;

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
    public void test_deleteByMeetId() {

        CloudMeet cloudMeet = new CloudMeet();
        cloudMeet.setMeetId("111");
        cloudMeet.setIsMsg("1");

        cloudMeetDao.save(cloudMeet);

    }
}
