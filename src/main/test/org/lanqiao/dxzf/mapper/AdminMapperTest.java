package org.lanqiao.dxzf.mapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.dxzf.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
//配置spring和junit整合，这样junit在启动时就会加载spring容器
@RunWith(SpringJUnit4ClassRunner.class)//固定写法
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring-mybatis.xml"})//spring与mybatis整合的配置文件
public class AdminMapperTest {
    @Autowired
    AdminMapper adminMapper;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertAdmin() throws Exception {
    }

    @Test
    public void deleteAdmin() throws Exception {
    }

    @Test
    public void updateAdmin() throws Exception {
    }

    @Test
    public void selectAllAdmins() throws Exception {
        List<Admin> list = adminMapper.selectAllAdmins();
        System.out.println(list);
    }

    @Test
    public void selectAdminByName() throws Exception {
    }

    @Test
    public void selectAllAdmin_Role_Priv() throws Exception {
        List<Admin> list = adminMapper.selectAllAdmin_Role_Priv(null);
        System.out.println(list);
    }

}