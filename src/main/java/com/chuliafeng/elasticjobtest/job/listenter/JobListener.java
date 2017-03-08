package com.chuliafeng.elasticjobtest.job.listenter;

import com.chuliafeng.elasticjobtest.job.simple.SpringSimpleJob;
import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
public class JobListener implements ElasticJobListener{

    private static final Logger log= LoggerFactory.getLogger(JobListener.class);

    @Override
    public void beforeJobExecuted(ShardingContexts shardingContexts) {
        log.info("JobListener beforeJobExecuted shardingContexts={}",shardingContexts);
    }

    @Override
    public void afterJobExecuted(ShardingContexts shardingContexts) {
        log.info("JobListener afterJobExecuted shardingContexts={}",shardingContexts);
    }
}
