<template>

	<div class="container-fluid">
	<nav-bar></nav-bar>
		<div class="header clearfix"style="">
			<h2 class="addNewService">Add new service</h2>
			
			<button type="button" class=" btn addCServiceCircle round-button" @click="submit()">
				<span style="margin-top: 2px;">+</span>
			</button>
			<a class="addCServiceCircle">
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
						            <input name="name" v-model='service.servicename' v-validate.initial="'required'" :class="{'input': true, 'is-danger': errors.has('name') }" type="text" placeholder="" class="form-control">
						            
						            <i v-show="errors.has('name')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('name')" class="help is-danger">{{ errors.first('name') }}</span>
						            
						        </p>
						    </div>
						</div>
							<!-- service duration -->
						<div class="form-group form-group-service-duration float-right">
							<label for="exampleInputServicDuration"><h5>Service duration</h5></label>
							
							<div class="column is-12">
					        
					        <p class="control has-icon has-icon-right">
					            <input name="duration" v-model='service.duration' v-validate="'required|numeric'" :class="{'input': true, 'is-danger': errors.has('duration') }" type="number" placeholder="" class="form-control">
					            <i v-show="errors.has('duration')" class="fa fa-warning"></i>
					            <span v-show="errors.has('duration')" class="help is-danger">{{ errors.first('duration') }}</span>
					        </p>
					    </div>
						</div>
						<!-- service description -->
						<div class="clearfix">
							<div class="form-group  form-group-service-description float-left">
								<label for="exampleTextarea"><h5>Service description</h5></label>
								<p class="control has-icon has-icon-right">
								<textarea name="description" v-model='service.servicedescription' v-validate.initial="'required'" :class="{'input': true, 'is-danger': errors.has('description') }" type="text" placeholder="" class="form-control" id="exampleTextarea" rows="6" required></textarea>
								<i v-show="errors.has('description')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('description')" class="help is-danger">{{ errors.first('description') }}</span>
						            </p>

							</div>
							<!-- service space -->
							<div class="form-group form-group-spaces float-right">
								<label for="exampleInputSpaces"><h5>Spaces</h5></label>
								<div class="column is-12">
						    
						        <p class="control has-icon has-icon-right">
						            <input name="space" v-model='service.space' v-validate.initial="'required|numeric'" :class="{'input': true, 'is-danger': errors.has('space') }" type="number" placeholder="" class="form-control">
						            
						            <i v-show="errors.has('space')" class="fa fa-warning"></i>
						            
						            
						            <span v-show="errors.has('space')" class="help is-danger">{{ errors.first('space') }}</span>
						            
						        </p>
						    </div>

								<!-- service Price -->

								<label for="exampleInputPrice"><h5>Price</h5></label>
								<div class="column is-12">
					        
					        <p class="control has-icon has-icon-right">
					            <input name="price" v-model='service.price'v-validate="'required|numeric'" :class="{'input': true, 'is-danger': errors.has('duration') }" type="number" placeholder="" class="form-control">
					            <i v-show="errors.has('price')" class="fa fa-warning"></i>
					            <span v-show="errors.has('price')" class="help is-danger">{{ errors.first('price') }}</span>
					        </p>
					    </div>

							</div>
						</div>	
					</div>

					<h6 style="color:grey; text-align: center;">AVAILABILITY</h6>

					<section class="calendar-wrapper">

    <ol class="calendar-wrapper-list calendar-wrapper-list-days">
      <li class="interval" v-for="day in days">
        <span>{{ day }}</span>
      </li>
    </ol>

    <ol class="calendar-wrapper-list">
      <li class="interval" v-for="interval in intervals">
        <span>{{ interval }}</span>
      </li>
    </ol>

    <ol class="calendar-column calendar-wrapper-list" v-for="day in days.length">
      <li class="ui-state-default" v-for="interval in intervals"></li>
    </ol>

  </section>
				</form>	
			</div>

		</div>	
	</div>

</template>

<script>
import NavBar from './navbar.vue';
	import {eventBus} from '@/main';
    export default {
        data () {
            return {
            	companyId: '',
                service: {
                	/*idservice: '',
                	idcompany: '',*/
                	servicename : '',
                	servicedescription : '',
                	space : '',
                	price: '',
                	duration: ''

                },
                availability: [],
                

                days: [
          'Mon',
          'Tue',
          'Wed',
          'Thu',
          'Fri',
          'Sat',
          'Sun',
        ],
        intervals: [
          '07:00 - 08:00',
          '08:00 - 09:00',
          '09:00 - 10:00',
          '10:00 - 11:00',
          '11:00 - 12:00',
          '12:00 - 13:00',
          '13:00 - 14:00',
          '14:00 - 15:00',
          '15:00 - 16:00',
          '16:00 - 17:00',
          '17:00 - 18:00',
        ],
        calendar: {
          day1: [],
          day2: [],
          day3: [],
          day4: [],
          day5: [],
          day6: [],
          day7: [],
        }
                };
            },
            methods: {  
            	initSelectable() {
			        $( ".calendar-column").selectable();
			      },      
                  submit() {

                    this.$http.post(`${process.env['API_URL']}/company/`+ this.companyId, this.service)
                    .then( function (response)  {
                    	this.service = {};
                    	console.log(response);
                    })
                    .catch(function (error) {
                      console.log('error: ', error);
                    })
                 },
                 initServices() {
                 	 /*debugger;*/
                     if(localStorage.company) {
                     		
                         this.companyId = JSON.parse(localStorage.company).idcompany;
                         
                     }
                     
                 }
            },
            components: {
         NavBar,
       },
            created() {
                this.initServices();
            },
            mounted() {
      		this.initSelectable();
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
.calendar-wrapper {
    display: flex;
    justify-content: space-around;
    max-width: 592px;
    padding: 65px 20px 20px 20px;
    margin: 0 auto 20px auto;
    position: relative;
    border: 1px solid #DDD;
  }
  .calendar-wrapper-list {
    list-style: none;
    padding: 0;
    margin: 0;
  }
  .calendar-wrapper-list-days {
    position:  absolute;
    top: 20px;
    right: 21px;
    left: auto;
    left:  95px;
    text-align: right;
  }
  .calendar-wrapper-list-days li{
    display: inline-block;
    width: 13%;
    text-align: center;
  }
  .interval {
    height: 7%;
    margin-bottom: 15px;
  }
  .interval  span {
    vertical-align: middle;
  }
  .calendar-column {
    width: 8%;
    padding: 0;
    margin: 0;
  }
  .ui-state-default {
    display: block;
    margin-bottom: 15px;
    background-color: #DDD;
    width: 100%;
    padding-top: 100%;
    border-radius: 50%;
    box-sizing: border-box;
  }
  .ui-selecting,
  .ui-selected {
    background-color: #c980e3;
  }

</style>