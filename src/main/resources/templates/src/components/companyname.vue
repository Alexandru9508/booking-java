    <template>
      <div class="nmm">

        <div class="container">



          <div class="companyname">


            

              <div class="logo">
                <img src="..//assets/l2.png" style="width:150px;height:150px;">


              </div>
              <div class="parent">
                  <h6 id="colLeft">Company name</h6>                              
                </div>



              <div class="describeservices2">

                
                <p> Disrupt jean shorts viral hella meh, plaid cupidatat magna art party. Echo Park adipisicing literally narwhal. Williamsburg leggings church-key, craft beer forage cornhole jean shorts blue bottle pariatur. Officia sapiente bespoke, locavore plaid cray voluptate deep v ex vinyl tote bag chillwave swag occaecat. Sed banh mi 3 wolf moon single-origin coffee quis tempor. Hoodie pitchfork pork belly aliqua, shabby chic elit consequat freegan ethical try-hard mixtape. Schlitz banjo deep v ullamco blog, umami nulla sint elit skateboard Godard odio.</p>             
              </div>
           
          </div>
        

        <div class="background-bottom">
          <div class="nameoftheservice">
            <div class="list>">
              <div class="describeservices">
                <div class="parent">
                  <h6 id="colLeft">Name of the service</h6>
                  <div id="colCenter"></div>
                  <div id="colRight"><img src="..//assets/tr.png" style="width:20px;height:20px;"> </div>
                  <div id="colRight"><img src="..//assets/pen.png" style="width:20px;height:20px;"></div>
                </div>
                <p> Disrupt jean shorts viral hella meh, plaid cupidatat magna art party. Echo Park adipisicing literally narwhal. Williamsburg leggings church-key, craft beer forage cornhole jean shorts blue bottle pariatur. Officia sapiente bespoke, locavore plaid cray voluptate deep v ex vinyl tote bag chillwave swag occaecat. Sed banh mi 3 wolf moon single-origin coffee quis tempor. Hoodie pitchfork pork belly aliqua, shabby chic elit consequat freegan ethical try-hard mixtape. Schlitz banjo deep v ullamco blog, umami nulla sint elit skateboard Godard odio.</p>


                <table class="price">
                  <tr>
                    <th>Mon-Fri, 08:00 - 16:00</th>
                    <th>6 available</th> 
                    <th>hour  1hour </th>
                    <th>210 Lei</th>

                  </tr>
                  <tr class="pricedescribe">
                    <td>Avalibility</td>
                    <td>Spaces</td> 
                    <td>Duration</td>
                    <td>Price</td>
                  </tr>
                </table>


                <b-button class="butonnewservices2" @click="showModal" ref="btnShow">
                  BOOK NOW
                </b-button>



                <b-modal id="modal1">

                          <div class="imgmodal"><img src="..//assets/msg.png" style="width:35%;height:17%;"></div>

                          <div class="msgsent">
                            <h5>Your request was sent!</h5> 


                          </div>

                          <div class="describemodal">

                          In a couple of seconds a confirmation email will be sent to your email address with all the detalis for your reservation. Thank your for using our services.


                          </div>
                </b-modal>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- MODAL SEND MSG -->

      </div>


    </template>


    <script>
      export default {
        methods: {
          showModal() {
            this.$root.$emit('show::modal','modal1');
          },
          hideModal() {
            this.$root.$emit('hide::modal','modal1');
          // Return focus to our Open Modal button
          // See accessibility below for additional return-focus methods
          this.$refs.btnShow.$el.focus();
        }
      }
    }



  </script>




  <style>

    .container{
      font-family: 'Open Sans bold', sans-serif;
      width: 100%;
      margin:auto;


    }

     .companyname {
      padding-top: 50px;
      margin: auto;
      width: 50%;   
      background-color: white;
      color: gray;
      
    }
     .logo {   
      float: left;
      display: inline;
    }


    .parent {

      width: 100%;
      height: 40px;
      padding-top: 10px;
      margin: auto; 
      border-radius: 2px;
      color:#d145e9;
      
    }

      .describeservices {
      width: 50%;
      background-color: white;
      margin: auto;
      border-radius: 2px;
      text-align: left;
      color: #929292;
      border: 0px;
      border-color: gray;
      box-shadow:  0 0 0.2em #8875e4;
      padding-left: 20px;


    }



    /*----------------Bottom*/

     .background-bottom {
      background-color : #fcfcfc;
      margin: auto;
      padding-top: 40px;

    }
    .list {
      float: left;      
    }

     .price {
    width:100%;
    color: black;
    border:0;
    font-size: 12px;
  }

  .price th {
    border:none;
  }

  .price td {
    border-top: none;
  }
  .pricedescribe {
    color: gray;
    font-size: 10px;
  }


    .imgmodal {
      text-align: center;
    }

    .msgsent{
      color:  #d145e9;
      text-align: center;
      padding-top: 5%;
    }

    .describemodal
    {
      text-align: center;
      padding-top: 5%;

    }

    .imgmodal{
      margin: auto;
    }



   

   


    /*--------------- -----COMPANY NAME*/
   
  
    .companytitle {
      color: #d145e9;
      float: left;
    }
    
    

   

    /*--------------------FLOAT LEFT*/

    .float-left {
      font-size: 25px;
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }

    /*-------------------buton*/



    .butonnewservices2 {
      background: #d145e9;
      color: #fff;
      margin-top: 20px;
      margin-bottom: 20px;
    }

    /*-------------------table*/




    table


    /*---------TABLE NAME OF THE SERVICES*/

    .nameoftheservice {

      margin: auto;
      width: 600px;
      background-color: white;
      color:#d145e9;

    }

    


  
    /*------------col*/

    #colLeft {
      display: inline;
      float: left;
      font-weight: bold;
    }
    #colLefttop {

      float: left;
      font-weight: bold;
    }


    #colCenter {
      float: left;
      display: inline;
      overflow: none;
      white-space: nowrap;
    }

    #colRight {
      display: inline;
      float: right;
      margin-right:  20px;

    } 

    p {
      font-size: 12px;

    }

    @media (max-width: 1000px) {
      .form-group {
        float: none;
        margin-right: 0;
      }
    }

  </style>