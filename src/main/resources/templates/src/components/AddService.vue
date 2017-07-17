<template>
	<div class="container-fluid">
		<div class="header clearfix"style="">
			<h2 class="addNewService">Add new service</h2>
			
			<a class="addCServiceCircle round-button" href="#">
				<!-- <img src="../assets/Selection_002.png"> -->
				<span style="margin-top: 14px;">+</span>
			</a>
			<a class="addCServiceCircle" href="#">
				<!-- <img src="../assets/Selection_002.png"> -->
				<span id="add-service-text">Add service</span>
			</a>
		</div>

		<div class="row">
			<div class="form_container clearfix">
				<form class="serviceForm">
					<h6 style="color:grey; text-align: left; margin-top: 50px; margin-bottom:50px;">SERVICE DETAILS</h6>
					<!-- service name -->
					<div class="clearfix">
						<div class="form-group form-group-service-name float-left">
							<label for="exampleInputServiceName"><h5>Service name</h5></label>
							<div class="column is-12">
						    
						        <p class="control has-icon has-icon-right">
						            <input name="name" v-model="name" v-validate.initial="'required|alpha'" :class="{'input': true, 'is-danger': errors.has('name') }" type="text" placeholder="" class="form-control">
						            
						            <i v-show="errors.has('name')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('name')" class="help is-danger">{{ errors.first('name') }}</span>
						            
						        </p>
						    </div>
						</div>
							<!-- service duratin -->
						<div class="form-group form-group-service-duration float-right">
							<label for="exampleInputServicDuration"><h5>Service duration</h5></label>
							
							<div class="column is-12">
					        
					        <p class="control has-icon has-icon-right">
					            <input name="duration" v-model.number="duration" v-validate="'required|numeric'" :class="{'input': true, 'is-danger': errors.has('duration') }" type="number" placeholder="" class="form-control">
					            <i v-show="errors.has('duration')" class="fa fa-warning"></i>
					            <span v-show="errors.has('duration')" class="help is-danger">{{ errors.first('duration') }}</span>
					        </p>
					    </div>
						</div>
						<!-- service description -->
						<div class="clearfix">
							<div class="form-group  form-group-service-description float-left">
								<label for="exampleTextarea"><h5>Service description</h5></label>
								<textarea class="form-control" id="exampleTextarea" rows="5" required></textarea>
							</div>
							<!-- service space -->
							<div class="form-group form-group-spaces float-right">
								<label for="exampleInputSpaces"><h5>Spaces</h5></label>
								<div class="column is-12">
						    
						        <p class="control has-icon has-icon-right">
						            <input name="spaces" v-model="spaces" v-validate.initial="'required|alpha'" :class="{'input': true, 'is-danger': errors.has('spaces') }" type="text" placeholder="" class="form-control">
						            
						            <i v-show="errors.has('spaces')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('spaces')" class="help is-danger">{{ errors.first('spaces') }}</span>
						            
						        </p>
						    </div>

								<!-- service Price -->

								<label for="exampleInputPrice"><h5>Price</h5></label>
								<input type="text" class="form-control" required>
							</div>
						</div>	
					</div>

					<h6 style="color:grey; text-align: left;">AVAILABILITY</h6>

					{{ availability }}

					<table class="tabledata" width="100%" border="1" bordercolor="#cccccc" cellpadding="5" cellspacing="5">
					<tr v-for="item in availability">
					</tr>
					</table>



					<table class="tabledata" width="100%" border="1" bordercolor="#cccccc" cellpadding="5" cellspacing="5">
						 <!-- <tr>
						     <td></td>
						     <th style="text-align:center;">Monday</th>
						     <th style="text-align:center;">Tuesday</th>
						     <th style="text-align:center;">Wednesday</th>
						     <th style="text-align:center;">Thursday</th>
						     <th style="text-align:center;">Friday</th>
						     <th style="text-align:center;">Saturday</th>
						     <th style="text-align:center;">Sunday</th>
						 </tr> -->
						<!--  <tr v-for="(value, key) in availability">
						     <td>{{key}}</td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td><input type="checkbox" id="one" value="One"> </td>
						     <td v-for="(value1, key) in value">{{key}}</td>

						     
						 </tr> -->

						 <!-- <span v-for="(value, key) in availability">
					     	<span v-for="(value1, key1) in value">
					     		<tr>
					     			<td>{{key1}}</td>
					     		</tr>
					     		<tr>
					     			<td>{{key}}</td>
					     		</tr>

					     	</span>
					     </span> -->
					     <tr>
					     	<td v-for="(value, key) in test">
					     		<span v-for="(value1, key1) in value">{{key1}}</span>
					     	</td>
					     </tr>

						<tr v-for="(value, key) in test">
							<td>{{key}}</td>
							<td v-for="(value1, key) in value">
								{{value1}}
							</td>
						</tr>
						
					</table>
				</form>	
			</div>
		</div>	
	</div>

	<!-- <componenta></componenta>
	 -->
