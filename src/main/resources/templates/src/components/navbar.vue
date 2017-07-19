 
<template>
<div>
 <b-navbar toggleable type="inverse" class="menu">
          <b-nav-toggle target="nav_collapse"></b-nav-toggle>
          <b-link class="navbar-brand" to="#">
            <span id="booking-app">Booking App</span>
          </b-link>
          <b-collapse is-nav id="nav_collapse"> 
            <b-nav is-nav-bar class="ml-auto">
              <b-nav is-nav-bar>
                <b-nav-item><router-link to="Bookingservices">DASHBOARD</router-link></b-nav-item>
                <b-nav-item><router-link to="Booking">BOOKING</router-link></b-nav-item>
                <b-nav-item><router-link to="calendar">CALENDAR</router-link></b-nav-item>
                <b-nav-item><router-link to="UploadLogo">PROFILE</router-link></b-nav-item>
              </b-nav>
            </b-nav>
          </b-collapse>
        </b-navbar>
        </div>
        </template>

        <style>

        .menu
{
  background-color: #d145e9;

}

a{
  color:white;
  text-transform: none;
}

a:focus{
  text-decoration: none;
  color:white;
  font-size: 18px;
}


a:hover { 
    color: white;
    text-decoration: none;
    font-size: 18px;
}
          




        </style>