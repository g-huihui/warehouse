package com.gongyanhui.sys.vo;

import com.gongyanhui.sys.entity.Notice;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: Taurus-
 * @Date: 2021/11/25 8:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class NoticeVo extends Notice {

    private Integer page=1;
    private Integer limit=10;

    //接受多个ID
    private Integer[] ids;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

}
