package com.how2java.springboot.responese.code;


public class Codes {

  public static Code SUCCESS = new Code("0000", "success");
  public static Code API_EXCEPTION = new Code("1111", "接口异常");
  public static Code RING_NOT_COMMERCIAL = new Code("1000", "该铃音非商用铃音，不能订购");
}
