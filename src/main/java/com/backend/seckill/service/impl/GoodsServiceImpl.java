package com.backend.seckill.service.impl;

import com.backend.seckill.pojo.Goods;
import com.backend.seckill.mapper.GoodsMapper;
import com.backend.seckill.service.IGoodsService;
import com.backend.seckill.vo.GoodsVo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author fxhj
 * @since 2023-04-09
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<GoodsVo> findGoodsVo() {
        System.out.println(goodsMapper.findGoodsVo());
        return goodsMapper.findGoodsVo();
    }
    @Override
    public GoodsVo findGoodsVoByGoodsId(Long goodsId) {
        return goodsMapper.findGoodsVoByGoodsId(goodsId);
    }
}
