package com.how2java.springboot.responese;

import com.how2java.springboot.responese.code.Code;
import com.how2java.springboot.responese.code.Codes;
import lombok.Data;

@Data
public class BaseResp {

  private String retn = "0000";
  private String desc = "success";

  public BaseResp() {
  }

  public BaseResp(String retn, String desc) {
    this.retn = retn;
    this.desc = desc;
  }

  public BaseResp(Code code){
    this.retn = code.getRetn();
    this.desc = code.getDesc();
  }
}
