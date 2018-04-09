package com.cs.logs;

import org.apache.log4j.Logger;

/**
 * @Author: ChenSong
 * @Date: 2018/4/9 10:59
 * @Description:日志基类
 */
public abstract class BaseLogs {
    protected final Logger LOG = Logger.getLogger(getClass());
}
