import Vue from 'vue/dist/vue.esm.js';
import axios from 'axios';
import $ from 'jquery';
$(function () {
    var id = UrlParm.parm("id");
    var vm = new Vue({
        el:'#app',
        data:{
            spot:null,
            msg:"helloword",
            num:1,
        },
        methods:{
            test:function () {
                console.log(this.spot);
            },
            sub:function () {
                if(this.num <= 1){
                    this.num = 1;
                }else{
                    this.num--;
                }
            },
            add:function () {
                if(this.num >= 10){
                    this.num = 10;
                    this.isadd = false;
                }else{
                    this.num++;
                    this.isadd = true;
                }
            },
            reserve:function () {
                let ordernum = random_No(3);
                let data = {ordernum:ordernum,num:this.num,soptname:this.spot.spotname,userid:1};
                axios.post('order/insertOne', data)
              .then(function (response) {
                console.log(response);
                alert("预定成功");
              })
              .catch(function (error) {
                console.log(error);
              });
            }
        },
        created(){
            axios
              .get('sopts/selectOne?id=' + id)
              .then((response)=> {
                  this.spot = response.data;
                  console.log( response);
              })
              .catch(function (error) { // 请求失败处理
                console.log(error);
              });
        }
    });
});
 function random_No(j) {
    var random_no = "";
    for (var i = 0; i < j; i++) //j位随机数，用以加在时间戳后面。
    {
        random_no += Math.floor(Math.random() * 10);
    }
    random_no = new Date().getTime() + random_no;
    return random_no;
};
var UrlParm = function() { // url参数
 var data, index;
 (function init() {
  data = [];
  index = {};
  var u = window.location.search.substr(1);
  if (u != '') {
   var parms = decodeURIComponent(u).split('&');
   for (var i = 0, len = parms.length; i < len; i++) {
    if (parms[i] != '') {
     var p = parms[i].split("=");
     if (p.length == 1 || (p.length == 2 && p[1] == '')) {// p | p=
      data.push(['']);
      index[p[0]] = data.length - 1;
     } else if (typeof(p[0]) == 'undefined' || p[0] == '') { // =c | =
      data[0] = [p[1]];
     } else if (typeof(index[p[0]]) == 'undefined') { // c=aaa
      data.push([p[1]]);
      index[p[0]] = data.length - 1;
     } else {// c=aaa
      data[index[p[0]]].push(p[1]);
     }
    }
   }
  }
 })();
 return {
  // 获得参数,类似request.getParameter()
  parm : function(o) { // o: 参数名或者参数次序
   try {
    return (typeof(o) == 'number' ? data[o][0] : data[index[o]][0]);
   } catch (e) {
   }
  },
  //获得参数组, 类似request.getParameterValues()
  parmValues : function(o) { // o: 参数名或者参数次序
   try {
    return (typeof(o) == 'number' ? data[o] : data[index[o]]);
   } catch (e) {}
  },
  //是否含有parmName参数
  hasParm : function(parmName) {
   return typeof(parmName) == 'string' ? typeof(index[parmName]) != 'undefined' : false;
  },
  // 获得参数Map ,类似request.getParameterMap()
  parmMap : function() {
   var map = {};
   try {
    for (var p in index) { map[p] = data[index[p]]; }
   } catch (e) {}
   return map;
  }
 }
}();