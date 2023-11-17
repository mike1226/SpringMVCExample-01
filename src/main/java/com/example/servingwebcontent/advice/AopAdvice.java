package com.example.servingwebcontent.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdvice {

    /* 定义一个切入点, 为controller包下的所有类 */
    @Pointcut("execution(* com.example.servingwebcontent.controller.*.*(..))")
    public void writeLog() {
        
    }

    /* 在切入点之前执行 */
    @Around("writeLog()")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;
        System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");

        return proceed;
    }

    
}
