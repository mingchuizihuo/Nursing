/**
 * Created by Administrator on 2016/11/14.
 */
$(function () {
    findAll(currentPage);
})
var serveNamePull='';
function findAll(currentPage) {
    var url = domainUrl + '/serve/service_pack/findAll';
    var getData = {
        currentPage: currentPage, limit: 1000
    }
    var html='';
    var img;
    getAjax(url,false,getData,function (data) {
        var num = data.aaData.length;
        for(var i = 0; i< num ; i++){
            if(data.aaData[i].serveDetailed.richTextHeadPicture == null){
                img = '' + domainFile + '/assets/images/serve/service.png';
            }else{
                img = domainFile + '/assets/uploadimg/' + data.aaData[i].serveDetailed.richTextHeadPicture;
            }
            html+='<div class="one" value="'+data.aaData[i].id+'" ><div class="tu"><img src="'+img+'" alt=""></div> <h4>'+data.aaData[i].serveName.substring(0,7)+'</h4> </div>';
        }
        html+=' <div class="clear"></div>';
        $(".modal-body").html(html);
        $(".one").click(function () {
            if ($(this).hasClass("theme")) {
                $(this).removeClass("theme")
                serveNamePull = serveNamePull.replace('' + $(this).attr("value") + ',', '');
            } else {
                serveNamePull += '' + $(this).attr("value") + ',';
                $(this).addClass("theme")
            }
        })
    })
}
function add() {
    var url = domainUrl+ '/serve/service_pack_state/adds';
    console.log(url)
    var date = formatDate(new Date());
    var postData = {
        servicePackIds:serveNamePull,
        servicePackState:1,
        servicePackOnLineDate:'2016-05-09',
        serviceCount:1,
    }
    console.log(postData)
    postAjax(url,false,postData,function (data) {
        alert("上传成功")
        $("#myModal").modal("hide")
    })
}

