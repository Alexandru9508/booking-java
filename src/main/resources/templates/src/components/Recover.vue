<template>

 <div class="form-group"> 
	 <div class="all">
	 	<div class="image">
	 		<img src="../assets/bookingLogo.png" />
	 	</div>
		   
		    	
		    <div class="column is-12">
    			<label class="labelEmail" for="email">Email address:</label>
    			<p :class="{ 'control': true }">
        		<input v-model="user.email" v-validate="'required|email'" :class="{'input': true, 'is-danger': errors.has('email') }" name="email" type="text" placeholder="" id="email">
        		</p>
        		<p>
        		<span v-show="errors.has('email')" class="help">{{ errors.first('email') }}</span>
    			</p>
			</div>
		     	<button type="button" id="submit" @click="submit()">RECOVER</button><br>
		     	
	     </div>
	   </div>
  </div>
</template>


<style type="text/css">
/*div{
	background-color:rgba(255, 255, 255, 0);
	
}*/
p{
	color:#990000;
}
#email {
	font-size: 180%;
	width: 28%;
}

#submit{
	margin-top: 5%;
	font-size: 190%;
	width: 28%;
	background-color:#DA6CE9;
	border:0px;
	color:#ffffff;

}
.all{
	text-align: center;
}
.image {
	
	margin-top:8.2%;
	margin-bottom: 4%;
}

.labelEmail{
	margin-top: 2%;
	margin-left: -19%;
	width: 20%
}



/*Responsive*/
@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}

</style>


<script>
export default {
	data: function (){
		return {
			user: {
				email: '',
				// // password: ''
			},
			
		};
	},
	methods: {
		submit() {
		     this.$http.get('http://192.168.150.242:9000/recover', this.user)
		    .then( function (response)  {
		    	console.log('response: ', response);
		    	
		    })
		    .catch(function (error) {
		      console.log('error: ', error);
		     
		    })
		 },
		 // submit() {
		 //     this.$http.post('http://192.168.150.242:9000/recover', this.user)
		 //    .then( function (response)  {
		 //    	console.log('response: ', response);
		 //    })
		 //    .catch(function (error) {
		 //      console.log('error: ', error);
		 //    })
		 // },
		 // showValue(event, index){
		 // 	this.serviceAvailability[index] = true;
		 // 	console.log('this.serviceAvailability[index]: ', this.serviceAvailability);
		 // },
		

	},
	
}
</script>

