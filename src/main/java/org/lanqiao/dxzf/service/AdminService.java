package org.lanqiao.dxzf.service;

import org.lanqiao.dxzf.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> adminLogin(Admin admin);
    int updateUserInfo(Admin admin);
}
