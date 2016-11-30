<script src="${domainUrl}/assets/js/modules/foodModule/foodClassify.js"></script>
<div id="now-position">
    您当前所在的位置：<span>菜品类别</span>
</div>
<div class="serve-banner">
    <an><input type="button" id="cao" value="添加类别" data-toggle="modal" data-target="#myModal">
    </an>
</div>
<div class="main-module">
    <div class="classify-body">
        <div class="ify-title">
            <div class="ify-left">分类名称</div>
            <div class="ify-right">操作</div>
        </div>
        <div>
            <ul id="ify-show">

            </ul>
        </div>
    </div>
</div>
<#--模态框-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title  text-center" id="myModalLabel">
                    添加类别
                </h3>
            </div>
            <div class="modal-body">
                <table class="add">
                    <tr>
                        <td>类别名称</td>
                        <td><input type="text" id="dishesTypeName"><input type="text" id="classTid" style="display: none;"></td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="add-btn" onclick="add()">添加</button>
                <button type="button" class="btn btn-primary" id="update-btn" onclick="update()"
                        style="display: none;">修改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
