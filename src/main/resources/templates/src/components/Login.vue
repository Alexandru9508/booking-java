<template>

 <div class="form-group"> 
 	<div class="image">
 		<img src="../assets/bookingLogo.png" />
 	</div>
	    <div class="form">
	    	<form> 
	       		<label for="mail" class="elementEmail">Email address:</label></br>
	     		<input type="email" id="mailLogin" name="user_email"></br> 
	     		<label for="password" class="elementPassword">Password: </label></br>
	     		<input type="password" id="passwordLogin" name="user_password"></br>
	     	</form>
	     	<button type="submit" id="loginButton">LOGIN</button></br>
	     	<div class="goToRecover">
    			<router-link to="Recover">Recover password</router-link>
			</div>
     </div>
  </div>
</template>


<style type="text/css">

#mailLogin, #passwordLogin {
	font-size: 180%;
	width: 28%;
}
#loginButton{
	margin-top: 5%;
	font-size: 190%;
	width: 28%;
	background-color:#DA6CE9;
	border:0px;
	color:#ffffff;

}
.image {
	
	margin-top:8.2%;
	margin-bottom: 4%;


}

.elementEmail{
	margin-top: 2%;
	margin-left: -18.5%;
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
	
</script>