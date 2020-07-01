import Vue from 'vue/dist/vue.esm.js';
import axios from 'axios';
import $ from 'jquery';
import 'src/main/webapp/static/css/mian.less'
import VueRouter from 'vue-router';
$(function () {
    var vm = new Vue({
        el:'#app',
        data:{
            spots:null,
            num:1,
            msg: '112233',
        },
        methods:{
            reserve:function (i) {
                let url = "detail.html?id=" + i;
                window.location.href=url;
            }
        },
        created(){
            axios
              .get('sopts/selectAll')
              .then((response)=> {
                  this.spots = response.data;
              })
              .catch(function (error) { // 请求失败处理
                console.log(error);
              });
        }
    });
});



