package com.wangxia.player;

import com.wangxia.info.Info;

/**
 * Created by archer on 2017/4/8.
 */
public interface PlayerInterface {

    /**
     * 1.注册
     * @param name
     * @param account
     * @param password
     * @return
     */
    Info register(String name,String account,String password);

    /**
     * 2.登陆
     * @param account
     * @param password
     * @return
     */
    Info Login(String account,String password);
}
