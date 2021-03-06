package com.orient.login.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author panduanduan
 * @create 2018-07-18 10:47 AM
 */
public class ShiroSessionListener implements SessionListener {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ShiroSessionListener.class);

    @Override
    public void onStart(Session session) {//会话创建时触发
        logger.warn("会话创建：" + session.getId());
    }

    @Override
    public void onExpiration(Session session) {//会话过期时触发
        Date lastAccessTime = session.getLastAccessTime();
        Date now = new Date();
        long during = (now.getTime() - lastAccessTime.getTime()) / 1000;
        logger.warn("会话过期：" + session.getId() + ";存在间隔：" + during + "s;");
    }

    @Override
    public void onStop(Session session) {//退出时触发
        logger.warn("会话停止：" + session.getId());
    }
}