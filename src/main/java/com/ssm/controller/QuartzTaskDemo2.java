package com.ssm.controller;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

public class QuartzTaskDemo2 extends QuartzJobBean {
    /**
     * 这种方式定义任务类可以传参
     */
    String name;

    /**
     * 要定义setter，否则变量无法赋值，即使用JobDataMap传值了也获取不到
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(name + "QuartzTask2：" + new Date());
    }
}
