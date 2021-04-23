<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="col mt-4">
	<ul class="nav nav-tabs" id="myTab" role="tablist">
		<li class="nav-item" role="presentation">
			<a class="nav-link active" id="videoEditing-tab" data-toggle="tab"
				href="#videoEditing" role="tab" aria-controls="videoEditing"
				aria-selected="true">Videos Editing</a>
		</li>
		<li class="nav-item" role="presentation">
			<a class="nav-link" id="videoList-tab" data-toggle="tab"
				href="#videoList" role="tab" aria-controls="videoList"
				aria-selected="false">Video List</a>
		</li>
	</ul>
	<div class="tab-content" id="myTabContent">
		<div class="tab-pane fade show active" id="videoEditing"
			role="tabpanel" aria-labelledby="videoEditing-tab">
			<form action="" class="post">
				<div class="card">
					<div class="card-body">
						<div class="row">
							<div class="col-3">
								<div class="border p-3">
									<img src="../images/laptop.jpg" alt="" class="img-fluid">
								</div>
							</div>
							<div class="col-9">
								<div class="form-group">
									<label for="youtubeId">Youtube ID</label>
									<input type="text" class="form-control" name="youtubeId"
										id="youtubeId" aria-describedby="youtubeIdHid"
										placeholder="Youtube ID">
									<small id="youtubeIdHid" class="form-text text-muted">youtubeId
										is required</small>
								</div>
								<div class="form-group">
									<label for="videoTitle">Video Title</label>
									<input type="text" class="form-control" name="videoTitle"
										id="video Title" aria-describedby="videoTitleHid"
										placeholder="VideoTitle">
									<small id="videoTitleHid" class="form-text text-muted">VideoTitle
										id is required</small>
								</div>
								<div class="form-group">
									<label for="viewCount">View Count</label>
									<input type="text" class="form-control" name="viewCount"
										id="viewCount" aria-describedby="viewCountHid"
										placeholder="View Count">
									<small id="viewCountHid" class="form-text text-muted">viewCount
										id is required</small>
								</div>
								<div class="form-check form-check-inline">
									<label>
										<input type="radio" class="form-check-input" value="true"
											name="status" id="status">
										Active
									</label>
									<label>
										<input type="radio" class="form-check-input" value="false"
											name="status" id="status">
										Inactive
									</label>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="description">Description</label>
								<textarea name="description" id="description" cols="30"
									rows="10" class="form-control"></textarea>
							</div>
						</div>
					</div>

					<div class="card-footer text-muted">
						<button class="btn btn-primary">Create</button>
						<button class="btn btn-warning">Update</button>
						<button class="btn btn-danger">Delete</button>
						<button class="btn btn-info">Reset</button>
					</div>
				</div>
			</form>

		</div>
		<div class="tab-pane fade" id="videoList" role="tabpanel"
			aria-labelledby="videoList-tab">
			<table class="table table-stripe">
				<tr>
					<td>Youtube Id</td>
					<td>Video Title</td>
					<td>View Count</td>
					<td>Status</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>Ytt</td>
					<td>Không phải dạng vừa đâu</td>
					<td>405</td>
					<td>Active</td>
					<td>
						<a href="">
							<i class="fa fa-edit" aria-hidden="true">Edit&ensp;</i>
						</a>
						<a href="">
							<i class="fa fa-trash" aria-hidden="true">Delete</i>
						</a>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>