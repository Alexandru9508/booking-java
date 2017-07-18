<template>

	<div class="content">
		<div id="company-list">	
			<h3>Company list</h3>
		</div>
		<div class="company-list-description">
			<div class="table-title">
				<div class="table-content-white-title">
					<div class="content">
						<table class="title-white">
							<tr>
								<th>Name</th>
								<th>Email</th> 
								<th>Phone No </th>
								<th>Avaibility</th>
							</tr>
						</table>
						
					</div>
				</div>
			</div>
		



	</div>





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


	</div>
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

.title-white {
    width:100%;
    color: #565656;
    border:0;
    font-size: 15px;
    margin-bottom: 
  }

  .title-white th {
    border:none;
  }

  .title-white td {
    border-top: none;
  }

	.content{
		margin: auto;
	}

	#company-list{
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