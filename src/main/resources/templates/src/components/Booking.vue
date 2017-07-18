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
  <div class="content">
   <div class="dropbar-service">

    <b-dropdown text="Service name" class="dropdown">
      <b-dropdown-item-button>I'm a button</b-dropdown-item-button>
      <b-dropdown-item-button>I'm also a button</b-dropdown-item-button>
      <b-dropdown-item-button>I don't look like a button, but I am!</b-dropdown-item-button>
    </b-dropdown>
  </div>

</div>


<div class="table-title">


  <div class="table-content-white-title">
   <div class="content">

    <table class="title-white">
      <tr>
        <th>Name</th>
        <th>Email</th> 
        <th>Phone No </th>
        <th>Avaibility</th>
      </tr>
    </table>
    
  </div>
</div>
</div>

<div class="table-content-pink">
  <div class="content">
    <table class="title">
      <tr>
        <th>Name</th>
        <th>Email</th> 
        <th>Phone No </th>
        <th>Avaibility</th>
      </tr>
    </table>    
  </div>
</div>

<div class="table-content-white">
  <div class="content">
    <table class="title">
      <tr>
        <th>Name</th>
        <th>Email</th> 
        <th>Phone No </th>
        <th>Avaibility</th>
      </tr>
    </table>    
  </div>
</div>

<div class="table-content-blue">
  <div class="content">
    <table class="title">
      <tr>
        <th>Name</th>
        <th>Email</th> 
        <th>Phone No </th>
        <th>Avaibility</th>
      </tr>
    </table>    
  </div>
</div>

<div class="table-content-white">
  <div class="content">
    <table class="title">
      <tr>
        <th>Name</th>
        <th>Email</th> 
        <th>Phone No </th>
        <th>Avaibility</th>
      </tr>
    </table>    
  </div>
</div>

</div>


</template>

<style>



  .title-white {
    width:100%;
    color: #565656;
    border:0;
    font-size: 15px;
    margin-bottom: 
  }

  .title-white th {
    border:none;
  }

  .title-white td {
    border-top: none;
  }

  .table-content-white-title{
    padding-top: 10px;
    font-size: 20px;
    background-color: white;

  }


  .table-content-white{
    padding-top: 10px;
    background-color: white;

  }

  .table-content-pink{
    padding-top: 10px;
    background-color: #f9ebfc;

  }

  .table-content-blue{
    padding-top: 10px;
    background-color: #e8e7f8;;

  }


  .title {
    width:100%;
    color: #565656;
    border:0;
    font-size: 10px;
    margin-bottom: 
  }

  .title th {
    border:none;
  }

  .title td {
    border-top: none;
  }

  /*-------table date*/



  .dropbar-service{
    padding-bottom: 20px;
    padding-top: 20px;
  }


  .content {
    margin: auto;
    width: 50%;
    background-color: transparent;
    color:#d145e9;
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

  @media (max-width: 1000px) {
    .form-group {
      float: none;
      margin-right: 0;
    }
  }


</style>