/**
 * 文件名：TestMain.java
 * 版权： Copyright 2017-2022 CMCC All Rights Reserved.
 * 描述： ESB管理系统
 */
package com.monk.dubbo;

import com.monk.dubbo.service.CarInterface;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * 描述：测试类 <br/>
 *
 * @author Monk
 * @version V1.0
 * @date 2021年04月20日 15:15
 **/
public class TestMain {

    public static void main(String[] args) {
        ExtensionLoader<CarInterface> interfaceName = ExtensionLoader.getExtensionLoader(CarInterface.class);
        CarInterface car = interfaceName.getExtension("red");
        car.getColor();
    }
}
