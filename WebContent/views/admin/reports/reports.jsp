<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="col mt-4">
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item" role="presentation">
			<a class="nav-link active" id="videoEditing-tab" data-toggle="tab"
				href="#videoEditing" role="tab" aria-controls="videoEditing"
				aria-selected="true">Favorites</a>
		</li>
		<li class="nav-item" role="presentation">
			<a class="nav-link" id="videoList-tab" data-toggle="tab"
				href="#videoList" role="tab" aria-controls="videoList"
				aria-selected="false">Favorites User</a>
		</li>
		<li class="nav-item" role="presentation">
			<a class="nav-link" id="shareFriends-tab" data-toggle="tab"
				href="#shareFriends" role="tab" aria-controls="shareFriends"
				aria-selected="false">Share Friends</a>
		</li>
	</ul>
	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active" id="videoEditing"
			role="tabpanel" aria-labelledby="videoEditing-tab">
			<table class="table table-bordered mt-3">
				<tr>
					<td>Video Title</td>
					<td>Favorites COunt</td>
					<td>Latest Date</td>
					<td>Oldest Date</td>
				</tr>
				<tr>
					<td>JAVA 4</td>
					<td>203</td>
					<td>1/12/2020</td>
					<td>1/12/2020</td>
				</tr>
			</table>
		</div>
		<div class="tab-pane fade" id="videoList" role="tabpanel"
			aria-labelledby="videoList-tab">
			<form action="" method="get">
				<div class="row mt-3">
					<div class="col">
						<div class="form-inline">
							<div class="form-group ml-3">
								<label>
									Video Title
									<select name="" id="" class="form-control ml-3">
										<option value="">JAVA $</option>
									</select>
								</label>
								<button class="btn-info ml-2">Reports</button>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col mt-3">
						<table class="table table-bordered">
							<tr>
								<td>Username</td>
								<td>Fullname</td>
								<td>Email</td>
								<td>Favorite Date</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
			</form>
		</div>
		<div class="tab-pane fade" id="shareFriends" role="tabpanel"
			aria-labelledby="shareFriends-tab">
			<form action="" method="get">
				<div class="row mt-3">
					<div class="col">
						<div class="form-inline">
							<div class="form-group ml-3">
								<label>
									Video Title
									<select name="" id="" class="form-control ml-3">
										<option class="" value="">JAVA $</option>
									</select>
								</label>
								<button class="btn-info ml-2">Reports</button>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col mt-3">
						<table class="table table-bordered">
							<tr>
								<td>Sender Man</td>
								<td>Sender Email</td>
								<td>Receiver Email</td>
								<td>Sent Date</td>
							</tr>
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>