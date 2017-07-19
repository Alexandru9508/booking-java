<template>
<div>
<nav-bar></nav-bar>

	<div class="content">
		<div id="company-list">	
			<h3 id="companylist-title">Company list</h3>
		</div>



<!-- <div class="table-description">					
<table class="title">
<tr>
<th>Name:{{ companies }}</th>
<th>Description: {{ description }} </th>
<th><p>					
<button class="btn btn-default" type="button" @click="showServices(company)">
Show
</button>
</p></th>
</tr>
</table>							
</div> -->


<div class="table-description">
	<div v-for="company in companies.body">	
		<div class="box">
			<table class="title">
				<th>

					<td>
						
						Name: {{ company.companyname }}
						
					</td>


					<td>
						
							Description: {{ company.description }}
						
					</td>
					<td>

						<button class="btn btn-default" type="button" @click="showServices(company)">
							Show
						</button>

						<a :href="'#company/' + company.idcompany">
							Go to company {{ company.idcompany }}
						</a>
					</td>


				</th>

			</table>	
		</div>									

	</div>			
</div>
</div>

</div>
</template>


<script>
import NavBar from './navbar.vue';
	export default {
		data() {
			return {
				companies: [],
				description: [] 

			}
		},
		components: {
          NavBar,
        },

		methods: {
			getServices() {
				this.$http.get('http://192.168.150.242:9000/hello')
				.then(response => {
					this.companies = response;
// return response.json()
})
				.then(response => {
// this.companies = response;
})
				.then(error => {
					console.log('error: ', error);
				});
			}
		},
		created() {
			this.getServices();
		}
	}
</script>

<style>



	.box{

		background-color: #e8e7f8;
		padding-bottom: 10px;
		text-align: left;
	}	


	#companylist-title{
		color:#d145e9 ;
	}	


	/*table bottom*/


	.table-description{			
		padding-left: 10px;
		border-radius: 3%;
		padding-top: 20px;
		margin: auto;
		width: 50%
	}

	.title {
		width:100%;
		color: #565656;
		border:0;
		font-size: 15px;
		margin-bottom: 
	}

	.title th {
		border:none;
	}

	.title td {
		border-top: none;
	}

	.content{
		margin: auto;
	}

	#company-list{
		margin-top: 40px;
		margin-bottom: 40px;
		text-align: center;
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

	@media (max-width: 1000px) {
		.form-group {
			float: none;
			margin-right: 0;
		}
	}

</style>