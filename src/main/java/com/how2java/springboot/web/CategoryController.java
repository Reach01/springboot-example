package com.how2java.springboot.web;
import com.how2java.springboot.responese.categoryresp.ListCatagoryResp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.how2java.springboot.dao.CategoryDAO;
import com.how2java.springboot.pojo.Category;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CategoryController {

	@Autowired CategoryDAO categoryDAO;
	
  @RequestMapping("/listCategory")
  public ListCatagoryResp listCategory() throws Exception {
    ListCatagoryResp listCatagoryResp = new ListCatagoryResp();
    List<Category> cs = categoryDAO.findAll();
    listCatagoryResp.setCategoryList(cs);
    throw new NullPointerException("手动抛出的异常");
    //return listCatagoryResp;
  }

}
