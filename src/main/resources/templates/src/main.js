// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.

require("expose-loader?$!jquery");
import 'bootstrap/dist/css/bootstrap.min.css';
import 'jquery-ui/ui/widgets/selectable.js';

import Vue from 'vue';
import App from './App';
import router from './router';
import VueResource from 'vue-resource';
import BootstrapVue from 'bootstrap-vue';
import VeeValidate from 'vee-validate';
import VuePassword from 'vue-password'



import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'


Vue.use(BootstrapVue);
Vue.use(VueResource);
Vue.use(VeeValidate);
Vue.component(VuePassword);

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})
