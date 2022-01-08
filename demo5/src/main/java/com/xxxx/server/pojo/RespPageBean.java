package com.xxxx.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 分页返回公共对象
 * @Author qinyh
 * @date 2022/1/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     *总条数
    */
    private long total;

    /**
     *数据
    */
    private List<?> data;
}
