import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Home from '@/components/Home'
import AddService from '@/components/AddService'
import UploadLogo from '@/components/UploadLogo'
import BookingPersonDetails from '@/components/BookingPersonDetails'
import Register from '@/components/Register'
import Login from '@/components/Login'
import Recover from '@/components/Recover'


Vue.use(Router)

export default new Router({

	routes: [
	{
		path: '/',
		name: 'Home',
		component: Home
	},
	{
		path: '/addService',
		name: 'AddService',
		component: AddService
	},
	{
		path: '/uploadLogo',
		name: 'UploadLogo',
		component: UploadLogo
	},
	{
		path: '/bookingPersonDetails',
		name: 'BookingPersonDetails',
		component: BookingPersonDetails
	},{
      path: '/',
      name: 'Home',
      component: Home
  },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
     {
      path: '/recover',
      name: 'Recover',
      component: Recover
    }
	]
  
})
