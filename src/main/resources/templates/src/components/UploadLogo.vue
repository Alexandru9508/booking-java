<template>
	<div class="container-fluid">
	<nav-bar></nav-bar>
		<div class="row">
			<div class="form_container clearfix">
				<form class=" serviceForm">
					<div class="clearfix" style="margin-top:50px;">
						<div class="form-group float-left">
							<a class="logoImage" href="#">
								<img src="../assets/image-logo.png">
								<button class="btn btn-primary uploadLogo" type="submit">
									<!-- <input name="logo"  type="file"  style="width : 250px; color : black;"> -->
									<form enctype="multipart/form-data" action="/upload" method="post">
                           
                           <input type="file" name="logo" accept="image/*"/>
</form>
								</button>

							</a>
						</div>

						<div class="form-group form-group-company-name "><!--daca este vreo problema , adauga float-right dupa company name-->
							<label for="exampleInputCompanyName"><h5>Company name</h5></label>
							<div class="column is-12">
						    
						        <p class="control has-icon has-icon-right">


						            <input name="companyname" v-model="company.companyname" v-validate.initial="'required'" :class="{'input': true, 'is-danger': errors.has('companyname') }" type="text" placeholder="" class="form-control">
						            
						            <i v-show="errors.has('companyname')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('companyname')" class="help is-danger">{{ errors.first('companyname') }}</span>
						            
						        </p>

						    </div>
							
						</div>

						<div class="form-group  form-group-service-description float-left">
							<label for="exampleTextarea"><h5>Service description</h5></label>
							<p class="control has-icon has-icon-right">


							<textarea name="description" v-model="company.description"  v-validate.initial="'required'" :class="{'input': true, 'is-danger': errors.has('description') }" type="text" placeholder="" class="form-control" id="exampleTextarea" rows="5" required></textarea>

								<i v-show="errors.has('description')" class="fa fa-warning"></i>
						            
					            <span v-show="errors.has('description')" class="help is-danger">{{ errors.first('description') }}</span>
						            </p>

							<button class="btn btn-primary sign-out" type="submit">Sign out</button>
							<button type="button" class="btn btn-success" @click="submit()">Save</button>
						</div>

						<div class="form-group form-group-company-description float-right">
						</div>
					</div>
				</form>	
			</div>
		</div>	
	</div>

</template>

<script>
import NavBar from './navbar.vue';
	export default {
		data () {
			return {

				company: {
					// logo: '',
					// companyname: '',
					// description: ''

				},
				};
			},
			methods: {		
			  	submit() {

				    this.$http.post(`${process.env['API_URL']}/addCompanyInfo`, this.company)
				    .then( function (response)  {
				    	console.log('response: ', response);
				    	location.href = '#companylist';
				    	console.log(response);
				    })
				    .catch(function (error) {
				      console.log('error: ', error);
				    })
			 	},
				 initCompany() {
				 	if(localStorage.company) {
				 		this.company = JSON.parse(localStorage.company);
				 	}
				 	
				 }
			},
			components: {
         NavBar,
       },
			created() {
				this.initCompany();
			}
	}
</script>

<style scoped>
p{
	color:#990000;
}


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
/*Responsive*/

@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}
</style>