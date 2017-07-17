<template>

 <div class="form-group"> 
	 <div class="all">
	 	<div class="image">
	 		<img src="../assets/bookingLogo.png" />
	 	</div>
		   
		    <div class="column is-12">
    		<label class="label" for="email">Email address:</label>
    		<p :class="{ 'control': true }">
        	<input v-validate="'required|email'" :class="{'input': true, 'is-danger': errors.has('email') }" name="email" type="text" placeholder="" class="inputEmail">
        	</p>
        	<p>
        	<span v-show="errors.has('email')" class="help">{{ errors.first('email') }}</span>
    		</p>
			</div>
		     	<button type="submit" id="recoverButton">RECOVER</button><br>
		     	
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
.inputEmail {
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
  data () {
    return {
      email: '',
      // name: '',
      // url: '',
      // secret: '',
      formSubmitted: false
    }
  },
  methods: {
    validateBeforeSubmit(e) {
        this.$validator.validateAll();
        if (!this.errors.any()) {
            this.submitForm()
        }
      },
    submitForm(){
      this.formSubmitted = true
    }
  }
}
	// export default {
	//   servicename: 'recover',
	//   data () {
	//     return {
	//       msg: 'Welcome to Your Vue.js App'
	//     }
	//   }
	// }
</script>