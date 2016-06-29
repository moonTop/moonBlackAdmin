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
        <!-- Start: Header -->
        <div class="navbar" role="navigation">
            <div class="container-fluid container-nav">             
                <!-- Navbar Action -->
                <ul class="nav navbar-nav navbar-actions navbar-left">
                    <li class="visible-md visible-lg"><a href="#" id="main-menu-toggle"><i class="fa fa-th-large"></i></a></li>
                    <li class="visible-xs visible-sm"><a href="#" id="sidebar-menu"><i class="fa fa-navicon"></i></a></li>            
                </ul>
                <!-- Navbar Left -->
                <div class="navbar-left">
                    <!-- Search Form -->                    
                    <form class="search navbar-form">
                        <div class="input-group input-search">
                            <input type="text" class="form-control" name="q" id="q" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
                            </span>
                        </div>                      
                    </form>
                </div>
                <!-- Navbar Right -->
                <div class="navbar-right">
                    <!-- Notifications -->
                    <ul class="notifications hidden-sm hidden-xs">
                        <li>
                            <a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-tasks"></i>
                                <span class="badge"></span>
                            </a>
                            <ul class="dropdown-menu update-menu" role="menu">
                                <li><a href="#"><i class="fa fa-database bk-fg-primary"></i>待办任务 </a></li>
                                <li><a href="#"><i class="fa fa-bar-chart-o bk-fg-primary"></i>数据统计</a></li>
                                <li><a href="#"><i class="fa fa-bell bk-fg-primary"></i>消息提示</a></li>
                                <li><a href="#"><i class="fa fa-envelope bk-fg-primary"></i> 邮箱信息 </a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-envelope"></i>
                                <span class="badge"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li class="dropdown-menu-header">
                                    <strong>Messages</strong>
                                    <div class="progress progress-xs  progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                            60%
                                        </div>
                                    </div>
                                </li>
                                <li class="avatar">
                                    <a href="page-inbox.html">
                                        <img class="avatar" src="${baseurl}img/avatar1.jpg" alt="" />
                                        <div><div class="point point-primary point-lg"></div>董事长审批...</div>
                                        <span><small>一分钟之前</small></span>                           
                                    </a>
                                </li>
                                <li class="dropdown-menu-footer text-center">
                                    <a href="page-inbox.html">查看所有消息</a>
                                </li>   
                            </ul>
                        </li>
                        <li>
                            <a href="#" class="dropdown-toggle notification-icon" data-toggle="dropdown">
                                <i class="fa fa-bell"></i>
                                <span class="badge"></span>
                            </a>
                            <ul class="dropdown-menu list-group">
                                <li class="dropdown-menu-header">
                                    <strong>Notifications</strong>
                                    <div class="progress progress-xs  progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                            60%
                                        </div>
                                    </div>
                                </li>
                                <li class="list-item">
                                    <a href="page-inbox.html">
                                        <div class="pull-left">
                                           <i class="fa fa-envelope-o bk-fg-primary"></i>
                                        </div>
                                        <div class="media-body clearfix">
                                            <div></div>
                                            <h6>You have 10 unread message</h6>
                                        </div>                              
                                    </a>
                                </li>
                                <li class="list-item">
                                    <a href="#">
                                        <div class="pull-left">
                                           <i class="fa fa-cogs bk-fg-primary"></i>
                                        </div>
                                        <div class="media-body clearfix">
                                            <div>New Settings</div>
                                            <h6>There are new settings available</h6>
                                        </div>                              
                                    </a>
                                </li>
                                <li class="list-item">
                                    <a href="#">
                                        <div class="pull-left">
                                           <i class="fa fa-fire bk-fg-primary"></i>
                                        </div>
                                        <div class="media-body clearfix">
                                            <div>Update</div>
                                            <h6>There are new updates available</h6>
                                        </div>                              
                                    </a>
                                </li>
                                <li class="list-item-last">
                                    <a href="#">
                                      <h6>Unread notifications</h6>
                                      <span class="badge">15</span>
                                   </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- End Notifications -->
                    <!-- Userbox -->
                    <div class="userbox">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <div class="profile-info">
                                <span class="name">王彤召</span>
                                <!--<span class="role">董事长</span>-->
                            </div>          
                            <i class="fa custom-caret"></i>
                        </a>
                        <div class="dropdown-menu">
                            <ul class="list-unstyled">
                                <li class="dropdown-menu-header bk-bg-white bk-margin-top-15">                      
                                    <div class="progress progress-xs  progress-striped active">
                                        <div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                                            60%
                                        </div>
                                    </div>                          
                                </li>   
                                <li>
                                    <a href="page-profile.html"><i class="fa fa-user"></i> 个人信息</a>
                                </li>
                                <li>
                                    <a href="#"><i class="fa fa-wrench"></i> 设置</a>
                                </li>
                                <li>
                                    <a href="login.action"><i class="fa fa-power-off"></i> 注销</a>
                                </li>
                            </ul>
                        </div>                      
                    </div>
                    <!-- End Userbox -->
                </div>
                <!-- End Navbar Right -->
            </div>      
        </div>
        <!-- End: Header -->
        <!--<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>-->
        <!-- Start: Content -->
        <div class="container-fluid content">   
            <div class="row">
                <!-- Sidebar -->
                <div class="sidebar">
                    <div class="sidebar-collapse">
                        <!-- Sidebar Header Logo-->
                        <div class="sidebar-header">
                            <img src="${baseurl}img/logo.png" class="img-responsive" alt="" />
                        </div>
                        <!-- Sidebar Menu-->
                        <div class="sidebar-menu">                      
                            <nav id="menu" class="nav-main" role="navigation">
                                <ul class="nav nav-sidebar">
                                    <div class="panel-body text-center">                                
                                        <div class="bk-avatar">
                                            <img src="${baseurl}img/avatar.jpg" class="img-circle bk-img-60" alt="" />
                                        </div>
                                        <div class="bk-padding-top-10">
                                            <i class="fa fa-circle text-success"></i> <small>欢迎您管理员</small>
                                        </div>
                                    </div>
                                    <li class="nav-parent">
                                         <a>
                                            <i class="fa fa-laptop" aria-hidden="true"></i>
                                            <span>系统管理</span>
                                          </a>  
                                        <ul class="nav nav-children">
                                            <li><a href="#"><span class="text">客户管理</span></a></li>
                                            <li><a href="#"><span class="text">部门管理</span></a></li>
                                            <li><a href="#"><span class="text">权限管理</span></a></li>
                                            <li><a href="#"><span class="text">日志管理</span></a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-parent">
                                        <a>
                                            <i class="fa fa-tasks" aria-hidden="true"></i>
                                            <span>任务列表</span>
                                        </a>
                                        <ul class="nav nav-children">
                                            <li><a href="#"><span class="text">已办任务</span></a></li>
                                            <li><a href="#"><span class="text">待办任务</span></a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-parent">
                                        <a>
                                            <i class="fa fa-tasks" aria-hidden="true"></i>
                                            <span>流程管理</span>
                                        </a>
                                        <ul class="nav nav-children">
                                            <li><a href="#"><span class="text">流程部署</span></a></li>
                                            <li><a href="#"><span class="text">查看流程</span></a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-parent">
                                        <a>
                                            <i class="fa fa-tasks" aria-hidden="true"></i>
                                            <span>数据分析</span>
                                        </a>
                                        <ul class="nav nav-children">
                                            <li><a href="#"><span class="text">已办任务</span></a></li>
                                            <li><a href="#"><span class="text">待办任务</span></a></li>
                                        </ul>
                                    </li>
                                    
                                </ul>
                            </nav>
                        </div>
                        <!-- End Sidebar Menu-->
                    </div>
                    <!-- Sidebar Footer-->
                    <div class="sidebar-footer">    
                        <ul class="sidebar-terms">
                            <li><a href="index.html#">Terms</a></li>
                            <li><a href="index.html#">Privacy</a></li>
                            <li><a href="index.html#">Help</a></li>
                            <li><a href="index.html#">About</a></li>
                        </ul>
                        <div class="copyright text-center">
                            
                        </div>                  
                    </div>
                    <!-- End Sidebar Footer-->
                </div>
                <!-- End Sidebar -->
        
                <!-- Main Page -->
                <div class="main ">
                    <!-- Page Header -->
                    <div class="page-header">
                        <div class="pull-left">
                            <ol class="breadcrumb visible-sm visible-md visible-lg">                                
                                <li><a href="#"><i class="icon fa fa-home"></i>主页</a></li>
                                <li class="active"><i class="fa fa-laptop"></i>系统管理</li>
                            </ol>                       
                        </div>
                        <div class="pull-right">
                            <h2>Dashboard</h2>
                        </div>                  
                    </div>
                    <!-- End Page Header -->                                
                </div>
                <!-- End Main Page -->          
        
                <!-- Usage -->
                <div id="usage">
                    <ul>
                        <li>
                            <div class="title">Memory</div>
                            <div class="bar">
                                <div class="progress progress-md  progress-striped active">
                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%"></div>
                                </div>
                            </div>          
                            <div class="desc">4GB of 8GB</div>
                        </li>
                        <li>
                            <div class="title">HDD</div>
                            <div class="bar">
                                <div class="progress progress-md  progress-striped active">
                                    <div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%"></div>
                                </div>
                            </div>          
                            <div class="desc">250GB of 1TB</div>
                        </li>
                        <li>
                            <div class="title">SSD</div>
                            <div class="bar">
                                <div class="progress progress-md  progress-striped active">
                                    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width: 70%"></div>
                                </div>
                            </div>          
                            <div class="desc">700GB of 1TB</div>
                        </li>
                        <li>
                            <div class="title">Bandwidth</div>
                            <div class="bar">
                                <div class="progress progress-md  progress-striped active">
                                    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%"></div>
                                </div>
                            </div>          
                            <div class="desc">90TB of 100TB</div>
                        </li>               
                    </ul>   
                </div>
                <!-- End Usage -->
            
            </div>
        </div><!--/container-->
        <!-- Modal Dialog -->
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title bk-fg-primary">Modal title</h4>
                    </div>
                    <div class="modal-body">
                        <p class="bk-fg-danger">Here settings can be configured...</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div><!-- End Modal Dialog -->     
        <div class="clearfix"></div>
        <%@ include file="/WEB-INF/view/common_js.jsp"%>
    </body> 
</HTML>
