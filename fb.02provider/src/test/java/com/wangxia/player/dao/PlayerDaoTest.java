package com.wangxia.player.dao;

import com.wangxia.player.entity.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by archer on 2017/4/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class PlayerDaoTest {
    @Resource
    private PlayerDao playerDao;
    @Test
    public void selectPlayerByLogin() throws Exception {
        String account = "wangyu";
        String password = "123456";
        Player player = playerDao.selectPlayerByLogin(account,password);
        System.out.println(player);
    }

    @Test
    public void insertPlayerByLogin() throws Exception {
        String name = "王宇";
        String account = "wangyu";
        String password = "123456";
        int i = playerDao.insertPlayerByLogin(name,account,password);
        System.out.println(i);

    }

}