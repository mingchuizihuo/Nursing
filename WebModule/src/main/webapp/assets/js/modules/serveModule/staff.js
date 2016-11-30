/**
 * Created by horo on 2016/10/14.
 */
$(function () {
    findAll(currentPage);
})
function clearModal() {
    $("#update-btn").hide();
    $("#add-btn").show();
    $("#staffname").val("");
    $("#staffsex").val("");
    $("#staffpost").val("");
    $("#staffskilllevel").val("");
    $("#staffdepartment").val("");
    $("#staffcard").val("");
    $("#staffcall1").val("");
    $("#staffcall2").val("");
    $("#staffrank").val("");
    $("#staffstatus").val("");
}
function add() {

    var staffname = $("#staffname").val();
    var staffsex = $("#staffsex").val();
    var staffpost = $("#staffpost").val();
    var staffskill = $("#staffskilllevel").val();
    var staffdepartment = $("#staffdepartment").val();
    var staffcard = $("#staffcard").val();
    var staffcall1 = $("#staffcall1").val();
    var staffcall2 = $("#staffcall2").val();
    var staffrank = $("#staffrank").val();
    var staffstatus = $("#staffstatus").val();
    var url = domainUrl + "/serve/service_staff/add";
    staffsex = 1;
    staffpost = 1;
    staffstatus = 1;
    staffrank = 1;
    staffdepartment = 1;
    var postData = {
        staffName: staffname,
        staffSex: staffsex,
        staffPost: staffpost,
        staffSkillLevel: staffskill,
        staffCardId: staffcard,
        staffCall1: staffcall1,
        staffCall2: staffcall2,
        staffRank: staffrank,
        staffStatus: staffstatus,
        staffDepartment: staffdepartment
    };
    postAjax(url, false, postData, function (data) {
        alert("添加成功");
        findAll(currentPage)
        $('#myModal').modal("hide");
    })
}
function del(id) {
    var url = domainUrl + "/serve/service_staff/del"
    var postData = {id: id}
    postAjax(url, false, postData, function (data) {
        alert("删除成功");
        findAll(currentPage)
    })
}
var pageNp = 1;
var pageList;
function findAll(currentPage) {
    var url = domainUrl + "/serve/service_staff/findAll";
    var getData = {
        currentPage: currentPage,
        limit: limit
    };
    var html = "<table id='aaa'> <tbody> <tr> <th>姓名</th> <th>性别</th> <th>职务</th> <th>部门</th> <th>联系方式</th>" +
        " <th>身份证号</th> <th>人员状态</th> <th>管理权限</th> <th>技能等级</th><th>操作</th> </tr></tbody>";
    var tile='';
    var picture = '';
    getAjax(url, false, getData, function (data) {
        pageList = Math.ceil(data.iTotalRecords / limit);
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            //部门过滤
            if(data.aaData[i].staffDepartment == 1){
                data.aaData[i].staffDepartment = "护理部"
            }else{
                data.aaData[i].staffDepartment = "后勤部"
            }
            //职位过滤
            if(data.aaData[i].staffPost == 1){
                data.aaData[i].staffPost = "护理职员"
            }else if(data.aaData[i].staffPost==2){

                data.aaData[i].staffPost = "护理主管";
            }else if(data.aaData[i].staffPost==3){
                data.aaData[i].staffPost = "后勤职员"
            }else if(data.aaData[i].staffPost == 4){
                data.aaData[i].staffPost = "后勤主管"
            }
            //状态过滤
            if(data.aaData[i].staffStatus==1){
                data.aaData[i].staffStatus = "空闲";
            }else if (data.aaData[i].staffStatus == 2){
                data.aaData[i].staffStatus = "繁忙";
            }
            //级别过滤
            if(data.aaData[i].staffRank==1){
                data.aaData[i].staffRank = "职员";
            }else if(data.aaData[i].staffRank == 2){
                data.aaData[i].staffRank = "主管";
            }

            html += '<tr><td>' + data.aaData[i].staffName + '</td><td>' + data.aaData[i].staffSex + '</td><td>' + data.aaData[i].staffPost + '</td>' +
                '<td>' + data.aaData[i].staffDepartment + '</td><td>' + data.aaData[i].staffCall1 + '</td><td>' + data.aaData[i].staffCardId + '</td>' +
                '<td>' + data.aaData[i].staffStatus + '</td><td>' + data.aaData[i].staffRank + '</td><td>' + data.aaData[i].staffSkillLevel + '</td>' +
                '<td><i class="glyphicon glyphicon-pencil bianji" title="编辑"  data-toggle="modal" data-target="#myModal" onclick="make(' + data.aaData[i].id + ',' + currentPage + ')"></i>' +
                ' <i class="glyphicon glyphicon-remove shanchu" title="删除" onclick="del(' + data.aaData[i].id + ')"></i></td></tr>';

            if (data.aaData[i].staffPicture.pictureAddress == null) {
                picture = '<img  src=' + domainFile + '/assets/images/serve/stafff.png onclick="uploadShow(' + data.aaData[i].id + ')"/>';
            } else {
                picture = '<img src="' + domainFile + '/assets/uploadimg/' + data.aaData[i].staffPicture.pictureAddress + '"  onclick="uploadShow(' + data.aaData[i].id + ')" />';
            }
            tile += '<div class="main-modules"> <i class="glyphicon glyphicon-pencil bianji" title="编辑" style="margin-right:30px;"  data-toggle="modal" data-target="#myModal" onclick="make(' + data.aaData[i].id + ',' + currentPage + ')"></i> <i' +
                ' class="glyphicon glyphicon-remove shanchu" onclick="del(' + data.aaData[i].id + ')"></i> <ul><li id="staff-mess1">' + picture + '</li> <li'+
                ' id="staff-mess2"> <ul><li>' + data.aaData[i].staffName + '</li>';
            tile += ' <li>职务</li> <li>部门</li> <li>联系方式</li> <li>身份证号</li> </ul> <ul> <li>男</li> <li>' + data.aaData[i].staffPost + '</li> ';
            tile += '<li>' + data.aaData[i].staffDepartment + '</li> <li>' + data.aaData[i].staffCall1 + '</li> <li>' + data.aaData[i].staffCardId + '</li> </ul> </li>';
            tile += '<li id="staff-mess3"> <ul> <li>人员状态</li> <li>管理权限</li> <li>技能等级</li> </ul> <ul> <li>' + data.aaData[i].staffStatus + '</li> <li>' + data.aaData[i].staffRank + '</li>';
            tile += ' <li>' + data.aaData[i].staffSkillLevel + '</li> </ul> </li> </ul> </div>';
        }
        html+='</table>';
        if(findAllNum ==1){
            $(".main-module").html(html);
        }else{
            $(".main-module").html(tile);
        }
        if (pageNp == 1) {
            pageNp = 2;
            $(".tcdPageCode").createPage({
                pageCount: pageList,
                current: currentPage,
                backFn: function (p) {
                    findAll(p)
                }
            });
        }
        tableTileShow(tile,html);
    })
}
function make(id, currentPage) {
    $("#update-btn").show();
    $("#add-btn").hide();
    var url = domainUrl + "/serve/service_staff/findAll";
    var limit = 3;
    var getData = {currentPage: currentPage, limit: limit};
    var name, sex, post, level, pic, ment, card, call1, call2, rank, status, xid;
    getAjax(url, false, getData, function (data) {
        var num = data.aaData.length;
        for (var i = 0; i < num; i++) {
            if (id == data.aaData[i].id) {
                name = data.aaData[i].staffName;
                sex = data.aaData[i].staffSex;
                post = data.aaData[i].staffPost;
                level = data.aaData[i].staffSkillLevel;
                pic = data.aaData[i].staffPicture;
                ment = data.aaData[i].staffDepartment;
                card = data.aaData[i].staffCardId;
                call1 = data.aaData[i].staffCall1;
                call2 = data.aaData[i].staffCall2;
                rank = data.aaData[i].staffRank;
                status = data.aaData[i].staffStatus;
                xid = data.aaData[i].id;
                $("#staffname").val(name);
                $("#staffsex").val(sex);
                $("#staffpost").val(post);
                $("#staffskilllevel").val(level);
                $("#staffpicture").val(pic);
                $("#staffdepartment").val(ment);
                $("#staffcard").val(card);
                $("#staffcall1").val(call1);
                $("#staffcall2").val(call2);
                $("#staffrank").val(rank);
                $("#staffstatus").val(status);
                $("#xid").val(xid);
            }
        }

    })
}
function update() {
    var staffname = $("#staffname").val();
    var staffsex = $("#staffsex").val();
    var staffpost = $("#staffpost").val();
    var staffskill = $("#staffskilllevel").val();
    var staffpicture = $("#staffpicture").val();
    var staffdepartment = $("#staffdepartment").val();
    var staffcard = $("#staffcard").val();
    var staffcall1 = $("#staffcall1").val();
    var staffcall2 = $("#staffcall2").val();
    var staffrank = $("#staffrank").val();
    var staffstatus = $("#staffstatus").val();
    var id = $("#xid").val();
    var url = domainUrl + "/serve/service_staff/update";
    var postData = {
        id: id,
        staffName: staffname,
        staffSex: staffsex,
        staffPost: staffpost,
        staffSkillLevel: staffskill,
        staffPicture: staffpicture,
        staffCardId: staffcard,
        staffCall1: staffcall1,
        staffCall2: staffcall2,
        staffRank: staffrank,
        staffStatus: staffstatus,
        staffDepartment: staffdepartment
    };
    postAjax(url, false, postData, function (data) {
        alert("修改成功");
        findAll(currentPage)
        $('#myModal').modal("hide");
    })
}
function upload(id) {
    console.log(pathList + "..." + id)
    $("#box").hide();
    $("#aaaa").hide();
    var url = domainUrl + '/serve/service_staff/update';
    var postData = {
        id: id,
        pictureAddress: pathList,
    };
    postAjax(url, false, postData, function (data) {
        alert("上传成功");
        findAll(currentPage);
    })
}