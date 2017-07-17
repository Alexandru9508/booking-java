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
<!-- 					<h6 style="color:grey; text-align: left;">SERVICE DETAILS</h6>
 -->
					<div class="clearfix" style="margin-top:50px;">
						<div class="form-group float-left">
							<a class="logoImage" href="#">
								<img src="../assets/image-logo.png">
								<!-- <span>Add service</span> -->
								
								<button class="btn btn-primary uploadLogo" type="submit">
									<input v-ref:file-input type="file" style="width : 250px; color : black;">
								</button>

							</a>
							<!-- <label for="exampleInputServiceName"><h5>Service name</h5></label>
							<input type="text" class="form-control"> -->
							
								<!-- <button @click="open"></button> -->
						</div>

						<div class="form-group form-group-company-name "><!--daca este vreo problema , adauga float-right dupa company name-->
							<label for="exampleInputCompanyName"><h5>Company name</h5></label>
							<input type="text" class="form-control" required>
						</div>

						<div class="form-group  form-group-service-description float-left">
							<label for="exampleTextarea"><h5>Service description</h5></label>
							<textarea class="form-control" id="exampleTextarea" rows="5" required></textarea>
							<button class="btn btn-primary sign-out" type="submit">Sign out</button>
							<button type="button" class="btn btn-success">Save</button>

							<!-- <button class="btn btn-primary save" type="submit">Save</button> -->
						</div>

						<div class="form-group form-group-company-description float-right">
							<!-- <label for="exampleInputCompanyDescription"><h5>Company description</h5></label>
							<textarea class="form-control" id="exampleTextarea" rows="5"></textarea> -->
							<!-- <input type="text" class="form-control"> -->

							<!-- <label for="exampleInputPrice"><h5>Price</h5></label>
							<input type="text" class="form-control"> -->
						</div>
					</div>

					<!-- <h6 style="color:grey; text-align: left;">AVAILABILITY</h6> -->

				</form>	
			</div>
		</div>	
	</div>

</template>

<script>
	export default {
		name: 'uploadLogo',
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



.uploadLogo{
	background-color: #e6e6e6;
	margin-top: 20px;
	width: 280px;
	border-color: grey;
}
.uploadLogo:hover{
	background-color: #cac7c7;
	cursor: pointer;
}
.sign-out{
	margin-top: 12px;
    /*margin: auto;*/
    float: left;
    padding: 1.5rem 3rem;
    background-color: #dadada;
    border-color: grey;
}
.sign-out:hover{
	background-color: #cac7c7;
	cursor: pointer;
}

.btn-success{
	margin-top: 12px;
    /*margin: auto;*/
    float: right;
    padding: 1.5rem 3rem;
    background-color: #d07edf;
    border-color: grey;
    /*background-color: rgb(208, 126, 223);
    border-color: grey;*/
}
.btn-success:hover{
	background-color: #bf6cce;
	cursor: pointer;
}


.tabledata {
	border: 1px solid #ce7ede;
}
/*h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}*/

a {
	color: #ce7ede;
	text-decoration: none;
}
.addNewService{
	/*display: inline-block;*/
	color: #ce7ede;
	font-weight: bold;
	text-align: left;
	float: left;
	/*padding-left: 160px;*/
}


.addCServiceCircle{
	display: inline-block;
	float: right;
	/*padding-left: 100px;*/
}

.addCServiceCircle span {
	display: block;
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
	
	width: 49%;
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