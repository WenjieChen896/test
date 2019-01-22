package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import po.User;
import service.UserSerice;

import java.util.List;

/**
 * @ClassName UserController
 * @Description todo
 * @Author chenwj
 * @Date2018/10/28 19:09
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //注入Service
    @Autowired
    private UserSerice userSerice;

    @RequestMapping("/queryUsers")
    public ModelAndView queryUsers() throws Exception {
        System.out.println("queryUsers");
       List<User> userlist = userSerice.findUserList();
       System.out.println("userlist"+userlist);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userlist",userlist);
        //指定逻辑视图名itemsList.jsp
        modelAndView.setViewName("userList");

        return modelAndView;
    }
}