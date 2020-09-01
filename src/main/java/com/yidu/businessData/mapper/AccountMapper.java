package com.yidu.businessData.mapper;

import com.yidu.businessData.pojo.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    public List<Account> selectAccount();
}
