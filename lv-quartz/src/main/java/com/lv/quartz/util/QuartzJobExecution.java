package com.lv.quartz.util;

import org.quartz.JobExecutionContext;
import com.lv.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author smwy
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
