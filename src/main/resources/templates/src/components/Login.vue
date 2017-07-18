<template>

 <div class="form-group"> 
 	<div class="all">
 		<div class="image">
 			<img src="../assets/bookingLogo.png" >
 		</div>
	  	  <div class="form">
	  	  		<!-- email -->
	    		<form> 
		       		<div class="column is-12">
    			<label class="label" for="email">Email address:</label>
    			<p :class="{ 'control': true }">
        		<input v-model="user.email" v-validate="'required|email'" :class="{'input': true, 'is-danger': errors.has('email') }" name="email" type="text" placeholder="" class="inputEmail">
        		</p>
        		<p>
        		<span v-show="errors.has('email')" class="help">{{ errors.first('email') }}</span>
    			</p>
				</div>



		     		
		     		<!-- password -->
		     		<!-- <label for="password" class="elementPassword">Password: </label></br>
		     		<input type="password" class="passwordLogin" name="user_password"></br>
 -->
 				<div class="column is-12">
            <label class="label">Password</label>
            <p class="control has-icon has-icon-right">
                <input v-model="user.password" v-validate="'required|min:6'" :class="{'input': true, 'is-danger': errors.has('password') }" type="password" placeholder="" class="inputEmail">
                <p>
                <p>
                <i v-show="errors.has('password')" class="fa fa-warning"></i>
  
                <span v-show="errors.has('password')" class="help is-danger">{{ errors.first('password') }}</span>
                </p>
            </p>
        	</div>



		     	</form>
		     	<!-- button -->
		     	<button type="button" id="submit" @click="submit()">LOGIN</button></br>
		     	<div class="goToRecover">
	    			<router-link to="Recover">Recover password</router-link>
				</div>
	     </div>
	  </div>
  </div>
</template>


<style type="text/css">
p{
	color:#990000;
}
.passwordLogin {
	font-size: 100%;
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

.label{
	margin-top: 2%;
	margin-left: -20.5%;
	width: 20%
}
.elementPassword{

	margin-top: 2%;
	margin-left: -20.6%;
	width: 20%
}
.goToRecover{
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

<script>
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
		    axios.get('http://192.168.150.242:8080/hello')
		    .then( function (response)  {
		    	console.log('response: ', response);
		    	debugger;
		    })
		    .catch(function (error) {
		      console.log('error: ', error);
		      debugger;
		    })
		 }
		}
	}


</script>

