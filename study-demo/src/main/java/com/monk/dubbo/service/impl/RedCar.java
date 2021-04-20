/**
 * 文件名：BlackCar.java
 * 版权： Copyright 2017-2022 CMCC All Rights Reserved.
 * 描述： ESB管理系统
 */
package com.monk.dubbo.service.impl;

import com.monk.dubbo.service.CarInterface;

/**
 * 描述：红车 <br/>
 *
 * @author Monk
 * @version V1.0
 * @date 2021年04月20日 15:16
 **/
public class RedCar implements CarInterface {
    
    @Override
    public void getColor() {
        System.out.println("this is red car.");
    }
}
