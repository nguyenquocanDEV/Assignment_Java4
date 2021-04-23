<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="col-8 offset-2">
	<form action="" method="post">
		${Routes.SITE_REGISTRATION_SHOW }
		<div class="card">
			<div class="card-header">
				<b>Registration</b>
			</div>

			<div class="card-body">
				<c:if test="${ not empty message }">
					<div class="row">
						<div class="col">
							<div class="alert alert-success">${message}</div>
						</div>
					</div>
				</c:if>
				<c:if test="${ not empty error }">
					<div class="row">
						<div class="col">
							<div class="alert alert-danger">${error}</div>
						</div>
					</div>
				</c:if>
				<div class="row">
					<div class="col">
						<div class="form-group">
							<label for="id">ID</label>
							<input type="text" class="form-control" name="id" id="id"
								aria-describedby="usernameHid" placeholder="id"
								value="${user.id}" />
							<small id="usernameHid" class="form-text text-muted">id
								is required</small>
						</div>
						<div class="form-group">
							<label for="fullName">Fullname</label>
							<input type="text" class="form-control" name="fullName"
								id="fullName" aria-describedby="fullnameHid"
								placeholder="Fullname" value="${user.fullName }" />
							<small id="fullnameHid" class="form-text text-muted">Fullname
								is required</small>
						</div>
					</div>
					<div class="col">
						<div class="form-group">
							<label for="password">Password</label>
							<input type="password" class="form-control" name="password"
								id="password" placeholder="Password" />
						</div>
						<div class="form-group">
							<label for="email">Email</label>
							<input type="text" class="form-control" name="email" id="email"
								aria-describedby="emailHid" placeholder="Email"
								value="${user.email }" />
							<small id="emailHid" class="form-text text-muted">Email
								is Required</small>
						</div>
					</div>
				</div>
			</div>
			<div class="card-footer text-muted">
				<button class="btn btn-success">Sign Up</button>
			</div>
		</div>
	</form>
</div>