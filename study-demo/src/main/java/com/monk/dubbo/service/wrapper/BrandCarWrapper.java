package com.monk.dubbo.service.wrapper;

import com.monk.dubbo.service.CarInterface;

/**
 * @ClassName BrandCarWrapper
 * @Description: TODO
 * @Author Monk
 * @Date 2021/4/21
 * @Version V1.0
 **/
public class BrandCarWrapper implements CarInterface {

    private CarInterface carInterface;

    public BrandCarWrapper(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor() {
        System.out.println("brand car wrapper before....");
        carInterface.getColor();
        System.out.println("brand car wrapper after....");
    }
}
