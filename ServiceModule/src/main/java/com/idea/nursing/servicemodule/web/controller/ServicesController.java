package com.idea.nursing.servicemodule.web.controller;

import com.idea.nursing.common.web.service.CommentPictureService;
import com.idea.nursing.core.common.ResultData;
import com.idea.nursing.core.common.SessionConstant;
import com.idea.nursing.core.generic.GenericController;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelation;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationRelationService;
import com.idea.nursing.servicemodule.web.service.ServicesPictureService;
import com.idea.nursing.servicemodule.web.service.ServicesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by 10238 on 2016/10/12.
*/
@Controller
@RequestMapping("serve/services")
public class ServicesController extends GenericController {
    @Autowired
    private ServicesService servicesService;

//    @Autowired
//    private CommentPictureService commentPictureService;
//    @Autowired
//    private ServicesPictureService servicesPictureService;

    @Autowired
    private ServiceClassesValuationRelationService serviceClassesValuationRelationService;


    /**
        * 添加服务
        * @param services
        * @return
    */
    @ResponseBody
    @RequestMapping(value="add" ,method = RequestMethod.POST)
    public ResultData add(Services services,  ServiceClassesValuationRelation serviceClassesValuationRelation){
        try {
            services = servicesService.insert(services);
//            //添加图片
//            Long[] pictureIds =  commentPictureService.insertPictures(pictureAddress, SessionConstant.PictureType.SERVICEPICTURE.key);
//            //添加服务图片一对多
//            servicesPictureService.inserts(services.getId(),pictureIds);
            //添加计费方式
            serviceClassesValuationRelation.setServeId(services.getId());
            serviceClassesValuationRelationService.insert(serviceClassesValuationRelation);
            }catch (Exception e){

                return ResultData.build().addErroe();
            }
        return ResultData.build();

    }

    /**
    * 删除服务
    * @param id
    * @return
    */
    @ResponseBody
    @RequestMapping(value="del" ,method = RequestMethod.POST)
    public ResultData del(Long id) {
        try {
                servicesService.delete(id);
            } catch (Exception e) {
                return ResultData.build().delError();
            }
        return ResultData.build();

    }

    /**
    * 修改服务
    * @param services
    * @return
    */
    @ResponseBody
    @RequestMapping(value="update",method = RequestMethod.POST)
    public ResultData update(Services services){
        try {
            servicesService.update(services);

        } catch (Exception e){
            return ResultData.build().upDateError();
        }
        return ResultData.build();
    }

    /**
    * 分页查询所有服务
    * @param currentPage
    * @param limit
    * @return
    */
    @ResponseBody
    @RequestMapping(value="findAll",method = RequestMethod.GET)
    public ResultData findAll(Integer currentPage,Integer limit){
        return ResultData.build().
        parsePageBean(servicesService.findAllVO(currentPage,limit));
    }
    @ResponseBody
    @RequestMapping(value = "showAllPicture",method = RequestMethod.GET)
    public ResultData showAllPicture(Long serverId){


        return ResultData.build().parseList(servicesService.showAllPicture(serverId));
    }

}