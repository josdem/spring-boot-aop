package com.jos.dem.springboot.aop.service.impl

import org.springframework.stereotype.Service

import com.jos.dem.springboot.aop.service.DemoService
import com.jos.dem.springboot.aop.exception.DemoException

@Service
class DemoServiceImpl implements DemoService {

  void show(){
    throw new DemoException('Throwing Demo Exception')
  }

}
