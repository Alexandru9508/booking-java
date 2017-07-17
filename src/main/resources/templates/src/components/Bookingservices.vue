  <template>
    <div class="nmm">
      <nav>
        <ul class="nav-bar">
          <li <a class="float-left"</a>
            <li><a href="UploadLogo.vue">PROFILE</a></li>
            <li><a href="calendar.vue">CALENDAR</a></li>
            <li><a href="Booking.vue">BOOKING</a></li>
            <li><a href="Bookingservices.vue">DASHBOARD</a></li>
          </ul>
        </nav>  
        
          <div class="bar-buton">
            <button class="btn buton" href="#">+</button>
          </div>
          
          <div class="nameoftheservice">
            <div class="list>">
              <div class="describeservices">
                <div class="parent">
                  <h6 id="colLeft">Name of the service</h6>
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
                <p> Disrupt jean shorts viral hella meh, plaid cupidatat magna art party. Echo Park adipisicing literally narwhal. Williamsburg leggings church-key, craft beer forage cornhole jean shorts blue bottle pariatur. Officia sapiente bespoke, locavore plaid cray voluptate deep v ex vinyl tote bag chillwave swag occaecat. Sed banh mi 3 wolf moon single-origin coffee quis tempor. Hoodie pitchfork pork belly aliqua, shabby chic elit consequat freegan ethical try-hard mixtape. Schlitz banjo deep v ullamco blog, umami nulla sint elit skateboard Godard odio.</p>
                </div>
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
              </div>
            </div>
          </div>
        
      </div>
    </template>
  </script>
  <style>


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
      width: 2.1em;  height: 2.3em;
      text-align: middle;
      background-size: 100%  non-reapeat ;
      background-image: url(../assets/pen.png)
    }

    .delete-button{
      width: 2.1em;  height: 2.3em;
      background-size: 100% non-reapeat ;
      background-image: url(../assets/tr.png)
    }

    .nav-bar {
      font-size: 12px ;
      list-style-type: none;
      margin: 0;
      padding-right: 13px;
      padding-top: 20px;
      overflow: hidden;
      background-color: #8875e4;
    }

    .nav-bar li {
      float: right;
    }

    .nav-bar li a {
      padding-top: 20px;
      display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }


    .nav-bar a:hover {
      font-weight:bold;
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

    table

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
  <script>
    export default {
      servicename: 'bookingservices',
      data () {
        return {
          msg: 'Welcome to Your Vue.js App'
        }
      }
    }
  </script>