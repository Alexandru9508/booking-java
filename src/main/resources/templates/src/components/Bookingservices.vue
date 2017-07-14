  <template>
    <div class="nmm">
      <nav>
        <ul class="nav-bar">
          <li <a class="float-left" href="#about">Booking App</a>
            <li><a href="#about">PROFILE</a></li>
            <li><a href="#contact">CALENDAR</a></li>
            <li><a href="#news">BOOKING</a></li>
            <li><a href="#home">DASHBOARD</a></li>
          </ul>
        </nav>  
        <div class="container">
        <div class="bar-buton">
          <button class="btn buton" href="#">New service</button>
          </div>
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
            </div>
          </div>
        </div>
      </div>
      </div>
    </template>
  </script>
  <style>

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





    .nav-bar {
      list-style-type: none;
      margin: 0;
      padding-right: 40px;
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

    background: #d145e9;
    color: #fff;
    margin-left: 64%;
    margin-top: 20px;
    margin-bottom: 20px;
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
    width: 600px;
    background-color: white;
    color:#d145e9;
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
    padding-right: 20px;
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