</template>

<script>
	export default {
		name: 'addService',
		data () {
			return {
				availability: {
					'Monday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Tuesday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Wednesday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Thursday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Friday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Saturday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
					'Sunday': {
						'07:00': false,
						'08:00': false,
						'09:00': false,
						'10:00': false,
						'11:00': false,
						'12:00': false,
						'13:00': false,
						'14:00': false,
						'15:00': false,
						'16:00': false,
						'17:00': false,
						'18:00': false,
					},
				},

				test: {
					'07:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'08:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'09:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'10:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'11:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'12:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'13:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'14:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'15:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'16:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'17:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
					'18:00': {'monday': false, 'Tuesday':false, 'Wednesday': false, 'Thursday': false, 'Friday': false},
			}
			}
		}
	}


</script>

<style scoped>
#add-service-text{
	margin-top: 80px;
	margin-right: -82px;
}
/*eroarea la culoare*/
p{
color:#990000;
}
.round-button {
    /* display:block */;
    width:80px;
    height:80px;
    line-height:50px;
    border: 1px solid #f5f5f5;
    border-radius: 50%;
    color:white;
    text-align:center;
    text-decoration:none;
    background: #ce7ede;
    box-shadow: 0 0 3px gray;
    font-size:40px;
    font-weight:lighter;
}
.round-button:hover {
    background: #bf6cce;
}

.tabledata {
	border: 1px solid #ce7ede;
	margin-bottom: 100px;
}

a {
	color: #ce7ede;
	text-decoration: none;
}
.addNewService{
	/*display: inline-block;*/
	color: #ce7ede;
	font-weight: bold;
	text-align: left;
	float: left;
	/*padding-left: 160px;*/
}


.addCServiceCircle{
	display: inline-block;
	float: right;
	/*padding-left: 100px;*/
}

.addCServiceCircle span {
	display: block;
}

.clearfix {
	display: table;
	width: 100%;
}
.header{
	width: 51%;
	margin: auto;
	margin-top:50px
}

.form_container {
	width: 50%;
	display: block;
	margin: 0 auto;
	min-width: 600px;
}

.form-group {

	/*float: left;*/
	
	width: 49%;
	display: table;
}

.form-group-availability {
    margin: auto;
    width: 100%;
    height: 458px;
    /*border: 1px solid #ce7ede;*/
    border-radius: 10px;
    box-sizing: border-box;
}

/*Responsive*/

@media (max-width: 1000px) {
	.form-group {
		float: none;
		margin-right: 0;
	}
}

/*form h5 {
	text-align: left;
	text-transform: uppercase;
	color: #ddd;
}

.form-group-service-name{
	float: left;
	width: 450px;
	height: 30px;
	padding: 10px;

}
.form-group-service-duration{

	float: right;
	display: inline-block;
	width: 450px;
	height: 30px;
	padding: 10px;


}
.form-group-service-description{
	clear: left;
	margin-top: 120px;
	width: 450px;
}


.form-group-spaces{

	float: right;
	display: inline-block;
	width: 450px;
	height: 30px;
	padding: 10px;
}
*/

</style>