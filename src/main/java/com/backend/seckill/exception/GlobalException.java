package com.backend.seckill.exception;

import com.backend.seckill.vo.RespBean;
import com.backend.seckill.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException {

    private RespBeanEnum respBeanEnum;

}
