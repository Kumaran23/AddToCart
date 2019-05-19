package com.kumaran.paff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")

public class cartController {

	

	    @RequestMapping(value="/{cartId}", method = RequestMethod.GET)
	    public String getCart(@PathVariable(value = "cartId") int cartId, Model model) {
	        model.addAttribute("cartId", cartId);

	        return "cart";
	    }

	}