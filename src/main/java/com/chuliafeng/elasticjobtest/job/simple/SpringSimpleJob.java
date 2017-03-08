/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.chuliafeng.elasticjobtest.job.simple;

import com.chuliafeng.elasticjobtest.domain.entity.Foo;
import com.chuliafeng.elasticjobtest.domain.repository.FooRepository;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;

public class SpringSimpleJob implements SimpleJob {

    private static final Logger log= LoggerFactory.getLogger(SpringSimpleJob.class);

    @Resource
    private FooRepository fooRepository;

    
    @Override
    public void execute(final ShardingContext shardingContext) {
        log.info(String.format("------Thread ID: %s, Sharding Context: %s, Action: %s", Thread.currentThread().getId(), shardingContext, "simple job"));
        List<Foo> data = fooRepository.findByLocationAndStatus(shardingContext.getShardingItem()+"",0);
        log.info("SpringSimpleJob execute data={}",data.toString());
        for (Foo each : data) {
            each.setStatus(3);
            fooRepository.save(each);
        }

    }
}
