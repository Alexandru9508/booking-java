<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  servicename: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;

}

.hidden {
	display: none;
}
</style>
