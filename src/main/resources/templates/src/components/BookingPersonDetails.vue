<template>
	<div class="container-fluid">
		

		<div class="row">
			<div class="form_container clearfix">
				<form class=" serviceForm">
					<h2 class="titleService">Make your booking</h2>
	
  									<span style="color: grey;">PERSONAL DETAILS</span>
					<div class="clearfix">
						<div class="form-group float-left">
							
							<label for="exampleInputServiceName"><h5>Name</h5></label>
							<input type="text" class="form-control">
						
								
						</div>

						<div class="form-group form-group-company-name ">
							<label for="exampleInputCompanyName"><h5>Email</h5></label>
							<input type="text" class="form-control" required>
						</div>

						<div class="form-group  form-group-service-description float-left">
							
							<label for="exampleInputPrice"><h5>Phone Number</h5></label>
							<input type="text" class="form-control">
						</div>

						<div class="form-group form-group-company-description float-right">
							<button type="button" class="btn btn-next">NEXT</button>
							

						</div>
					</div>

					

				</form>	
			</div>
		</div>	
	</div>

</template>

<script>
	export default {
		name: 'bookingPersonDetails',
		data () {
			return {
				msg: 'Welcome to Your Vue.js App'
			}
		}
	}
	
</script>

<style scoped>

.titleService{
	text-align: center;
	color:#d07edf;
	font-weight: bold;
}


.btn-next{
	margin-top: 35px;
	color: white;
   
    padding: 0.6rem 6rem;
    background-color: #d07edf;
    border-color: grey;
   
}
.btn-next:hover{
	background-color: #bf6cce;
	cursor: pointer;
}


.tabledata {
	border: 1px solid #ce7ede;
}


a {
	color: #ce7ede;
	text-decoration: none;
}


.clearfix {
	display: table;
	width: 100%;
}
.header{
	width: 50%;
	margin: auto;
}

.form_container {
	width: 50%;
	display: block;
	margin: 0 auto;
	min-width: 600px;
}

.form-group {

	
	
	width: 49%;
	display: table;
}


@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}



</style>