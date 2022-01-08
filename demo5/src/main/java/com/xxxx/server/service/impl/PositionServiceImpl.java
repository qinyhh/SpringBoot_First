package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.PositonMapper;
import com.xxxx.server.pojo.Position;
import com.xxxx.server.service.PositonService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author qinyh
 * @date 2022/1/7
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositonMapper,Position> implements PositonService {
}
