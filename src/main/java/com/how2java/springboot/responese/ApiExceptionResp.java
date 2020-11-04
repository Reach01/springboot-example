package com.how2java.springboot.responese;

import com.how2java.springboot.responese.code.Code;
import lombok.Data;

@Data
public class ApiExceptionResp extends BaseResp{

  public ApiExceptionResp(Code code) {
    super(code);
  }
}
