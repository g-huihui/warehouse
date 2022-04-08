package com.gongyanhui.bus.vo;

import com.gongyanhui.bus.entity.Outport;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: Taurus-
 * @Date: 2021/12/18 10:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OutportVo extends Outport {

    private Integer page = 1;

    private Integer limit = 10;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;


}
