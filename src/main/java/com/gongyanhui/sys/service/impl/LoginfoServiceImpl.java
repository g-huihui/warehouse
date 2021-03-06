package com.gongyanhui.sys.service.impl;

import com.gongyanhui.sys.entity.Loginfo;
import com.gongyanhui.sys.mapper.LoginfoMapper;
import com.gongyanhui.sys.service.ILoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * InnoDB free: 9216 kB 服务实现类
 * </p>
 *
 * @author Taurus-
 * @since 2021-11-23
 */
@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements ILoginfoService {

}
