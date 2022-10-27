package com.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.dtos.UserDto;
import com.amazon.models.Order;
import com.amazon.models.Product;
import com.amazon.models.User;
import com.amazon.serivce.UserService;

@RestController
@RequestMapping("amazon/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping(path="/allproducts")
	public List<Product> allProduct(){
		return userService.getAllProduct();
	}
	
	
	
	@GetMapping(path="/allorders/{uid}")
	public List<Order> allOrders(@PathVariable int uid)
	{
		return userService.userOrders(uid);
	}
	
	@GetMapping(path="/{uid}")
	public User getUser(@PathVariable int uid)
	{
		return userService.getUserByid(uid);
	}
	
	@GetMapping(path="/order/{oid}")
	public Order getOrder(@PathVariable int oid)
	{
		return userService.getOrderbyId(oid);
	}
	
	@PostMapping(path="/neworder/{uid}/{pid}/{count}")
	public Order newOrder(@PathVariable int uid,@PathVariable int pid,@PathVariable int count)
	{
		return userService.newOrder(pid, uid, count);
	}
	
	@PutMapping(path="/cancelorder/{oid}")
	public Order cancelOrder(@PathVariable int oid)
	{
		return userService.cancelOrder(oid);
	}
	
	@PutMapping(path="/updateuser")
	public User updateUser(@RequestBody UserDto dto)
	{
		return userService.updateUser(dto);
	}
}
