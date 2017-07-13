<template>

 <div> 
 	<div class="image">
 		<img src="../assets/bookingLogo.png" />
 	</div>
	    <div class="form">
	    	<form> 
	       		<label for="mail" class="elementEmail">Email address:</label></br>
	     		<input type="email" id="mailRecover" name="user_email"></br> 
	     	</form>
	     	<button type="submit" id="recoverButton">RECOVER</button></br>
	     	
     </div>
  </div>
</template>


<style type="text/css">
div{
	background-color:rgba(255, 255, 255, 0);
	
}
#mailRecover {
	font-size: 180%;
	width: 28%;
}
#recoverButton{
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
	  name: 'recover',
	  data () {
	    return {
	      msg: 'Welcome to Your Vue.js App'
	    }
	  }
	}
</script>