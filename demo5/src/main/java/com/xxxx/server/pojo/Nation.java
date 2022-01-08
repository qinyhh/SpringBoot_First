package com.xxxx.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 民族对象实体
 *
 * @Param：
 * @return：
 * @Date： 2022/1/8
 */
@Data
@EqualsAndHashCode(callSuper = false, of = "name")
@Accessors(chain = true)
@NoArgsConstructor
@RequiredArgsConstructor
@TableName("t_nation")
@ApiModel(value = "Nation对象", description = "")
public class Nation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "民族")
    @NonNull
    private String name;


}
