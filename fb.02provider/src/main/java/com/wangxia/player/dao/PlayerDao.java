package com.wangxia.player.dao;

import com.wangxia.player.entity.Player;
import org.apache.ibatis.annotations.Param;

/**
 * Created by archer on 2017/4/8. 😄
 */
public interface PlayerDao {
    /**
     * 1.根据账号密码查找到player，获取到player的信息(gold)
     * @param account
     * @param password
     * @return
     */
    Player selectPlayerByLogin(@Param("account") String account , @Param("password") String password);

    /**
     * 2.根据账号密码姓名添加一条记录
     * @param name
     * @param account
     * @param password
     * @return
     */
    int insertPlayerByLogin(@Param("name") String name,@Param("account") String account , @Param("password") String password);




}
