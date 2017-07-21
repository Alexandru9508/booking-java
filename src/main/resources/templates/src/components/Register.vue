<template>

 
 	<div class="form-group">
 	 <div class="all">
 	<div class="image">
 		
 		<img src="../assets/bookingLogo.png">
 	</div>
	    <div class="form">
	    	<form> 
	    	<!-- Numele -->
	     <div class="column is-12">
        <label class="labelName">Name</label>
        <p class="control has-icon has-icon-right">
            <input name="username" v-model="user.username" v-validate="'required'" :class="{'input': true, 'is-danger': errors.has('username') }" type="text" placeholder="" class="inputName">
            <i v-show="errors.has('username')" class="fa fa-warning"></i>
            </p>
            <p>
            <span v-show="errors.has('username')" class="help is-danger">{{ errors.first('username') }}</span>
        </p>
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
	     	<button type="submit" id="submit" @click="submit()">Register</button></br>
	     	
	   		 <div class="goToLogin">
    			<router-link to="login">You already have an account?</router-link>
			</div>
			</div>
     </div>
  </div>
</template>

<script>
// import Vue from 'vue'
// import VuePassword from 'vue-password'



export default {
	data: function (){
		return {
			user: {
				username:'',
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
		 },
		 submit() {
		     this.$http.post('http://192.168.150.242:9000/register', this.user)
		    .then( function (response)  {
		 		this.$router.push('/login');
		    })
		    .catch(function (error) {
		      console.log('error: ', error);
		    })
		 },
		 
		 // showValue(event, index){
		 // 	this.serviceAvailability[index] = true;
		 // 	console.log('this.serviceAvailability[index]: ', this.serviceAvailability);
		 // },
		

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
	margin-top: 1%;
	font-size: 190%;
	width: 28%;
	background-color:#DA6CE9;
	border:0px;
	border-radius: 5%;
	color:#ffffff;
}
.all{
	text-align: center;
}
.image {	
	margin-top:1%;
}

.labelName {
	
	margin-left: -24%;
	width: 20%
}
.labelEmail{
	
	margin-left: -19%;
	width: 20%	

}
.labelPassword{
	margin-top: 1%;
	margin-left: -22%;
	width: 20%
}
.goToLogin{
	margin-top: 1%;
	text-decoration: none;

}

a:hover {
    color: purple;
    background-color: transparent;
    text-decoration: none;
    font-size: 18px;
}

/*Responsive*/

@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}
</style>

