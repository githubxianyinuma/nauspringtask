package com.iweb.task;

import org.springframework.stereotype.Component;

@Component
public class MyTask {
    /**
     * 定时任务准备执行的方法
     */
    public void doTask(){
        //统计数据0---发送报表---执行数据转换，数据清醒，备份数据
        System.out.println(System.currentTimeMillis());
    }
}
