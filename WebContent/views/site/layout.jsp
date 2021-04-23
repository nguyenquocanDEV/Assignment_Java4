<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>${page.title }</title>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<base href="/Ass/">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
</head>
<body>
	<main class="container">
		<!-- Write your comments here -->
		<header class="row pt-5 pb-2">
			<div class="col-8">
				<h1>Online Entertainment</h1>
			</div>
			<div class="col-3 text-right">
				<img src="../images/logo1.jpg" alt="" class="mr-4" />
			</div>
		</header>
		<!--Nav -->
		<nav class="row">
			<nav class="col navbar navbar-expand-sm navbar-light bg-light">

				<button class="navbar-toggler d-lg-none" type="button"
					data-toggle="collapse" data-target="#collapsibleNavId"
					aria-controls="collapsibleNavId" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<!-- menu -->
				<div class="collapse navbar-collapse" id="collapsibleNavId">
					<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
						<!-- Home -->
						<li class="nav-item active">
							<a class="nav-link" href="Homepage">
								<i class="fa fa-home" aria-hidden="true"></i>
								Home
								<span class="sr-only">(current)</span>
							</a>
						</li>
						<!-- Favorites -->
						<li class="nav-item">
							<a class="nav-link" href="#">
								<i class="fa fa-heart" aria-hidden="true"></i>
								My Favorites
							</a>
						</li>
						<!-- My Accounts -->
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="" id="dropdownId"
								data-toggle="dropdown" aria-haspopup="true"
								aria-expanded="false">
								<i class="fa fa-user" aria-hidden="true"></i>
								My Accounts
							</a>
							<div class="dropdown-menu" aria-labelledby="dropdownId">
								<c:if test="${! isLogin }">
									<a class="dropdown-item" href="Login">Login</a>
									<a class="dropdown-item" href="ForgotPass">Forgot Password</a>
									<a class="dropdown-item" href="Registration">Registration</a>
								</c:if>
								<c:if test="${isLogin }">
									<a class="dropdown-item" href="Logoff">Logoff</a>
									<a class="dropdown-item" href="ChangePass">Change Password</a>
									<a class="dropdown-item" href="EditProfile">Edit Profile</a>
								</c:if>
							</div>
						</li>

					</ul>
				</div>

			</nav>
		</nav>
		<!-- Content -->
		<section class="row" style="margin-top: 20px; margin-bottom: 20px">

			<jsp:include page="${page.contentUrl }"></jsp:include>

		</section>

		<!-- Footer -->
		<footer class="row">
			<div class="col text-center border-top">
				<strong>Nguyễn Quốc An &copy;2021. PH09981 FPT Polytechnic.
				</strong>
			</div>
		</footer>
	</main>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<c:if test="${not empty page.scriptUrl }">
		<jsp:include page="${page.scriptUrl }"></jsp:include>
	</c:if>
</body>
</html>
