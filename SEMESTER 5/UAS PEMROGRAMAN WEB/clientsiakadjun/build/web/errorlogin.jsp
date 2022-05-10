<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN SIAKAD 2020</title>
        <link rel="icon" type="image/png" href="img/Logo Sinus.png">
        <link rel="stylesheet" type="text/css" href="css/errorlogin.css">
    </head>
    <body>
        <div id="main">
            <br>
            <center>
                <img src="img/Logo Sinus.png" class="sinus">
                <br><br>
                <b class="text">LOGIN<br>SIAKAD 2020</b>
                <div align="center" class="notice" style="color: #c1c1c1; font-size: 9pt;"><b>Silahkan login terlebih dahulu.</b></div>
                <br>

                <div id="login">
                    <form id="form_id" method="post" name="login" action="login/ceklogin.jsp">
                        <input type="text" class="user" id="username" name="username" placeholder="Username">
                        <br><br>
                        <input type="password" class="user" id="password" name="password" placeholder="Password">
                        <br><br>
                        <div class="notice" style="color: #fc0303; font-size: 10pt; font-family: arial"><i>Username atau Password Salah.</i></div>
                        <br>
                        <input class="btn-login" type="submit" value="Login" id="submit">
                    </form>
                </div>
                <br>
                <b class="copy" >&copy; 2016-2019 PPD STMIK SiNus All Right Reserved</b>
            </center>
        </div>
    </body>
</html>