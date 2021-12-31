package com.boot.base.service.impl;

import com.boot.base.entity.UserInfo;
import com.boot.base.mapper.UserInfoMapper;
import com.boot.base.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 贾海军
 * @since 2021-12-28
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
