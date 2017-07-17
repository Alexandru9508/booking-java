<template>
	<div class="container-fluid">
		<!-- <div class="header clearfix">
			<h2 class="addNewService">Add new service</h2>
			
			<a class="addCServiceCircle" href="#">
				<img src="../assets/Selection_002.png">
				<span>Add service</span>
			</a>
		</div> -->

		<div class="row">
			<div class="form_container clearfix">
				<form class=" serviceForm">
					<h2 class="titleService" style="margin-top: 50px; margin-bottom:50px;">Make your booking</h2>
<!-- 					<h6 style="color:grey; text-align: center;">SERVICE DETAILS</h6>

  --> 	
  									<span style="color: grey;">PERSONAL DETAILS</span>
					<div class="clearfix" style="margin-top:50px;">
						<div class="form-group float-left">
							<!-- <a class="logoImage" href="#">
								<img src="../assets/image-logo.png">
								<span>Add service</span>
								
								<button class="btn btn-primary uploadLogo" type="submit">
									<input v-ref:file-input type="file" style="width : 250px; color : black;">
								</button>
							
							</a> -->
							<label for="exampleInputServiceName"><h5>Name</h5></label>
							<input type="text" class="form-control box-size" required>
						
								<!-- <button @click="open"></button> -->
						</div>

						<div class="form-group form-group-company-name float-right"><!--daca este vreo problema , adauga float-right dupa company name-->
							<label for="exampleInputCompanyName"><h5>Email</h5></label>
							<input type="text" class="form-control box-size" required>
						</div>

						<div class="form-group  form-group-service-description float-left">
							<!-- <label for="exampleTextarea"><h5>Service description</h5></label>
							<textarea class="form-control" id="exampleTextarea" rows="5" required></textarea>
							<button class="btn btn-primary sign-out" type="submit">Sign out</button>
							<button type="button" class="btn btn-success">Save</button> -->

							<!-- <button class="btn btn-primary save" type="submit">Save</button> -->
							<label for="exampleInputPrice"><h5>Phone Number</h5></label>
							<input type="text" class="form-control box-size" required>
						</div>

						<div class="form-group form-group-company-description float-right">
							<button type="submit" class="form-control btn btn-next">NEXT</button>
							<!-- <label for="exampleInputCompanyDescription"><h5>Company description</h5></label>
							<textarea class="form-control" id="exampleTextarea" rows="5"></textarea> -->
							<!-- <input type="text" class="form-control"> -->

							<!-- <label for="exampleInputPrice"><h5>Price</h5></label>
							<input type="text" class="form-control"> -->

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
	/*methods: {
  open() {
    this.$els.file-input.click()
  }
}*/
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

.btn-next{
	margin-top: 39px;
	color: white;
    /*margin: auto;*/
    float: right;
    /* padding: 0.6rem 11.5rem;
         */    background-color: #d07edf;
    border-color: grey;
     width: 100%;
    /*background-color: rgb(208, 126, 223);
    border-color: grey;*/
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

	/*float: left;*/
	
	width: 40%;
	display: table;
}

/*.form-group-availability {
    margin: auto;
    width: 100%;
    height: 458px;
    border: 1px solid #ce7ede;
    border-radius: 10px;
    box-sizing: border-box;
}*/

/*Responsive*/

@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}

/*form h5 {
	text-align: left;
	text-transform: uppercase;
	color: #ddd;
}

.form-group-service-name{
	float: left;
	width: 450px;
	height: 30px;
	padding: 10px;

}
.form-group-service-duration{

	float: right;
	display: inline-block;
	width: 450px;
	height: 30px;
	padding: 10px;


}
.form-group-service-description{
	clear: left;
	margin-top: 120px;
	width: 450px;
}


.form-group-spaces{

	float: right;
	display: inline-block;
	width: 450px;
	height: 30px;
	padding: 10px;
}
*/

</style>