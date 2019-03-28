package cn.itaz.easygou.plat.web.controller;

import cn.itaz.easygou.common.AjaxResult;
import cn.itaz.easygou.plat.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 * 返回数据
 * 想办法返回json数据到前端
 */
@RestController
@RequestMapping("/user")
public class UserController {
    //返回字符串至前端
    @RequestMapping("/test")
    public String test(){
        return "xsxsxssxsxs";
    }

    //返回json数据
    @RequestMapping("/ajax")
    public AjaxResult ajaxResult(){
        return new AjaxResult().me().setSuccess(false).setMessage("操作失败");
    }

    /**
     * RequestBody:用于接收页面请求体中的对象值，绑定到一个对象上
     * @param user
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //使用equals比较输入的值 判断登录是否成功
        if ("xs".equals(user.getUsername()) && "123".equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误");
        }
    }
}
