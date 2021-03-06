package com.logistics_management.controller;

import com.github.pagehelper.Page;
import com.logistics_management.common.MessageConstant;
import com.logistics_management.common.PageResult;
import com.logistics_management.common.Result;
import com.logistics_management.common.StatusCode;
import com.logistics_management.domain.Activity;
import com.logistics_management.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 获得管理对应 - activity_list
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * 查询所有活动
     * @return
     */
    @RequestMapping("/find")
    public Result find(){
        List<Activity> all = activityService.findAll();
        return new Result(false,2000,"请求成功",all);
    }

    /**
     * 分页
     * @param searchMap
     * @return
     */
    @RequestMapping("/search")
    public PageResult search(@RequestBody Map searchMap){
        Page<Activity> page = activityService.search(searchMap);
        return new PageResult(true, StatusCode.OK,"查询活动列表成功",page.getResult(),page.getTotal());
    }

    /**
     * 添加活动
     * @return
     */
    @RequestMapping("/addActivity")
    public Result addActivity(@RequestBody Activity activity){
        //Activity activity = new Activity(null,"翻斗花园",30,"红十字互助1","A操场","物业",new Date(),new Date(),new Date(),new Date(),"0");
        Boolean b = activityService.addActivity(activity);
        return new Result(true, StatusCode.OK, MessageConstant.COMMUNITY_ADD_SUCCESS);
    }

    /**
     * 根据id查询活动
     * @return
     */
    @RequestMapping("/findActivityById")
    public Result findActivityById(Integer id){
        Activity activityById = activityService.findActivityById(id);
        return new Result(true, StatusCode.OK, MessageConstant.COMMUNITY_FIND_BY_ID_SUCCESS,activityById);
    }

    /**
     * 更新
     * @param activity
     * @return
     */
    @RequestMapping("/updateActivity")
    public Result update(@RequestBody Activity activity){
        Boolean b = activityService.update(activity);
        return new Result(true, StatusCode.OK, MessageConstant.COMMUNITY_UPDATE_SUCCESS);
    }

    /**
     * 更新状态
     * @param status
     * @param id
     * @return
     */
    @RequestMapping("/updateStatus/{status}/{id}")
    public Result updateStatus(@PathVariable("status") String status,@PathVariable("id") Integer id){
        Boolean b = activityService.updateStatus(status,id);
        return new Result(true,StatusCode.OK,MessageConstant.COMMUNITY_UPDATE_STATUS_SUCCESS);
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody List<Integer> ids){
        Boolean b = activityService.del(ids);
        return new Result(true,StatusCode.OK,MessageConstant.COMMUNITY_DELETE_SUCCESS);
    }
}
