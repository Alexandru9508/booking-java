<template>
	<div class="container-fluid">
		

		<div class="row">
			<div class="form_container clearfix">
				<form class=" serviceForm">
<<<<<<< HEAD
					<h2 class="titleService">Make your booking</h2>
	
=======
					<h2 class="titleService" style="margin-top: 50px; margin-bottom:50px;">Make your booking</h2>
<!-- 					<h6 style="color:grey; text-align: center;">SERVICE DETAILS</h6>

  --> 	
>>>>>>> 80f76bb5c0e499efe3c16b19f5979b8b4bf24316
  									<span style="color: grey;">PERSONAL DETAILS</span>
					<div class="clearfix" style="margin-top:50px;">
						<div class="form-group float-left">
							
							<label for="exampleInputServiceName"><h5>Name</h5></label>
							<input type="text" class="form-control box-size" required>
						
								
						</div>

<<<<<<< HEAD
						<div class="form-group form-group-company-name ">
=======
						<div class="form-group form-group-company-name float-right"><!--daca este vreo problema , adauga float-right dupa company name-->
>>>>>>> 80f76bb5c0e499efe3c16b19f5979b8b4bf24316
							<label for="exampleInputCompanyName"><h5>Email</h5></label>
							<input type="text" class="form-control box-size" required>
						</div>

						<div class="form-group  form-group-service-description float-left">
							
							<label for="exampleInputPrice"><h5>Phone Number</h5></label>
							<input type="text" class="form-control box-size" required>
						</div>

						<div class="form-group form-group-company-description float-right">
<<<<<<< HEAD
							<button type="button" class="btn btn-next">NEXT</button>
							

						</div>
					</div>

					

=======
							<button type="submit" class="form-control btn btn-next">NEXT</button>
							<!-- <label for="exampleInputCompanyDescription"><h5>Company description</h5></label>
							<textarea class="form-control" id="exampleTextarea" rows="5"></textarea> -->
							<!-- <input type="text" class="form-control"> -->

							<!-- <label for="exampleInputPrice"><h5>Price</h5></label>
							<input type="text" class="form-control"> -->

						</div>
					</div>
>>>>>>> 80f76bb5c0e499efe3c16b19f5979b8b4bf24316
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
.box-size{
	width: 100%;

}

.titleService{
	text-align: center;
	color:#d07edf;
	font-weight: bold;
}

<<<<<<< HEAD

=======
>>>>>>> 80f76bb5c0e499efe3c16b19f5979b8b4bf24316
.btn-next{
	margin-top: 39px;
	color: white;
<<<<<<< HEAD
   
    padding: 0.6rem 6rem;
    background-color: #d07edf;
    border-color: grey;
   
=======
    /*margin: auto;*/
    float: right;
    /* padding: 0.6rem 11.5rem;
         */    background-color: #d07edf;
    border-color: grey;
     width: 100%;
    /*background-color: rgb(208, 126, 223);
    border-color: grey;*/
>>>>>>> 80f76bb5c0e499efe3c16b19f5979b8b4bf24316
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

	
	
	width: 40%;
	display: table;
}


@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}



</style>