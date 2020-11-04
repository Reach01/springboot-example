package com.how2java.springboot.component.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class CostTimeAspect {

  @Pointcut("execution(public * com.how2java.springboot.web.*.*(..))")
  public void costTimePointCut(){};

  @Around("costTimePointCut()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable{
    System.out.println("进入切面方法了....");
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    Object obj = pjp.proceed(pjp.getArgs());
    stopWatch.stop();
    long cost = stopWatch.getTotalTimeMillis();
    MethodSignature signature = (MethodSignature) pjp.getSignature();
    String methodName = signature.getDeclaringTypeName() + "." + signature.getName();
    System.out.println("----------- 执行" + methodName + "方法, 用时: " + cost + "ms -----------");
    return obj;
  }

}
