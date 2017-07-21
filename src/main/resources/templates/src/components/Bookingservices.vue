  <template>
    <div class="nmm">



 <nav-bar></nav-bar>
                 
        <div class="bar-buton">
          <button class="btn buton" href="#">+</button>
        </div>  
        <div v-for="company in companies.body">  
        <div class="boxCompanyServices">
        <div class="nameoftheservice">
          <div class="list>">            
             <div class="describeservices">
              <div class="parent">
                <h6 id="colLeft">{{company.servicename}}</h6>
                <div id="colCenter"></div>
                <div class="add-delete-button">
                  <div id="colRight">
                    <b-button class="add-button" href="">

                    </b-button>
                  </div>
                  <div id="colRight">
                    <b-button class="delete-button"  href="">
                    </b-button>
                  </div>
                </div>
              </div>
              <div class="describe">
                descriere: {{company.servicedescription}}
              </div>
              <table class="price">
                <tr>
                  <th>Mon-Fri, 08:00 - 16:00</th>
                  <th>{{company.space}} available</th> 
                  <th>{{company.duration}} hour </th>
                  <th>{{company.price}} Lei</th>
                </tr>
                <tr class="pricedescribe">
                  <td>Avalibility</td>
                  <td>Spaces</td> 
                  <td>Duration</td>
                  <td>Price</td>
                </tr>
              </table>              
            </div> 
          </div>
        </div>
        </div>
        </div>        
      </div>
    </template>

  <script>
  import NavBar from './navbar.vue';


    export default {
      data() {
        return {
          companies: [],
          description: [] 

        }
         
      },
       components: {
          NavBar,
        },
      methods: {
        getServices() {
          this.$http.get('http://192.168.150.242:9000/company/services')
          .then(response => {
            debugger;
            
            this.companies = response;
            // return response.json()
          })
          .then(response => {
            debugger;
            // this.companies = response;
          })
          .then(error => {
            debugger;
            console.log('error: ', error);
          });
        }
      },
      created() {
        this.getServices();
      },

    }
  </script>

  <style>


  /*=========Nav bar*/


    .boxCompanyServices{
       padding-bottom: 40px;
    }


    .describe{

      margin-top: 10px;
    }

    .nmm
    {
      font-family: 'Open Sans bold', sans-serif;
      width: 100%;
      margin:auto;
    }

    .float-left{
      font-size: 25px;
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }

    .add-button{
      width: 2.3em;  height: 2.5em;
      text-align: middle;
      background-size: cover;
      background-image: url(../assets/pen.png)

    }

    .delete-button{
      width: 2.3em;  height: 2.5em;
      background-size: cover;
      background-image: url(../assets/tr.png)
    }



    .bar-buton
    {
      margin: auto;;
      width: 100%;
    }

    .buton {

      font-size: 25px;
      border-radius: 100%;
      background: #d145e9;
      color: #fff;
      margin-left: 66%;
      margin-top: 20px;
      margin-bottom: 20px;

    }
    .buton:hover {
      background: #bf6cce;
    }



    #about
    {
      padding-left: 300px;
    }

    .parent
    {
      width: 100%;
      height: 40px;
      padding-top: 10px;
      margin: auto; 
      border-radius: 2px;
      color:rgb(209, 69, 233);


    }

    .list
    {
      float: left; 


    }

    .price table

    .nameoftheservice {
      margin: auto;
      width: 500px;
      background-color: white;
      color:#d145e9;
    }

    .price {
      width:100%;
      color: #565656;
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

    .describeservices {
      width: 40%;
      background-color: white;
      margin: auto;
      border-radius: 2px;
      text-align: left;
      color: #929292;
      border: 0px;
      border-color: gray;
      box-shadow:  0 0 1em rgba(209, 69, 233, 0.37);
      padding-left: 20px;
      padding-right: 20px;
      padding-bottom: 20px;
    }

    /*------------col*/

    #colLeft {
      display: inline;
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
      margin-right: 20px;
    } 

    p
    {
      font-size: 12px;

    }

    @media (max-width: 1000px) {
      .form-group {
        float: none;
        margin-right: 0;
      }
    }

  </style>
