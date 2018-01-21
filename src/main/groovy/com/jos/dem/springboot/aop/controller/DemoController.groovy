package com.jos.dem.springboot.aop.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.springboot.aop.service.DemoService

@RestController
class DemoController{

  @Autowired
  DemoService demoService

  @RequestMapping('/')
  String index(){
    'Hello World!'
    demoService.show()
  }

}
