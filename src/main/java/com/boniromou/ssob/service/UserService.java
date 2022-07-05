package com.boniromou.ssob.service;

import com.boniromou.ssob.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author pou_pou_poi
* @description 针对表【user】的数据库操作Service
* @createDate 2022-07-01 10:23:59
*/
public interface UserService extends IService<User> {
    /**
     *
     * @param userAccount ac
     * @param userPassword  pw
     * @param checkPassword checking
     * @return
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * user Login
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User originUser);
}
