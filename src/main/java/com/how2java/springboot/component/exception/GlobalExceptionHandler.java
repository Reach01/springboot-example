package com.how2java.springboot.component.exception;


import com.how2java.springboot.responese.ApiExceptionResp;
import com.how2java.springboot.responese.code.Codes;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ApiExceptionResp defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ApiExceptionResp apiExceptionResp = new ApiExceptionResp(Codes.API_EXCEPTION);
        apiExceptionResp.setRetn("1001");
        apiExceptionResp.setDesc(e.getMessage());
        return apiExceptionResp;
    }

}

