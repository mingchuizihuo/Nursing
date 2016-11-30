/**
 * Created by horo on 2016/11/4.
 */
/*营养物质表*/
/**
 * Created by horo on 2016/11/4.
 */
//添加
$(function () {
    findAll(currentPage);
})
function add() {
    var url = domainUrl+"/serve/nutriment/add";
    var nutrimentName = $("#nutrimentName").val();
    var tid = $("#classTid").val();
    var postData = {
        nutrimentName:nutrimentName,
        tid:tid,
    };
    postAjax(url,false,postData,function (data) {
        alert("添加成功");
        findAll(currentPage);
        $("#myModal").modal("hide");
    })
}
//查询
function findAll(currentPage) {
    var url = domainUrl+"/serve/nutriment/findTreeAll";
    var html='';
    var getData = {
        currentPage:currentPage,
        limit:99999,
    };
    getAjax(url,false,getData,function (data) {
        if (data.aaData[1] != undefined) {
            var num2 = data.aaData[1].length;
        } else {
            var num2 = 0;
        }
        // if (data.aaData[2] != undefined) {
        //     var num3 = data.aaData[2].length;
        // }else{
        //     var num3 = 0;
        // }
        var num1 = data.aaData[0].length;
        for (var i = 0; i < num1; i++) {
            html += '<li style="border-top:1px solid #dddddd"><a href="#" class="one"><i class="glyphicon glyphicon-plus"></i>' +
                '' + data.aaData[0][i].nutrimentName + '</a><cc><a' + ' onclick="openModal(' + data.aaData[0][i].id + ')">添加子类</a>' +
                '<a onclick="make(' + data.aaData[0][i].id + ')">修改本类</a><a onclick="del(' + data.aaData[0][i].id + ')">删除本类</a></cc>';
            if (num2 >= 1) {
                html += '<ul style="display: none;">';
                for (var j = 0; j < num2; j++) {
                    if (data.aaData[0][i].id == data.aaData[1][j].tid) {
                        html += '<li><a href="#" class="one">' + data.aaData[1][j].nutrimentName + '</a><cc>' +
                            // '<a onclick="openModal(' + data.aaData[1][j].id + ')">添加子类</a>' +
                            '<a onclick="make(' + data.aaData[1][j].id + ')">修改本类</a><a onclick="del(' + data.aaData[1][j].id + ')">删除本类</a></cc>';
                        // if (num3 >= 1) {
                        //     html += '<ul style="display:none;">';
                        //     for (var c = 0; c < num3; c++) {
                        //         if (data.aaData[1][j].id == data.aaData[2][c].tid) {
                        //             html += '<li><a>' + data.aaData[2][c].nutrimentName + '</a><cc><a onclick="make(' + data.aaData[2][c].id + ')">修改本类</a><a onclick="del(' + data.aaData[2][c].id + ')">删除本类</a></cc></li>';
                        //         }
                        //     }
                        //     html += '</ul>'
                        // }
                        html += '</li>';
                    }
                }
                html += '</ul>'
            }
            html += '</li>'
        }
        $("#ify-show").html(html)
        $(".one").click(function () {
            if ($(this).siblings("ul").css("display") == "none") {
                $(this).siblings("ul").slideDown(200).children("li");
                $(this).children("i").addClass("glyphicon-minus").removeClass("glyphicon-plus")
            } else {
                //控制本级图标变化
                $(this).children("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
                //控制子级图标变化
                $(this).siblings("ul").find("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
                //控制自身菜单下子菜单隐藏
                $(this).siblings('ul').slideUp(100);
                //控制自身菜单下子菜单隐藏
                $(this).siblings('ul').children('li').children('ul').slideUp(100);
            }
        })
    })
}
function openModal(tid) {
    $('#myModal').modal("show");
    $("#classTid").val(tid)
}
function make(id) {
    $('#myModal').modal("show");
    $("#add-btn").hide();
    $("#update-btn").show();
    $("#classTid").val(id);
}
//修改
function update() {
    var url = domainUrl+"/serve/nutriment/update";
    var nutrimentName = $("#nutrimentName").val();
    var id = $("#classTid").val();
    var postData = {
        id:id,
        nutrimentName:nutrimentName,
    };
    postAjax(url,false,postData,function (data) {
        alert("修改成功");
        findAll(currentPage);
        $("#myModal").modal("hide")
    })
}
//删除
function del(id) {
    var url = domainUrl + "/serve/nutriment/del";
    var postData={id:id};
    postAjax(url,false,postData,function (data) {
        alert("删除成功");
        findAll(currentPage);
    })
}