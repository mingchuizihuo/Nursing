/**
 * Created by horo on 2016/10/13.
 */
$(function () {
    findAll(currentPage);
})
function add() {
    var serviceTypePeopleName = $("#serviceTypePeopleName").val();
    var tid = $("#classTid").val();
    var url = domainUrl + "/serve/service_people_type/add";
    var postData = {serviceTypePeopleName: serviceTypePeopleName, tid: tid}
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
        findAll(currentPage);
        $("#myModal").modal("hide")
    })
}
function openModal(tid) {
    $('#myModal').modal("show");
    $("#classTid").val(tid)
}
function findAll(currentPage) {
    var url = domainUrl + "/serve/service_people_type/findTreeAll";
    var currentPage = 1;
    var limit = 10;
    var getData = {currentPage: currentPage, limit: 99999};
    var html = '';
    getAjax(url, false, getData, function (data) {
        // if (data.aaData[1] != undefined) {
        //     var num2 = data.aaData[1].length;
        // } else {
        //     var num2 = 0;
        // }
        // if (data.aaData[2] != undefined) {
        //     var num3 = data.aaData[2].length;
        // } else {
        //     var num3 = 0;
        // }
        var num1 = data.aaData[0].length;
        for (var i = 0; i < num1; i++) {
            html += '<li style="border-top:1px solid #dddddd"><a href="#" class="one">' + data.aaData[0][i].serviceTypePeopleName + '</a><cc>' +
                '<a onclick="make(' + data.aaData[0][i].id + ')">修改本类</a><a onclick="del(' + data.aaData[0][i].id + ')">删除本类</a></cc>';
            // if (num2 >= 1) {
            //     html += '<ul style="display: none;">';
            //     for (var j = 0; j < num2; j++) {
            //         if (data.aaData[0][i].id == data.aaData[1][j].tid) {
            //             html += '<li><a href="#" class="one">' + data.aaData[1][j].serviceTypePeopleName + '</a><cc>' +
            //                 '<a onclick="make(' + data.aaData[1][j].id + ')">修改本类</a><a onclick="del(' + data.aaData[1][j].id + ')">删除本类</a></cc>';
            //             html += '</li>';
            //         }
            //     }
            //     html += '</ul>'
            // }
            html += '</li>'
        }
        $("#ify-show").html(html)
        // $(".one").click(function () {
        //     if ($(this).siblings("ul").css("display") == "none") {
        //         $(this).siblings("ul").slideDown(200).children("li");
        //         $(this).children("i").addClass("glyphicon-minus").removeClass("glyphicon-plus")
        //     } else {
        //         //控制本级图标变化
        //         $(this).children("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
        //         //控制子级图标变化
        //         $(this).siblings("ul").find("i").removeClass("glyphicon-minus").addClass("glyphicon-plus");
        //         //控制自身菜单下子菜单隐藏
        //         $(this).siblings('ul').slideUp(100);
        //         //控制自身菜单下子菜单隐藏
        //         $(this).siblings('ul').children('li').children('ul').slideUp(100);
        //     }
        // })
    })
}
function make(id) {
    $('#myModal').modal("show");
    $("#add-btn").hide();
    $("#update-btn").show();
    $("#classTid").val(id);
}
function update() {
    var url = domainUrl + "/serve/service_people_type/update";
    var id = $("#classTid").val();
    var serviceTypePeopleName = $("#serviceTypePeopleName").val();
    var postData = {id: id, serviceTypePeopleName: serviceTypePeopleName}
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
        findAll(currentPage);
        $('#myModal').modal("hide");
    })
}
function del(id) {
    var url = domainUrl + "/serve/service_people_type/del";
    var postData = {id: id};
    postAjax(url, false, postData, function (data) {
        alert("删除成功")
        findAll(currentPage);
    })
}