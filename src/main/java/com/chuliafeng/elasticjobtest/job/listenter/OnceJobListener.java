package com.chuliafeng.elasticjobtest.job.listenter;

import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.AbstractDistributeOnceElasticJobListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
public class OnceJobListener extends AbstractDistributeOnceElasticJobListener{

    private static final Logger log= LoggerFactory.getLogger(OnceJobListener.class);

    public OnceJobListener(long startedTimeoutMilliseconds, long completedTimeoutMilliseconds) {
        super(startedTimeoutMilliseconds, completedTimeoutMilliseconds);
    }

    @Override
    public void doBeforeJobExecutedAtLastStarted(ShardingContexts shardingContexts) {
        log.info("OnceJobListener doBeforeJobExecutedAtLastStarted shardingContexts={}",shardingContexts);
    }

    @Override
    public void doAfterJobExecutedAtLastCompleted(ShardingContexts shardingContexts) {
        log.info("OnceJobListener doAfterJobExecutedAtLastCompleted shardingContexts={}",shardingContexts);
    }
}
