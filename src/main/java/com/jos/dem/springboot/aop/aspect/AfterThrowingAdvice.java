package com.jos.dem.springboot.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;
import com.jos.dem.springboot.aop.exception.DemoException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class AfterThrowingAdvice {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @AfterThrowing(pointcut = "execution(* com.jos.dem.springboot.aop.service..**.*(..))", throwing = "ex")
  public void doRecoveryActions(RuntimeException ex){
    log.info("Wrapping exception: " + exe);
    throw new DemoException(ex.message, ex);
  }

}
