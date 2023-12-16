<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Web tìm kiếm việc làm</title>
<link rel="stylesheet" href="./fonts/fontawesome-free-6.4.0/fontawesome-free-6.4.0-web/css/all.min.css">
</head>
<style>
* {
    box-sizing: inherit;
    /* kế thừa từ thẻ chứa nó , box-sizing : bao gồm các margin, padding trong phần tử*/
}

html {
    font-size: 62.5%;
    line-height: 1.6 rem;
    box-sizing: border-box;
    font-family: cursive;
}

.login-background {
    background-image: linear-gradient(135deg, #00b14f 0%, #189751 100%);
    height: 100vh;
}

.login-container {
    background-color: white;
    margin: 0 auto;
    width: 400px;
    height: 450px;
    border-radius: 10px;
    position: absolute;
    left: 0;
    right: 0;
    top: 20%;
}

.login-content {
    padding: 10px;
}

.login__text-center {
    font-weight: 600;
    text-align: center;
    font-size: 2.5rem;
    padding: 10px 0;
}

.login__form-group {
    display: flex;
    flex-direction: column;
    margin: 15px 0;
    margin-left: 30px;
}

.login__form-label {
    align-self: start;
    padding-left: 1.5rem;
    padding-bottom: 0.5rem;
    color: rgba(187, 187, 187, 0.9);
}

.login__form-input {
    width: 80%;
    box-sizing: border-box;
    border: none;
    font-size: 1.3rem;
    padding-left: 1.5rem;
    padding-bottom: 1rem;
    box-shadow: inset 0px -3px 0px 0px rgba(187, 187, 187, 0.2);
    transition: box-shadow 0.2s ease-in;
}

.login__form-input:focus {
    box-shadow: inset 0px -3px 0px 0px #00b14f;
    outline: none;
}

.login__form-input::-webkit-input-placeholder {
    opacity: 1;
    transition: opacity 0.25s ease-out;
}

.login__form-input:hover::-webkit-input-placeholder,
.login__form-input:focus::-webkit-input-placeholder {
    opacity: 0;
}

.login__form-div--button {
    display: flex;
    margin: 20px 10px;
    justify-content: center;
}

.login__form-button {
    border-radius: 25px;
    width: 80%;
    height: 40px;
    font-size: 1.3rem;
    color: white;
    font-weight: 700;
    background: linear-gradient(135deg, #00b14f 0%, #189751 100%);
    border: 0px;
    cursor: pointer;
    transition: opacity 0.25s ease-out;
}

.login__form-button:hover {
    opacity: 0.8;
}

.login__form-register {
    margin: 0 5px;
    color: #00b14f;

}

.login__form-haveacc {
    margin: 20px 0 20px 30px;
    color: #333;
}

.login__form-login-with {
    text-align: center;
}

.login__form-login-title {
    color: #333;
    font-size: 1.5rem;
    font-weight: 600;
}

.login__form-login-logo {
    margin-top: 20px;
}

.login__form--logo {
    font-size: 5.5rem;
    margin: 0 20px;
}

.login__form--logo:hover {
    opacity: 0.8;
    cursor: pointer;
}

.color-facebook {
    color: #0866ff;
}

.color-gamil {
    color: #e94230;
}
</style>
<body>
	<%
	String message = (String)request.getAttribute("message");
	%>
	<form class="login-background" method="post" action="ControllerServlet?action=loginSuccess">
            <div class="login-container">
                <div class="login-content">
                    <div class="login__text-center">Login</div>
                    <div class="login__form-group">
                        <label class="login__form-label">Username</label>
                        <input type="text" placeholder='Enter your username' class="login__form-input" name="userName"></input>
                    </div>
                    <div class="login__form-group">
                        <label class="login__form-label">Password</label>
                        <input type="password" placeholder='Enter your password' class="login__form-input" name="password"></input>
                    </div>
                    <div class="login__form-haveacc">
                        <span>Don't have an account?</span>
                        <a class="login__form-register" href="ControllerServlet?action=register">Sign up here</a>
                    </div>
                    <h5 style="color: red;
                    	text-align: center;
                    	font-size: 1rem;">
	 					<% if (message != null) { %>
    					<%= message %>
  						<% } %>
					</h5>
                    <div class="login__form-div--button">
                        <input type="submit" class="login__form-button" value="Login"></input>
                    </div>
                    <div class="login__form-login-with">
                        <span class="login__form-login-title">Or login with:</span>
                        <div class="login__form-login-logo">
                            <a href=''>
                                <i class="login__form--logo color-facebook fa-brands fa-facebook"></i>
                            </a>
                            <a href=''>
                                <i class="login__form--logo color-gamil fa-brands fa-google"></i>
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </form>
</body>
</html>