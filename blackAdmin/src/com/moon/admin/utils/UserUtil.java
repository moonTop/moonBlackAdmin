package com.moon.admin.utils;

import javax.servlet.http.HttpSession;

import com.moon.admin.po.ActiveUser;
import com.moon.admin.po.User;


/**
 * 用户身份信息工具类
 *
 * @author mrt
 */
public class UserUtil {

    public static final String USER = "activeUser";

    /**
     * 设置用户到session
     *
     * @param session
     * @param user
     */
    public static void saveUserToSession(HttpSession session, User activeUser) {
        session.setAttribute(USER, activeUser);
    }

    /**
     * 从Session获取当前用户信息
     *
     * @param session
     * @return
     */
    public static User getUserFromSession(HttpSession session) {
        Object attribute = session.getAttribute(USER);
        return attribute == null ? null : (User) attribute;
    }

}
