<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="col-8 offset-2">
	<form action="ChangePass" method="post">
		<div class="card">
			<div class="card-header">
				<b>Change Password</b>
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
								aria-describedby="usernameHid" placeholder="ID"
								value="${username }" />

						</div>
						<div class="form-group">
							<label for="password">Password</label>
							<input type="password" class="form-control" name="password"
								id="password" placeholder="Password" />
						</div>
					</div>
					<div class="col">
						<div class="form-group">
							<label for="currentPassword">Current Password</label>
							<input type="password" class="form-control"
								name="currentPassword" id="currentPassword"
								placeholder="Current Password" />
						</div>
						<div class="form-group">
							<label for="confirmPassword">Confirm Password</label>
							<input type="password" class="form-control"
								name="confirmPassword" id="confirmPassword"
								placeholder="Confirm Password" />
						</div>
					</div>
				</div>
			</div>
			<div class="card-footer text-muted">
				<button class="btn btn-success">Change Password</button>
			</div>
		</div>
	</form>
</div>