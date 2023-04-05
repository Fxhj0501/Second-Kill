package com.backend.seckill.service;

import com.backend.seckill.pojo.User;
import com.backend.seckill.vo.LoginVo;
import com.backend.seckill.vo.RespBean;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author fxhj
 * @since 2023-04-03
 */
public interface IUserService extends IService<User> {

    RespBean doLogin(LoginVo loginvo, HttpServletResponse response, HttpServletRequest request);
}
