package com.frids.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frids.shopping.repository.ShoppingRepository;

@Controller
@RequestMapping("shopping")
public class ShoppingController {
	
	@Autowired
	ShoppingRepository shoppingRepository;
	
	
}
