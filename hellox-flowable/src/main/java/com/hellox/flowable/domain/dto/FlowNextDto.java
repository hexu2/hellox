package com.hellox.flowable.domain.dto;

import com.hellox.common.core.domain.entity.SysRole;
import com.hellox.common.core.domain.entity.SysUser;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 动态人员、组
 * @author 22129
 * @date 2021/4/17 22:59
 */
@Data
public class FlowNextDto implements Serializable {

    private String type;
    private String dataType;
    private String vars;

}
