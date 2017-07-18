<template>
	<ul>
		<li v-for="company in companies">
			<p>
				{{ name }}
				<button class="btn btn-default" type="button" @click="showServices(company)">
					Show
				</button>
			</p>
		</li>
	</ul>
</template>


<script>
	export default {
		data() {
			return {
				companies: []
			}
		},
		methods: {
			getCompanies(){
				this.$http.get('http://192.168.150.242:8080/').then(response => {
				    console.log('response success:', response);
				    this.companies = response;
				  }, response => {
				    console.log('response error: ', response);
				  });
			},
			showServices(company){
				debugger;

			}
		},
		created(){
			this.getServices();
		}
	}
</script>


	






<style>
	.container{
		font-family: 'Open Sans bold', sans-serif;
		width: 100%;
		margin:auto;
	}

	.companyname {
		padding-top: 50px;
		margin: auto;
		width: 50%;   
		background-color: white;
		color: gray;      
	}

	.logo {   
		float: left;
		display: inline;
	}


	.parent {
		width: 100%;
		height: 40px;
		padding-top: 10px;
		margin: auto; 
		border-radius: 2px;
		color:#d145e9;      
	}

	.describeservices {
		width: 50%;
		background-color: white;
		margin: auto;
		border-radius: 2px;
		text-align: left;
		color: #929292;
		border: 0px;
		border-color: gray;
		box-shadow:  0 0 1em rgba(209, 69, 233, 0.37);
		padding-left: 20px;
	}



	/*----------------Bottom*/

	.background-bottom {
		background-color : #fcfcfc;
		margin: auto;
		padding-top: 40px;
	}

	.list {
		float: left;      
	}

	.price {
		width:100%;
		color: #565656;
		border:0;
		font-size: 12px;
	}

	.price th {
		border:none;
	}

	.price td {
		border-top: none;
	}

	.pricedescribe {
		color: gray;
		font-size: 10px;
	}


	.add-button{
		width: 2.1em;  height: 2.3em;
		text-align: middle;
		background-size: 100%;
		background-image: url(../assets/pen.png)
	}

	.delete-button{
		width: 2em;  height: 2.3em;
		background-size: 100%;
		background-image: url(../assets/tr.png)
	}

	.imgmodal {
		text-align: center;
	}

	.msgsent{
		color:  #d145e9;
		text-align: center;
		padding-top: 5%;
	}

	.describemodal
	{
		text-align: center;
		padding-top: 5%;

	}

	.imgmodal{
		margin: auto;
	}

	.companytitle {
		color: #d145e9;
		float: left;
	}

	.float-left {
		font-size: 25px;
		display: block;
		color: white;
		text-align: center;
		padding: 14px 16px;
		text-decoration: none;
	}

	.butonnewservices2 {
		background: #d145e9;
		color: #fff;
		margin-top: 20px;
		margin-bottom: 20px;
	}

	table

	.nameoftheservice {
		margin: auto;
		width: 600px;
		background-color: white;
		color:#d145e9;
	}

	#colLeft {
		display: inline;
		float: left;
		font-weight: bold;
	}
	#colLefttop {

		float: left;
		font-weight: bold;
	}

	#colCenter {
		float: left;
		display: inline;
		overflow: none;
		white-space: nowrap;
	}

	#colRight {
		display: inline;
		float: right;
		margin-right:  20px;

	} 



	/*MODAl-------------------*/




	/*-------------------------------*/





	#titleService  	{
		text-align: center;
		color: #d244ea;
		padding-bottom: -20px
	}

	#personaldetalis  	{
		text-align: center;
		padding-bottom: 60px;
	}

	.form-group1{
		float: left;
	}

	.form-group2{
		float: right;	
	}

	.form-group3{
		float:left;	
	}

	.form-group4{
		float: right;
		width: 46%;

	}

	.btn-next{
		margin-top: 39px;
		color: white;   
		float: right;   
		background-color: #d07edf;
		border-color: grey;
		width: 100%;
	}

	.btn-next:hover{
		background-color: #bf6cce;
		cursor: pointer;
	}

	/*Responsive*/
	p {
		font-size: 12px;
	}

	@media (max-width: 1000px) {
		.form-group {
			float: none;
			margin-right: 0;
		}
	}

</style>