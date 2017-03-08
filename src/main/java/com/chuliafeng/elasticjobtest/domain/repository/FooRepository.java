package com.chuliafeng.elasticjobtest.domain.repository;

import com.chuliafeng.elasticjobtest.domain.entity.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhangchuqiang on 2017/3/8.
 */
public interface FooRepository extends JpaRepository<Foo,Long> {

    List<Foo> findByStatus(int status);

    List<Foo> findByLocation(String location);

    List<Foo> findByLocationAndStatus(String location,int status);
}
