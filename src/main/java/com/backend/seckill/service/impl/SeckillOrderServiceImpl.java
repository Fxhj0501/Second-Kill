package com.backend.seckill.service.impl;

import com.backend.seckill.pojo.SeckillOrder;
import com.backend.seckill.mapper.SeckillOrderMapper;
import com.backend.seckill.service.ISeckillOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀订单表 服务实现类
 * </p>
 *
 * @author fxhj
 * @since 2023-04-09
 */
@Service
public class SeckillOrderServiceImpl extends ServiceImpl<SeckillOrderMapper, SeckillOrder> implements ISeckillOrderService {

}
