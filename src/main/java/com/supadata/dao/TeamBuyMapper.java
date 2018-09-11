package com.supadata.dao;

import com.supadata.pojo.TeamBuy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamBuyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeamBuy record);

    int insertSelective(TeamBuy record);

    TeamBuy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeamBuy record);

    int updateByPrimaryKey(TeamBuy record);
}