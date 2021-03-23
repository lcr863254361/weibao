package com.orient.modeldata.tbomHandle.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by qjs on 2017/2/11.
 * 注解实现TbomIcon接口的实现类，说明实现类返回iconCLs针对的tbom
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface NodePermission {
    //使用实现类的tbom的名称
    String tbomName();
}
