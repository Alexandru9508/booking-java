import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Home from '@/components/Home'
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
