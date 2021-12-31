package com.boot.base.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class XxlJobController {

    private static Logger logger = LoggerFactory.getLogger(XxlJobController.class);


    @XxlJob("commandJobHandler")
    public ReturnT<String> commandJobHandler(String param) throws Exception{
        System.out.println("两岸猿声啼不住");
        XxlJobHelper.log("hello");
        return ReturnT.SUCCESS;
    }

    @XxlJob("commandJobHandlerOne")
    public ReturnT<String> commandJobHandlerOne(String param) throws Exception{
        System.out.println("轻舟已过万重山");
        XxlJobHelper.log("hello");
        return ReturnT.SUCCESS;
    }
}
