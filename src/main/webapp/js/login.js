$(function(){
    var data4Vue = {
        uri:'forelogin',
        result: [],
        user:{name:'', password:''}
    };
    //ViewModel
    var vue = new Vue({
        el: '#workingArea',
        data: data4Vue,
        mounted:function(){
            linkDefaultActions();
        },
        methods: {
            login:function(){
                var url =  this.uri;
                if(0==this.user.name.length){
                    $("span.errorMessage").html("请输入用户名");
                    $("div.loginErrorMessageDiv").css("visibility","visible");
                    return;
                }
                if(0==this.user.password.length){
                    $("span.errorMessage").html("请输入密码");
                    $("div.loginErrorMessageDiv").css("visibility","visible");
                    return;
                }

                axios.post(url,this.user).then(function(response) {
                    var result = response.data;
                    if(result.code==0){
                        location.href="home";
                    }
                    else{
                        $("span.errorMessage").html(result.message);
                        $("div.loginErrorMessageDiv").css("visibility","visible");
                    }
                });
            }
        }
    });

    var left = window.innerWidth/2+162;
    $("div.loginSmallDiv").css("left",left);
})
