const path=require('path');
module.exports={
      // 指定模式
    mode:"development",
    // 配置项目入口
    entry:{
        blunder:"./src/main/webapp/static/js/main.js",
        detail:"./src/main/webapp/static/js/detail.js",
        order:"./src/main/webapp/static/js/order.js"
    },
    //配置项目出口
    output:{
        //利用node 的path模块动态获取根目录下的dist目录
        path:path.resolve(__dirname,"./src/main/webapp/static/js/dist"),
        // 转换输出文件名
        filename:"[name].js"
    },
    module:{    //配置所有第三方模块的加载器
        rules: [    //所有第三方模块的匹配规则
            {test: /\.css$/||/.\less$/,use:['style-loader','css-loader']},//配置css加载的loader
            { test: /\.(eot|svg|ttf|woff|woff2)(\?\S*)?$/,
        loader: 'file-loader'}
        ]
    }
}