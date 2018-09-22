package org.lanqiao.dxzf.controller;

import org.lanqiao.dxzf.entity.Admin;
import org.lanqiao.dxzf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    /**
     * 登录验证
     * @param admin
     * @param session
     * @return
     */
    @RequestMapping("/login.do")
    public String adminLogin(Admin admin,HttpSession session){
        List<Admin> adminList = adminService.adminLogin(admin);
       if(adminList.size()==1) {
            //登录成功,将个人信息存入session
            session.setAttribute("admin", adminList.get(0));
            System.out.println(adminList.get(0));
            return "index";
        }else {
            return "login";
        }
    }

    /**
     * ajax修改个人信息
     * @return
     */
    @RequestMapping("updateUser.do")
    public String updateUser(Admin admin){
        adminService.updateUserInfo(admin);
        return "";
    }
    /**
     * 登录界面
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView helloWorld(){
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    /**
     * 主页面
     * @return
     */
    @RequestMapping("/view/index")
    public String index(){
        return "index";
    }

    /**
     * 角色管理
     * @return
     */
    @RequestMapping("/view/role/role_list")
    public String role_list(){
        return "role/role_list";
    }
    /**
     * 管理员管理
     * @return
     */
    @RequestMapping("view/admin/listAdmin.do")
    public String admin_list(){
        return "admin/admin_list";
    }
    /**
     *资费管理
     */
    @RequestMapping("view/fee/fee_list")
    public String fee_list(){
        return "fee/fee_list";
    }
    /**
     * 账务账号
     */
    @RequestMapping("view/account/account_list")
    public String account_list(){
        return "account/account_list";
    }
    /**
     * 业务账号
     */
    @RequestMapping("view/service/service_list")
    public String service_list(){
        return "service/service_list";
    }
    /**
     * 帐单管理
     */
    @RequestMapping("view/bill/bill_list")
    public String bill_list(){
        return "bill/bill_list";
    }
    /**
     * 报表管理
     */
    @RequestMapping("view/report/report_list")
    public String report_list(){
        return "report/report_list";
    }
    /**
     * 个人信息
     */
    @RequestMapping("view/user/user_info")
    public String user_info(){
        return "user/user_info";
    }
    /**
     * 修改密码
     */
    @RequestMapping("view/user/user_modi_pwd")
    public String user_modi_pwd(){
        return "user/user_modi_pwd";
    }
}
