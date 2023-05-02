package com.backend.seckill.service.impl;

import com.backend.seckill.pojo.Order;
import com.backend.seckill.mapper.OrderMapper;
import com.backend.seckill.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author fxhj
 * @since 2023-04-09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
