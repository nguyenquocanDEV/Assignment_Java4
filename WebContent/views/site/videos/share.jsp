<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="offset-3 col-6">
	<form action="" method="post">
		<div class="card">
			<div class="card-header">
				<h1>Send Video To Your Friends</h1>
			</div>
			<div class="card-body">
				<div class="form-group">
					<label for="email">Your Friends Email: </label>
					<input type="text" class="form-control" name="email" id="email"
						aria-describedby="emailHelperID" placeholder="Emails" />
					<small id="emailHelperID" class="form-text text-muted">
						Email is required! </small>
				</div>
			</div>
			<div class="card-footer">
				<button class="btn btn-success">Send</button>
			</div>
		</div>
	</form>
</div>