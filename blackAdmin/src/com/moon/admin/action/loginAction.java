package com.moon.admin.action;


import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.CopyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.moon.admin.po.User;
import com.moon.admin.po.registerUser;
import com.moon.admin.service.userService;
import com.moon.admin.utils.DateUtility;
import com.moon.admin.utils.MD5;
import com.moon.admin.utils.StringUtil;
@Controller
public class loginAction {

	@Autowired
	private userService userservice;

	/**
	 * 首页请求跳转到登录页面
	 * @param mv
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String login(ModelAndView mv)throws Exception{
		
		return "/login";
	}
	/**
	 * 登录提交处理
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loginSubmit")
	public ModelAndView admin(User model)throws Exception{
		ModelAndView mv= new ModelAndView();
		MD5 md5=new MD5();
		model.setPassword(md5.getMD5ofStr(model.getPassword()));
		User user = userservice.findUserByModel(model);
		if(user!=null){
			mv.setViewName("/admin");
		}else{
			mv.setViewName("/login");
			mv.addObject("messager","登录失败");
		}
		return mv;
	}
	/**
	 * 跳转到注册页面
	 * @return
	 */
	@RequestMapping("/toRegisterPage")
	public String toRegisterPage(){
		return "/register";
		
	}
	/**
	 * 用户注册
	 * @param model
	 * @return
	 */
	@RequestMapping("/SumitRegister")
	public ModelAndView register(registerUser model){
		ModelAndView mv =new ModelAndView();
		 try {
			 if(!model.getPwd_confirm().equals(model.getPassword())){
				 mv.addObject("messager", "两次输入密码不一致");
				 mv.setViewName("/register");
				 return mv ;
			 }
			 if(!StringUtil.isNullOrEmpty(model.getUsername())&&!StringUtil.isNullOrEmpty(model.getPassword())){
				 User user =new User();
				 BeanUtils.copyProperties(model, user);
				 user.setUserid(UUID.randomUUID().toString().substring(20));
				 user.setDetail("新用户");
				 user.setCreatetime(new Date());
				 user.setStatus("1");
				 user.setCreateid("admin");
				 userservice.addUser(user);
				 mv.addObject("messager", "恭喜您！您已申请成功!");
				 mv.setViewName("/login");
			 }
          } catch (Exception e) {
        	  mv.setViewName("/register");
	        e.printStackTrace();
         }
		 return mv;
	}
	
}
