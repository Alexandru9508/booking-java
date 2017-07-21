<template>
<div>
<nav-bar></nav-bar>

<div class="content">
	<div id="company-list">	
		<h3 id="companylist-title">Company list</h3>
	</div>

<div class="box">
<div class="tbl-header">
<table cellpadding="0" cellspacing="0" border="0">
  <thead>
    <tr>
      <th>Name</th>
      <th>Description</th>          
      <th>View info</th>          
    </tr>
  </thead>
</table>
</div>
<div v-for="company in companies.body">	
<div class="tbl-content">
<table cellpadding="0" cellspacing="0" border="0">
  <tbody>
    <tr>

      <td><{{ company.companyname }}</td>



      <td>{{ company.description }}</td>
      <td>

      <div class="row">
<template v-for="variant in ['secondary']">
    <div class="col-md-4 pb-2" v-for="size in ['sm']">
    <b-button c :size="size" :variant="variant" href="">
        <a id="linkservices" :href="'/company/' + company.idcompany">Go to company<!--  {{ company.idcompany }} --></a>
    </b-button>
    </div>
</template>
</div>


		</td>     
    </tr>        
  </tbody>
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


			 this.$http.get('http://192.168.150.242:9000/allCompanys')
			// this.$http.get('http://192.150.242:9000/allCompanys')
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
	border-radius: 3%;
margin: auto;
width: 50%;
background: -webkit-linear-gradient(top, #d145e9, #8e0567);
background: linear-gradient(to bottom, #d145e9, #8e0567);
font-family: 'Roboto', sans-serif;

}

a:link {
    text-decoration: none;
}

a:visited {
    text-decoration: none;
}

a:hover {
    text-decoration: none;
}

a:active {
    text-decoration: none;
}
a
{
	color: gray;
}



.btn-secondary{
	background-color: white;

}

table{
width:100%;
margin: auto;
table-layout: fixed;
}
.tbl-header{
background-color: rgba(255,255,255,0.3);
}

.tbl-content{

overflow-x:auto;
margin-top: 0px;
border: 1px solid rgba(255,255,255,0.3);
}
.box th{
padding: 20px 15px;
text-align: left;
font-weight: 500;
font-size: 15px;
color: #fff;
text-transform: uppercase;
}
.box td{
padding: 15px;
text-align: left;
vertical-align:middle;
font-weight: 300;
font-size: 12px;
color: #fff;
border-bottom: solid 1px rgba(255,255,255,0.1);
}


/* demo styles */

@import url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);

#companylist-title {
	font: bold 34px "Century Schoolbook", Georgia, Times, serif;
	width:100%;
	color: #d145e9;
	border:0;
	font-size: 30px;
	margin:auto;
	padding-top: 30px;
	padding-bottom: 30px;
	text-align: center;
}



@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}

</style>