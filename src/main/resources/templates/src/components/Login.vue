<template>

 <div> 
 	<div class="image">
 		<img src="../assets/bookingLogo.png" />
 	</div>
	    <div class="form">
	    	<form> 
	    		<label for="name" class="elementName">Your Name:</label></br>
	    		<input type="text" id="name" name="user_name"></br> 
	     		<label for="mail" class="elementEmail">Email address:</label></br>
	     		<input type="email" id="mail" name="user_email"></br> 
	     		<label for="password" class="elementPassword">Password: </label></br>
	     		<input type="password" id="password" name="user_password"></br>
	     	</form>
	     	<button type="submit" id="registerButton">Sign Up</button></br>
	     	<p class="haveAccount">You already have an account?</p>
     </div>
  </div>
</template>


<style type="text/css">

#name, #mail, #password {
	font-size: 180%;
	width: 28%;
	
}
#registerButton{
	margin-top: 5%;
	font-size: 190%;
	width: 28%;
	background-color:pink;

}
.image {
	
	margin-top:8%;
	margin-bottom: 6%;


}
.elementName{

	margin-top: 2%;
	margin-left: -20%;
}
.elementEmail{
	margin-top: 2%;
	margin-left: -18.5%;
}
.elementPassword{

	margin-top: 2%;
	margin-left: -20.6%;
}
.haveAccount{
	margin-top: 2%;
}
</style>

<script>
	export default {
	  name: 'login',
	  data () {
	    return {
	      msg: 'Welcome to Your Vue.js App'
	    }
	  }
	}
</script>