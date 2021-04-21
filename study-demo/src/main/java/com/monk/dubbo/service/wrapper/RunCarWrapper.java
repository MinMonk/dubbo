package com.monk.dubbo.service.wrapper;

import com.monk.dubbo.service.CarInterface;
import org.apache.dubbo.common.context.Lifecycle;

/**
 * @ClassName RunCarWrapper
 * @Description: TODO
 * @Author Monk
 * @Date 2021/4/21
 * @Version V1.0
 **/
public class RunCarWrapper implements CarInterface, Lifecycle {

    private CarInterface carInterface;

    public RunCarWrapper(CarInterface carInterface) {
        System.out.println("constuct....");
        this.carInterface = carInterface;
    }

    @Override
    public void getColor() {
        System.out.println("run car wrapper before....");
        carInterface.getColor();
        System.out.println("run car wrapper after....");
    }

    @Override
    public void initialize() throws IllegalStateException {
        System.out.println("init...");
    }

    @Override
    public void start() throws IllegalStateException {
        System.out.println("start...");
    }

    @Override
    public void destroy() throws IllegalStateException {
        System.out.println("destroy...");
    }
}
