package com.idea.nursing.login.web.controller;


import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.login.web.domain.pojo.Login;
import com.idea.nursing.login.web.domain.pojo.Role;
import com.idea.nursing.login.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 10238 on 2016/10/10.
 */
@Controller
@RequestMapping("/login")
public class LoginCntroller {
    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param login
     * @return
     */
    @ResponseBody
    @RequestMapping(value="user_login",  method = RequestMethod.POST)
    public ResultData userLogin(Login login, HttpSession session){
        login = loginService.userLogin(login);
        if(login.getId()!=null){
            session.setAttribute(SessionConstant.SESSION_USER_BEAN,login);
            Role role = loginService.selectUserRole(login.getId());
            return ResultData.build().put("role",role);
        }else{
            return ResultData.build().login();
        }
    }

    @ResponseBody
    @RequestMapping(value = "seller_login", method = RequestMethod.GET)
    public ResultData sellerLogin(Login login,HttpSession session){
        if(loginService.sellerLogin(login)){
            session.setAttribute(SessionConstant.SESSION_USER_BEAN,login);
            return ResultData.build();
        }else{
            return ResultData.build().login();
        }
    }


    @ResponseBody
    @RequestMapping(value = "seller_login_out", method = RequestMethod.GET)
    public void sellerLoginOut(HttpSession session){

            session.removeAttribute(SessionConstant.SESSION_USER_BEAN);

    }

}
