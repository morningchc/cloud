package com.cloud.cloudproviderpament.service;

import com.cloud.cloudproviderpament.entity.PfCombElementEvent;
import com.cloud.cloudproviderpament.mapper.PfCombElementEventMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2021/4/12.
 */
@Service
public class TestService {
    @Autowired
    private PfCombElementEventMapper pfCombElementEventMapper;

    public List<PfCombElementEvent> selectAll(){
        PageHelper.startPage(1, 10);
        List<PfCombElementEvent> list = pfCombElementEventMapper.selectAll(null);
        return list;
    }

}
