
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 商品
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chongwuyongpin")
public class ChongwuyongpinController {
    private static final Logger logger = LoggerFactory.getLogger(ChongwuyongpinController.class);

    @Autowired
    private ChongwuyongpinService chongwuyongpinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        params.put("chongwuyongpinDeleteStart",1);params.put("chongwuyongpinDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = chongwuyongpinService.queryPage(params);

        //字典表数据转换
        List<ChongwuyongpinView> list =(List<ChongwuyongpinView>)page.getList();
        for(ChongwuyongpinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuyongpinEntity chongwuyongpin = chongwuyongpinService.selectById(id);
        if(chongwuyongpin !=null){
            //entity转view
            ChongwuyongpinView view = new ChongwuyongpinView();
            BeanUtils.copyProperties( chongwuyongpin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuyongpinEntity chongwuyongpin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chongwuyongpin:{}",this.getClass().getName(),chongwuyongpin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChongwuyongpinEntity> queryWrapper = new EntityWrapper<ChongwuyongpinEntity>()
            .eq("chongwuyongpin_name", chongwuyongpin.getChongwuyongpinName())
            .eq("chongwuyongpin_types", chongwuyongpin.getChongwuyongpinTypes())
            .eq("chongwuyongpin_price", chongwuyongpin.getChongwuyongpinPrice())
            .eq("chongwuyongpin_kucun_number", chongwuyongpin.getChongwuyongpinKucunNumber())
            .eq("chongwuyongpin_clicknum", chongwuyongpin.getChongwuyongpinClicknum())
            .eq("shangxia_types", chongwuyongpin.getShangxiaTypes())
            .eq("chongwuyongpin_delete", chongwuyongpin.getChongwuyongpinDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuyongpinEntity chongwuyongpinEntity = chongwuyongpinService.selectOne(queryWrapper);
        if(chongwuyongpinEntity==null){
            chongwuyongpin.setChongwuyongpinClicknum(1);
            chongwuyongpin.setShangxiaTypes(1);
            chongwuyongpin.setChongwuyongpinDelete(1);
            chongwuyongpin.setCreateTime(new Date());
            chongwuyongpinService.insert(chongwuyongpin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwuyongpinEntity chongwuyongpin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chongwuyongpin:{}",this.getClass().getName(),chongwuyongpin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ChongwuyongpinEntity> queryWrapper = new EntityWrapper<ChongwuyongpinEntity>()
            .notIn("id",chongwuyongpin.getId())
            .andNew()
            .eq("chongwuyongpin_name", chongwuyongpin.getChongwuyongpinName())
            .eq("chongwuyongpin_types", chongwuyongpin.getChongwuyongpinTypes())
            .eq("chongwuyongpin_price", chongwuyongpin.getChongwuyongpinPrice())
            .eq("chongwuyongpin_kucun_number", chongwuyongpin.getChongwuyongpinKucunNumber())
            .eq("chongwuyongpin_clicknum", chongwuyongpin.getChongwuyongpinClicknum())
            .eq("shangxia_types", chongwuyongpin.getShangxiaTypes())
            .eq("chongwuyongpin_delete", chongwuyongpin.getChongwuyongpinDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuyongpinEntity chongwuyongpinEntity = chongwuyongpinService.selectOne(queryWrapper);
        if("".equals(chongwuyongpin.getChongwuyongpinPhoto()) || "null".equals(chongwuyongpin.getChongwuyongpinPhoto())){
                chongwuyongpin.setChongwuyongpinPhoto(null);
        }
        if(chongwuyongpinEntity==null){
            chongwuyongpinService.updateById(chongwuyongpin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<ChongwuyongpinEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ChongwuyongpinEntity chongwuyongpinEntity = new ChongwuyongpinEntity();
            chongwuyongpinEntity.setId(id);
            chongwuyongpinEntity.setChongwuyongpinDelete(2);
            list.add(chongwuyongpinEntity);
        }
        if(list != null && list.size() >0){
            chongwuyongpinService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<ChongwuyongpinEntity> chongwuyongpinList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ChongwuyongpinEntity chongwuyongpinEntity = new ChongwuyongpinEntity();
//                            chongwuyongpinEntity.setChongwuyongpinName(data.get(0));                    //商品名称 要改的
//                            chongwuyongpinEntity.setChongwuyongpinPhoto("");//照片
//                            chongwuyongpinEntity.setChongwuyongpinTypes(Integer.valueOf(data.get(0)));   //商品类型 要改的
//                            chongwuyongpinEntity.setChongwuyongpinPrice(Integer.valueOf(data.get(0)));   //购买获得积分 要改的
//                            chongwuyongpinEntity.setChongwuyongpinKucunNumber(Integer.valueOf(data.get(0)));   //商品库存 要改的
//                            chongwuyongpinEntity.setChongwuyongpinOldMoney(data.get(0));                    //商品原价 要改的
//                            chongwuyongpinEntity.setChongwuyongpinNewMoney(data.get(0));                    //现价 要改的
//                            chongwuyongpinEntity.setChongwuyongpinClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            chongwuyongpinEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            chongwuyongpinEntity.setChongwuyongpinDelete(1);//逻辑删除字段
//                            chongwuyongpinEntity.setChongwuyongpinContent("");//照片
//                            chongwuyongpinEntity.setCreateTime(date);//时间
                            chongwuyongpinList.add(chongwuyongpinEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        chongwuyongpinService.insertBatch(chongwuyongpinList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = chongwuyongpinService.queryPage(params);

        //字典表数据转换
        List<ChongwuyongpinView> list =(List<ChongwuyongpinView>)page.getList();
        for(ChongwuyongpinView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuyongpinEntity chongwuyongpin = chongwuyongpinService.selectById(id);
            if(chongwuyongpin !=null){

                //点击数量加1
                chongwuyongpin.setChongwuyongpinClicknum(chongwuyongpin.getChongwuyongpinClicknum()+1);
                chongwuyongpinService.updateById(chongwuyongpin);

                //entity转view
                ChongwuyongpinView view = new ChongwuyongpinView();
                BeanUtils.copyProperties( chongwuyongpin , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuyongpinEntity chongwuyongpin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chongwuyongpin:{}",this.getClass().getName(),chongwuyongpin.toString());
        Wrapper<ChongwuyongpinEntity> queryWrapper = new EntityWrapper<ChongwuyongpinEntity>()
            .eq("chongwuyongpin_name", chongwuyongpin.getChongwuyongpinName())
            .eq("chongwuyongpin_types", chongwuyongpin.getChongwuyongpinTypes())
            .eq("chongwuyongpin_price", chongwuyongpin.getChongwuyongpinPrice())
            .eq("chongwuyongpin_kucun_number", chongwuyongpin.getChongwuyongpinKucunNumber())
            .eq("chongwuyongpin_clicknum", chongwuyongpin.getChongwuyongpinClicknum())
            .eq("shangxia_types", chongwuyongpin.getShangxiaTypes())
            .eq("chongwuyongpin_delete", chongwuyongpin.getChongwuyongpinDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuyongpinEntity chongwuyongpinEntity = chongwuyongpinService.selectOne(queryWrapper);
        if(chongwuyongpinEntity==null){
            chongwuyongpin.setChongwuyongpinDelete(1);
            chongwuyongpin.setCreateTime(new Date());
        chongwuyongpinService.insert(chongwuyongpin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
