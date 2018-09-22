package org.lanqiao.dxzf.service.impl;

import org.lanqiao.dxzf.entity.Admin;
import org.lanqiao.dxzf.mapper.AdminMapper;
import org.lanqiao.dxzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public List<Admin> adminLogin(Admin admin) {
        return adminMapper.selectAllAdmin_Role_Priv(admin);
    }

    @Override
    public int updateUserInfo(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }
}
