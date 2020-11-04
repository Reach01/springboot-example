package com.how2java.springboot.responese.categoryresp;

import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.responese.BaseResp;
import java.util.List;
import lombok.Data;

@Data
public class ListCatagoryResp extends BaseResp {

  List<Category> categoryList;
  String name;
}
