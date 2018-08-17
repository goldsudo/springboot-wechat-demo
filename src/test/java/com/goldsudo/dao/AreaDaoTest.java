package com.goldsudo.dao;

import com.goldsudo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() throws Exception {
        List<Area> list = areaDao.queryArea();
        assertEquals(2,list.size());
    }

    @Test
    public void queryAreaById() throws Exception {
        Area area = areaDao.queryAreaById(1001);
        assertEquals("北京",area.getAreaName());
    }

    @Test
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaName("new");
        area.setPriority(4);
        int row = areaDao.insertArea(area);
        assertEquals(1,row);
    }

    @Test
    public void updateArea() throws Exception {
        Area area = new Area();
        area.setAreaId(1003);
        area.setAreaName("中国上海");
        area.setPriority(100);
        int row = areaDao.updateArea(area);
        assertEquals(1,row);
    }

    @Test
    public void deleteArea() throws Exception {
        int row = this.areaDao.deleteArea(1004);
        assertEquals(1,row);
    }
}