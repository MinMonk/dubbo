package com.monk.dubbo.service;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {

    void getColor();
}
