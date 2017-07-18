<template>

 
 	<div class="form-group">
 	 <div class="all">
 	<div class="image">
 		<img src="../assets/bookingLogo.png" />
 	</div>
	   

	    	<!-- email -->
	     		
		    <div class="column is-12">
    			<label class="labelEmail" for="email">Email address:</label>
    			<p :class="{ 'control': true }">
        		<input v-model="user.email" v-validate="'required|email'" :class="{'input': true, 'is-danger': errors.has('email') }" name="email" type="text" placeholder="" class="inputEmail">
        		</p>
        		<p>
        		<span v-show="errors.has('email')" class="help">{{ errors.first('email') }}</span>
    			</p>
			</div>
	     		<!-- password -->
			 <div class="column is-12">
            <label class="labelPassword">Password</label>
            <p class="control has-icon has-icon-right">
                <input v-model="user.password" v-validate="'required|min:6'" :class="{'input': true, 'is-danger': errors.has('password') }" type="password" name="password" placeholder="" class="inputEmail">
                <p>
                <p>
                <i v-show="errors.has('password')" class="fa fa-warning"></i>
  
                <span v-show="errors.has('password')" class="help is-danger">{{ errors.first('password') }}</span>
                </p>
            </p>
        </div>
	     	</form>
	     	<!-- button -->
	     	<button type="submit" id="submit" @click="submit()">LOGIN</button></br>
	     	
	   		 <div class="goToLogin">
    			<router-link to="login">recover password</router-link>
			</div>
			</div>
     </div>
  </div>
</template>

<script>
<<<<<<< HEAD
// import Vue from 'vue'
// import VuePassword from 'vue-password'



export default {
	data: function (){
		return {
			user: {
				// name:'',
				email: '',
				password: ''
			},
			
		};
	},
	methods: {
		// submit() {
		 //    axios.get('http://192.168.150.242:8080/hello')
		 //    .then( function (response)  {
		 //    	console.log('response: ', response);
		 //    	debugger;
		 //    })
		 //    .catch(function (error) {
		 //      console.log('error: ', error);
		 //      debugger;
		 //    })
		 // },
		 submit() {
             this.$http.post('http://192.168.150.242:8080/register', this.user)
		    .then( function (response)  {
		    	console.log('response: ', response);
		    })
		    .catch(function (error) {
		      console.log('error: ', error);
		    })
		 },
		 // showValue(event, index){
		 // 	this.serviceAvailability[index] = true;
		 // 	console.log('this.serviceAvailability[index]: ', this.serviceAvailability);
		 // },
		
=======
	import axios from 'axios';
	export default {

		data: function (){
			return {
				user: {
					email: '',
					password: ''
				},

			};
		},
		methods: {
			submit() {
				axios.get('http://192.168.150.242:8080/login')
				.then( function (response)  {
					console.log('response: ', response);
				})
				.catch(function (error) {
					console.log('error: ', error);
				})
			}

		}
	}

>>>>>>> fa968126cf560d6b8dc1bdfa7bf6203f6f4872a2

	},
	
}

</script>

<style type="text/css">
p{
	color:#990000;
}
.inputPassword {
	font-size: 180%;
	width: 28%;
}
.inputName {
	font-size: 180%;
	width: 28%;
}
.inputEmail {
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
.labelName {
	margin-top: 2%;
	margin-left: -24%;
	width: 20%
}
.labelEmail{
	margin-top: 2%;
	margin-left: -19%;
	width: 20%	
}
.labelPassword{
	margin-top: 2%;
	margin-left: -22%;
	width: 20%
}
.goToLogin{
	margin-top: 2%;
}

/*Responsive*/

@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}
</style>

