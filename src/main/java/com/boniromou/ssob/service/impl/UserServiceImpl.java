package com.boniromou.ssob.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boniromou.ssob.model.domain.User;
import com.boniromou.ssob.service.UserService;
import com.boniromou.ssob.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author pou_pou_poi
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-07-01 10:23:59
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public long userRegister(String userAccount, String userPassword, String checkPassword) {
        // 1.checking
        if (StringUtils.isAnyBlank(userAccount, userPassword,checkPassword)) {
            return -1;
        }

        return 0;
    }
}




