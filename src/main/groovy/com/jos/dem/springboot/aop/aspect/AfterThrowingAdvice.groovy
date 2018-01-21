package com.jos.dem.springboot.aop.aspect

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.AfterThrowing
import org.springframework.stereotype.Component
import com.jos.dem.springboot.aop.exception.DemoException

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Aspect
@Component
class AfterThrowingAdvice {

  Logger log = LoggerFactory.getLogger(this.class)

  @AfterThrowing(pointcut = "execution(* com.jos.dem.springboot.aop.service..**.*(..))", throwing = "ex")
  void doRecoveryActions(RuntimeException ex){
    log.info "Wrapping exception: ${ex}"
    throw new DemoException(ex.message, ex)
  }

}
