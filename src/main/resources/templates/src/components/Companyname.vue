<template>
	<div class="nmm">
		<nav-bar></nav-bar>
		<div class="container">
			<div class="companyname">
				<div class="logo">
					<img src="..//assets/l2.png" style="width:100px;height:100px;">
				</div>
				<div class="parent">
					<h6 id="colLeft">{{currentCompany.companyname}}</h6>             
				</div>
				<div class="describeservices2">                
					<p> {{currentCompany.description}}</p>            
				</div>           
			</div>
			<div v-for="(company, index) in companies.body"> 
				<div class="background-bottom">
					<div class="nameoftheservice">
						<div class="list>">
							<div class="describeservices">
								<div class="parent">
									<h6 id="colLeft">


										{{company.servicename}}</h6>
										<div id="colCenter"></div>
										<div class="add-delete-button">
											<div id="colRight">
												<b-button class="add-button" href="">
												</b-button>
											</div>
											<div id="colRight">
												<b-button class="delete-button"  href="">
												</b-button>
											</div>
										</div>
									</div>
									<p> {{company.servicedescription}}</p>
									<table class="price">
										<tr>
											<th>Mon-Fri, 08:00 - 16:00</th>
											<th>{{company.space}} available</th> 
											<th>{{company.duration}} hour </th>
											<th>{{company.price}} Lei</th>
										</tr>
										<tr class="pricedescribe">
											<td>Avalibility</td>
											<td>Spaces</td> 
											<td>Duration</td>
											<td>Price</td>
										</tr>
									</table>
									<b-button class="butonnewservices2" @click="showModal(`modal-${index}`)" ref="btnShow">
										BOOK NOW
									</b-button>
								</div>
								<b-modal :id="modalName(index)">
									<div>
										<div class="container-fluid">
											<div class="row">
												<div class="form_container clearfix">
													<form class=" serviceForm">
														<div v-show="step1">
															<h3 id="titleService" >Make your booking</h3>	
															<h6 id="personaldetalis">PERSONAL DETAILS</h6>
															<div class="form-group1">							
																<label for="name"><h5>Name</h5></label>
																<input type="text" class="form-control box-size" required>								
															</div>
															<div class="form-group2">
																<label for="email"><h5>Email</h5></label>
																<input type="text" class="form-control box-size" required>
															</div>
															<div class="form-group3">
																<label for="phonenumber"><h5>Phone Number</h5></label>
																<input type="text" class="form-control box-size" required>
															</div>
															<div class="form-group4">
																<span id="goToStep2" @click="goToStep('step2', 'step1')" class="form-control btn btn-next">NEXT</span>			
															</div>	
														</div>
														<div v-show="step2">
															<h2>step 2</h2>

															<!-- for Vue 2.0 -->
															<div class="row">
																<span>Choose date：</span>
																<date-picker :date="startTime" :option="option" ></date-picker>
															</div>
															<span id="goToStep1"  @click="goToStep('step1', 'step2')" class="form-control btn btn-next">Back</span>			
															<button type="onSubmit" @click="onSubmit()" class="form-control btn btn-next">Submit</button>						
														</div>
													</form>	
												</div>
											</div>	
										</div>
									</div> 
								</b-modal>
								<b-modal id="modalsuccces">
									<div class="imgmodal"><img src="..//assets/msg.png" style="width:35%;height:17%;"></div>
									<div class="msgsent">
										<h5>Your request was sent!</h5> 
									</div>
									<div class="describemodal">
										In a couple of seconds a confirmation email will be sent to your email address with all the detalis for your reservation. Thank your for using our services.
									</div>
								</b-modal>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</template>
	<script>

		import myDatepicker from 'vue-datepicker'

		import NavBar from './navbar.vue';
		export default {
			data() {
				return {
					companyId: '',
					date: new Date(),       
					step1: true,
					step2: false,
					companies: [],
					currentCompany: {},


// for Vue 2.0
startTime: {
	time: ''
},
endtime: {
	time: ''
},

option: {
	type: 'multiday',
	week: ['Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa', 'Su'],
	month: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
	hour : [],
	format: 'YYYY-MM-DD',
	placeholder: 'when?',
	inputStyle: {
		'display': 'inline-block',
		'padding': '6px',
		'line-height': '22px',
		'font-size': '16px',
		'border': '2px solid #fff',
		'box-shadow': '0 1px 3px 0 rgba(0, 0, 0, 0.2)',
		'border-radius': '2px',
		'color': '#5F5F5F'
	},
	color: {
		header: '#ccc',
		headerText: '#f00'
	},
	buttons: {
		ok: 'Ok',
		cancel: 'Cancel'
	},
overlayOpacity: 0.5, // 0.5 as default
dismissible: true // as true as default
},
timeoption: {
	type: 'multi-min',
	week: ['Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa', 'Su'],
	month: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
	format: 'YYYY-MM-DD HH:mm',

},
multiOption: {
	type: 'multi-day',
	week: ['Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa', 'Su'],
	month: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
	format:"YYYY-MM-DD HH:mm"
},
// limit: [{
//   type: 'mult-weekday',
//   available: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31]
// },
// {
//   type: 'fromto',
//   from: '2016-02-01',
//   to: '2016-02-20'
// }]

}
},
components: {
	NavBar,
	'date-picker': myDatepicker
},
methods: {
	modalName(modalNo) {
		return `modal-${modalNo}`
	},
	showModal(modal) {
		this.$root.$emit('show::modal', modal);
	},
	onSubmit: function() {
		console.log('sdadwq');
		// debugger;
		// console.log('sdadwq');

		// this.$root.$emit('hide::modal1','modalsuccces');
	

//afisezi modal 3 de succes
},
goToStep: function(showStep, hidestep) {
	this[showStep] = true;
	this[hidestep] = false;
	console.log('hide and show', showStep, hidestep, this);
},
hideModal() {
	this.$root.$emit('hide::modal','modal1');
	this.$refs.btnShow.$el.focus();
},
getServices() {
	this.$http.get('http://192.168.150.242:9000/company/' + this.companyId + '/services')
	.then(response => {
		this.companies = response;
		this.currentCompany = response.body[0].idcompany;

	})
	.then(error => {
		console.log('error: ', error);
	});
}
},


created(){
	this.companyId = this.$route.params.id;
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

	.describemodal{
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