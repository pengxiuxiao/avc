package com.supadata.service.impl;

import com.supadata.dao.TeamBuyMapper;
import com.supadata.pojo.TeamBuy;
import com.supadata.service.TeamBuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TeamBuyServiceImpl
 * @Description:
 * @Auther: pxx
 * @Date: 2018/8/21 16:50
 * @Description:
 */
@Service
public class TeamBuyServiceImpl implements TeamBuyService {

    @Autowired
    private TeamBuyMapper teamBuyMapper;

    @Override
    public int insertSelective(TeamBuy record) {
        return teamBuyMapper.insertSelective(record);
    }
}
