package com.jos.dem.springboot.aop.exception

class DemoException extends RuntimeException {

  DemoException(String message){
    super(message)
  }

  DemoException(String message, Throwable cause){
    super(message, cause)
  }

}
