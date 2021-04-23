<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="offset-4 col-4">
	<form action="" method="post">
		<div class="card">
			<div class="card-header">
				<b>Login</b>
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
				<div class="form-group">
					<label for="id">ID</label>
					<input type="text" class="form-control" name="id" id="id"
						aria-describedby="usernameHid" placeholder="Username" />
					<small id="usernameHid" class="form-text text-muted">ID is
						Required</small>
				</div>
				<div class="form-group">
					<label for="password">Password</label>
					<input type="password" class="form-control" name="password"
						id="password" aria-describedby="passwordHid"
						placeholder="Password" />
					<small id="passwordHid" class="form-text text-muted">Password
						is Required</small>
				</div>
				<div class="form-check form-check-inline">
					<label>
						<input type="checkbox" class="form-check-input" name="remember">
						Remember me
					</label>
				</div>
			</div>

			<div class="card-footer text-muted">
				<button class="btn btn-success">Login</button>
			</div>
		</div>
	</form>
</div>