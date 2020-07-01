import Vue from 'vue/dist/vue.esm.js';
import axios from 'axios';
import $ from 'jquery';
$(function () {
    var vm = new Vue({
        el:'#app',
        data:{
            orders:null,
            msg: '112233',
        },
        methods:{
           del:function (i) {
               console.log(i);
               axios
              .get('order/del?orderid=' + i)
              .then((response)=> {
                  let i = response.data;
                  if(i >= 1){
                      alert("删除成功");
                      window.location.reload();
                  }
              })
              .catch(function (error) { // 请求失败处理
                console.log(error);
              });
           }
        },
        created(){
            axios
              .get('order/selectAll')
              .then((response)=> {
                  this.orders = response.data;
              })
              .catch(function (error) { // 请求失败处理
                console.log(error);
              });
        }
    });
});
