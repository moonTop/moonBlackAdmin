<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/view/tag.jsp"%>
<html>
<head>
<meta charset="UTF-8" />
<title>MooN | 信贷</title>
<!-- Mobile Metas -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<!-- Import google fonts -->
<link href="http://fonts.useso.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css" />
<%@ include file="/WEB-INF/view/common_css.jsp"%>
<script src="${baseurl}plugins/modernizr/js/modernizr.js"></script> 
</HEAD>
<body>
       <body>
        <!-- Start: Content -->
        <div class="container-fluid content">
            <div class="row">
                <!-- Main Page -->
                <div class="body-login">
                    <div class="center-login">
                        <div class="panel panel-login">
                            <div class="panel-title-login text-center" >
                                <h2 style="margin-bottom: 40px" ><i class="fa fa-user"></i> MOON信贷管理系统</h2>
                            </div>
                            <div class="panel-body">
                                <form action="SumitRegister.action" method="post">
                                    <div class="form-group">
                                        <label>姓名：</label>
                                        <input name="username" type="text" class="form-control" />
                                    </div>

                                    <div class="form-group">
                                        <label>电话：</label>
                                        <input name="mobile" type="text" class="form-control" />
                                    </div>

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-6">
                                                <label>密码：</label>
                                                <input name="password" type="password" class="form-control" />
                                            </div>
                                            <div class="col-sm-6">
                                                <label>再次确认密码：</label>
                                                <input name="pwd_confirm" type="password" class="form-control" />
                                            </div>
                                        </div>
                                    </div>
                                    <br />
                                    <div class="row">
                                        <div class="col-sm-8">
                                            <div class="checkbox-custom checkbox-default bk-margin-bottom-10">
                                                <input id="RememberMe" name="rememberme" type="checkbox"/>
                                                <label for="RememberMe">记住我</label>
                                            </div>
                                        </div>
                                        <div class="col-sm-4 text-right">
                                            <button href="#" type="submit" class="btn btn-primary hidden-xs">注册</button>
                                            <button href="#" type="submit" class="btn btn-primary btn-block btn-lg visible-xs bk-margin-top-10">登录</button>
                                        </div>
                                    </div>
                                    <br />
                                    <div class="text-with-hr">
                                        <span>or</span>
                                    </div>
                                    <br />
                                    <!-- <div class="bk-margin-bottom-10 bk-margin-top-10 text-center">
                                        <a href="#" class="fa fa-facebook facebook-bg"></a>
                                        <a href="#" class="fa fa-twitter twitter-bg"></a>
                                        <a href="#" class="fa fa-linkedin linkedin-bg"></a>
                                    </div><br /> -->
                                    <p class="text-center">如果已有账号? <a href="login.action"><small>登录!</small></a>
                                </form>
                            </div>
                        </div>
                    </div>
                 </div>
                </div>
                <!-- End Main Page -->
        </div><!--/container-->
        <%@ include file="/WEB-INF/view/common_js.jsp"%>
    </body> 
</HTML>
