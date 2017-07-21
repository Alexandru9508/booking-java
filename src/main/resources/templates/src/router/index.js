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
import Bookingservices from '@/components/Bookingservices'
import Companyname from '@/components/Companyname'
import Companylist from '@/components/Companylist'
import NotFound from '@/components/NotFound'


Vue.use(Router)

const router= new Router({
 mode: 'history',
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
    },
    {
      path: '/bookingservices',
      name: 'Bookingservices',
      component: Bookingservices
    },
    {
      path: '/company/:id',
      name: 'Companyname',
      component: Companyname
    },
    {
      path: '/companylist',
      name: 'Companylist',
      component: Companylist
    },
    {
      path: '*',
      name: 'NotFound',
      component: NotFound,
    }
	]
  
})

router.beforeEach((to, from, next) => {

      if (to.path === "/login" && localStorage.getItem('token')) { 
        next('/uploadLogo')
      }

    if (to.path === "/") {
      if (localStorage.getItem('token')) {
        next('/uploadLogo');
      } else {
        next('/login');
      }
    } else {
      next()
    }
});



export default router;