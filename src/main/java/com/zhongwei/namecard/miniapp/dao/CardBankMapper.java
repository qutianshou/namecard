package com.zhongwei.namecard.miniapp.dao;

import com.zhongwei.namecard.miniapp.model.CardBank;
import com.zhongwei.namecard.miniapp.model.CardBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardBankMapper {
    int countByExample(CardBankExample example);

    int deleteByExample(CardBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CardBank record);

    int insertSelective(CardBank record);

    List<CardBank> selectByExampleWithBLOBs(CardBankExample example);

    List<CardBank> selectByExample(CardBankExample example);

    CardBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CardBank record, @Param("example") CardBankExample example);

    int updateByExampleWithBLOBs(@Param("record") CardBank record, @Param("example") CardBankExample example);

    int updateByExample(@Param("record") CardBank record, @Param("example") CardBankExample example);

    int updateByPrimaryKeySelective(CardBank record);

    int updateByPrimaryKeyWithBLOBs(CardBank record);

    int updateByPrimaryKey(CardBank record);
}