package com.jos.dem.springboot.aop.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class DemoController{

  @RequestMapping('/')
  String index(){
    'Hello World!'
  }

}
