
<html>
<head>
    <link rel="stylesheet" href="${domainUrl}/assets/css/mall/publicStyle.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/mall/login/register.css">
    <link rel="stylesheet" href="${domainUrl}/assets/css/OutCss/animate/animate.css">
    <script src="${domainUrl}/assets/js/jQuery-2.1.4/jquery-2.1.4.min.js"></script>
    <script src="${domainUrl}/assets/js/OutJs/InputTest/yanzheng.js"></script>
    <script src="${domainUrl}/assets/js/common.js"></script>

</head>
<script>
    var domainUrl = '${domainUrl}'+"/rest";
</script>
<body>

<div class="w" style="height: 145px;"></div>
<div class="w progress-bar">
    <ul>
        <li></li>
        <li class="border-black" id="jindu1"><div class="title-num" id="jindu11">1</div><div class="title-font" id="jindu111">手机验证</div></li>
        <li id="jindu2"><div class="title-num title-num-n" id="jindu22">2</div><div class="title-font-n title-font" id="jindu222">设置账号信息</div></li>
        <li id="jindu3"><div class="title-num title-num-n" id="jindu33">3</div><div class="title-font-n title-font" id="jindu333">注册成功</div></li>
        <li></li>
    </ul>
</div>
<div class="w">
    <div class="register-mail">
       <table id="one">
           <tr>
               <td>手机号</td>
               <td><input type="text" placeholder="请输入手机号" id="loginTel" maxlength="11" onkeyup="this.value=this.value.replace(/\D/g,'')"  onafterpaste="this.value=this.value.replace(/\D/g,'')"></td>
               <td><span id="telyan" class="font-yan"></span></td>
           </tr>
           <tr>
               <td>验证</td>
               <td>
                   <div id="drag"></div>
                   <script type="text/javascript">
                       $('#drag').drag();
                   </script>
               </td>
               <td><input type="button" value="发送验证码"  class="btn-none" id="register-btn"></td>
           </tr>
           <tr>
               <td>验证码</td>
               <td><input type="text" placeholder="请输入短信验证码" id="message-yanzheng"></td>
               <td></td>
           </tr>
           <tr>
               <td></td>
               <td><input type="button" value="下一步" class="btn-none" id="one-btn"></td>
               <td></td>
           </tr>
           <tr>
               <td></td>
               <td><a href="${domainUrl}/rest/mall/login/sellerRegister"id="qiehuanzhuce" >切换为机构注册</a></td>
               <td></td>
           </tr>
       </table>
        <table id="two"  style="display: none;">
            <tr>
                <td>昵称</td>
                <td><input type="text" placeholder="请输入用户昵称" id="loginName"></td>
                <td><span id="nameyan" class="font-yan"></span></td>
            </tr>
            <tr>
                <td>输入密码</td>
                <td><input type="password" placeholder="请输入密码" id="loginPassword"></td>
                <td><span id="passyan" class="font-yan"></span></td>
            </tr>
            <tr>
                <td>确认密码</td>
                <td><input type="password" placeholder="请再次输入密码" id="loginPassword2"></td>
                <td><span id="passyan2" class="font-yan"></span></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="button" value="注册" class="btn-none" id="two-btn" onclick="register()"></td>
                <td></td>
            </tr>
        </table>
        <div id="three">
            <div class="register-okimg">
                <img src="${domainUrl}/assets/images/login/registerok.jpg" alt="" style="margin-top: 40px;">
                <br>
                注册成功
                <br>
            </div>
            <a href="${domainUrl}/rest/mall/index/index"><input type="button" value="进入商城" ></a>
        </div>
    </div>
</div>
</body>
</html>
