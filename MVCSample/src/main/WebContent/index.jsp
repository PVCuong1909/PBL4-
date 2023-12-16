<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.bean.*" %>
<%@ page import="model.bo.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Web tìm kiếm việc làm</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <link rel="stylesheet" href="./CSS/base.css" type="text/CSS">
    <link rel="stylesheet" href="./CSS/main.css">
    <link rel="stylesheet" href="./fonts/fontawesome-free-6.4.0/fontawesome-free-6.4.0-web/css/all.min.css">
    
</head>
<style>
.listPage{
	padding: 10px;
    text-align: center;
    list-style: none;
    font-size: 15px;
}

.listPage li{
	background-color: #ffffffBD;
	padding: 20px;
	display: inline-block;
	margin: 0 10px;
	cursor: pointer;
}

.listPage span{
	color: #00b14f;
}

.home-content-item__salary-current{
    font-size: 1.3rem;
    color: var(--primary-color);
    display: -webkit-box;
    -webkit-box-orient: vertical;
    -webkit-line-clamp: 1;
    overflow: hidden;
}
.select-input{
    position: relative;
    padding: 0 12px;
    border-radius: 2px;
    min-width: 180px;
    height: 34px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    background-color: var(--white-color);   
    margin-right: 6px;
}
</style>
<body>
	<div class="main">
        <header class="header">
            <div class="grid">
                <nav class="navbar__header">
                    <ul class="navbar__header-list">
                        <li class="navbar__header-item">Kết nối đến ứng dụng mạng xã hội
                            <a href="" class="navbar__header-icon-link">
                                <i class="navbar__header-icon fa-brands fa-facebook"></i>
                            </a>
                            <a href="" class="navbar__header-icon-link">
                                <i class="navbar__header-icon fa-brands fa-instagram"></i>
                            </a>
                        </li>
                    </ul>
        
                    <ul class="navbar__header-list">
                        <li class="navbar__header-item header__notify-item--notify">
                            <a href="" class="navbar__header-item-link">
                                <i class="navbar__header-icon fa-solid fa-bell"></i>    
                                Thông báo
                            </a>
                            <div class="header__notify">
                                <header class="header__notify-header">
                                    <h3>Thông báo mới nhận</h3>
                                </header>
                                <ul class="header__notify-list">
                                    <li class="header__notify-item">
                                        <a href="" class="header__notify-link">
                                            <img src="https://cdn-new.topcv.vn/unsafe/150x/filters:format(webp)/https://static.topcv.vn/company_logos/cong-ty-tnhh-giai-phap-cong-nghe-apollo-62662ae24fde4.jpg" alt="" class="header__notify-img">
                                            <div class="header__notify-info">
                                                <span class="header__notify-name">Backend Developer (Python/NodeJS)</span>
                                                <span class="header__notify-company">Công ty TNHH giải pháp công nghệ APPOLO</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="header__notify-item">
                                        <a href="" class="header__notify-link">
                                            <img src="https://cdn-new.topcv.vn/unsafe/150x/filters:format(webp)/https://static.topcv.vn/company_logos/cong-ty-tnhh-giai-phap-cong-nghe-apollo-62662ae24fde4.jpg" alt="" class="header__notify-img">
                                            <div class="header__notify-info">
                                                <span class="header__notify-name">Lập Trình Viên Ruby On Rails (Thu Nhập Upto 30 Triệu)</span>
                                                <span class="header__notify-company">CÔNG TY TNHH CÔNG NGHỆ VÀ DỊCH VỤ ENAI</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="header__notify-item">
                                        <a href="" class="header__notify-link">
                                            <img src="https://cdn-new.topcv.vn/unsafe/150x/filters:format(webp)/https://static.topcv.vn/company_logos/cong-ty-tnhh-giai-phap-cong-nghe-apollo-62662ae24fde4.jpg" alt="" class="header__notify-img">
                                            <div class="header__notify-info">
                                                <span class="header__notify-name">Nhân Viên Hỗ Trợ Xử Lý Kỹ Thuật - Thu Nhập Upto 12 Triệu ( Làm Việc Từ Thứ 2-Thứ 6)</span>
                                                <span class="header__notify-company">Công ty Cổ phần Công nghệ EupFin Việt Nam</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="header__notify-item">
                                        <a href="" class="header__notify-link">
                                            <img src="https://cdn-new.topcv.vn/unsafe/150x/filters:format(webp)/https://static.topcv.vn/company_logos/cong-ty-tnhh-giai-phap-cong-nghe-apollo-62662ae24fde4.jpg" alt="" class="header__notify-img">
                                            <div class="header__notify-info">
                                                <span class="header__notify-name">Fresher Software Engineer (The Training Program)</span>
                                                <span class="header__notify-company">CÔNG TY TNHH ATHENA STUDIO</span>
                                            </div>
                                        </a>
                                    </li>
                                </ul>
                                <footer class="header__notify-footer">
                                    <a href="" class="header__notify-footer-btn">Xem tất cả</a>
                                </footer>
                            </div>
                        </li>
                        <li class="navbar__header-item">
                            <a href="" class="navbar__header-item-link">
                                <i class="navbar__header-icon fa-solid fa-circle-info"></i>
                                Trợ giúp</a>
                        </li>
                        <li class="navbar__header-item navbar__header-item--bold navbar__header-item--separate"><a href="ControllerServlet?action=register" class="navbar__header-item navbar__header-item--bold">Đăng ký</a></li>
                        <li class="navbar__header-item navbar__header-item--bold"><a href="ControllerServlet?action=login" class="navbar__header-item navbar__header-item--bold">Đăng nhập</a></li>
                    </ul>
                </nav>

                <div class="header-img-search">
                    <div class="header__logo">
                        <img class="header__logo-img" src="http://dut.udn.vn/portals/_default/skins/dhbk/img/front/logo-k_cntt.png" alt="logo">
                    </div>
                    <div class="header__search">
                        <input type="text" class="header__search-input" placeholder="Nhập để tìm kiếm thông tin">
                        <button class="header__search-btn">
                            <i class="header__search-btnicon fa-sharp fa-solid fa-magnifying-glass"></i>
                        </button>
                    </div>
                    <div class="header__saved">
                        <div class="header__saved-wrap">
                            <i class="header__saved-icon fa-solid fa-bookmark"></i>
                            <div class="header__saved-list header__saved-list--nosaved">
                                <span class="header__saved-list-nosaved-msg">Chưa có thông tin được lưu lại!</span>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </header>

        <div class="container">
            <div class="grid">
                <div class="grid__row app-content">
                    <div class="grid__column-2">
                        <nav class="category">
                            <h3 class="category__heading">
                                <i class="category__heading-icon fa-solid fa-list"></i>
                                Danh mục
                            </h3>
                            <ul class="category-list"> 
                                <li class="category-item category-item--active">
                                    <a href="ControllerServlet?action=login" class="category-item__link">CNTT</a>
                                </li>
                                <li class="category-item category-item--active">
                                    <a href="" class="category-item__link">Fontend</a>
                                </li>
                                <li class="category-item category-item--active">
                                    <a href="" class="category-item__link">Fullstack</a>
                                </li>
                            </ul>
                        </nav>
                    </div>
    
                    <div class="grid__column-10">
                        <div class="home-filter">
                            <span class="home-filter__label">Tìm kiếm theo</span>
                            <button class="home-filter__btn btn--primary">Mới nhất</button>
                            <div class="select-input">
                                <span class="select-input__label">Ngôn ngữ</span>
                                <i class="select-input__icon fas fa-angle-down"></i>
                                <ul class="select-input__list">
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Java</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">JavaScript</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">.Net</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="select-input">
                                <span class="select-input__label">Cấp bậc</span>
                                <i class="select-input__icon fas fa-angle-down"></i>
                                <ul class="select-input__list">
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Thực tập sinh</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Nhân viên</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Trưởng nhóm</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="select-input">
                                <span class="select-input__label">Lương</span>
                                <i class="select-input__icon fas fa-angle-down"></i>
                                <ul class="select-input__list">
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Dưới 10 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">10 - 15 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">10 - 20 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">20 - 25 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">25 - 30 triệu</a>
                                    </li>
                                </ul>
                            </div>
							<div class="select-input">
                                <span class="select-input__label">Lương</span>
                                <i class="select-input__icon fas fa-angle-down"></i>
                                <ul class="select-input__list">
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">Dưới 10 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">10 - 15 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">10 - 20 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">20 - 25 triệu</a>
                                    </li>
                                    <li class="select-input__item">
                                        <a href="" class="select-input__link">25 - 30 triệu</a>
                                    </li>
                                </ul>
                            </div>
                            
                        </div>

                        <div class="home-content">
                            <div class="grid__row">
                            <% 
                            	ArrayList<data> data = (ArrayList<data>)request.getAttribute("data");
                            	model_BO bo = new model_BO();
                        		data = bo.getAllData();
                            	for(int i=0; i< data.size(); i++){
                            %>
                                <div class="grid__column-2-4">
                                    <div class="home-content-item">
                                        <div class="home-content-item__img" style="background-image: url(https://static.topcv.vn/company_logos/tap-doan-cong-nghiep-vien-thong-quan-doi-6417bb41bf793.jpg
                                        );"></div>
                                        <h4 class="home-content-item__name"><%= data.get(i).getTitle() %></h4>
                                        <h4 class="home-content-item__company"><%= data.get(i).getCompany() %></h4>
                                        <div class="home-content-item__salary">
                                            <span class="home-content-item__salary-current">Lương: <%= data.get(i).getSalary() %></span>
                                        </div>
                                        <div class="home-content-item__action">
                                            <span class="home-content-item__tym home-content-item__tym--like">
                                                <i class="home-content-item__tym-icon far fa-heart"></i>
                                                <i class="home-content-item__tym-icon--liked fas fa-heart"></i>
                                            </span>
                                            <%-- <div class="home-content-item__address">
                                                <i class="home-content-item__address-icon fa-solid fa-location-dot"></i>
                                                <span class="home-content-item__address-name">Hà Nội</span>
                                            </div> --%>
                                        </div>
                                    </div>
                                </div>
                             <%
                            	}
                             %>   
                                
                            </div>
                        </div>
                        <div class="listPage">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer">

        </footer>
    </div>
    <script type="text/javascript" src="./js/script.js">
    </script>
</body>
</html>