<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="offset-4 col-4">
	<form action="ForgotPass" method="post">
		<div class="card mt-5 ">
			<div class="card-header">
				<b>Forgot Password</b>
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
						aria-describedby="usernameHid" placeholder="ID" />
					<small id="usernameHid" class="form-text text-muted">ID is
						Required</small>
				</div>
				<div class="form-group">
					<label for="email">Email</label>
					<input type="email" class="form-control" name="email" id="email"
						aria-describedby="emailHid" placeholder="Email" />
				</div>
			</div>
			<div class="card-footer text-muted">
				<button class="btn btn-success">Send</button>
			</div>
		</div>
	</form>
</div>