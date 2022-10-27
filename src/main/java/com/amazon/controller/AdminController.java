package com.amazon.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.dtos.ProductDto;
import com.amazon.dtos.UserDto;
import com.amazon.models.Order;
import com.amazon.models.Product;
import com.amazon.models.User;
import com.amazon.serivce.AdminService;

@RestController
@RequestMapping("/amazon/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@GetMapping("/alluser")
	public List<User> allUser(){
		return adminService.getAllUsers();
	}
	
	@GetMapping("/allproduct")
	public List<Product> getAllproduct(){
		return adminService.getAllProducts();
	}
	
	@GetMapping("/allorder")
	public List<Order> getAllOrder(){
		return adminService.getAllOrders();
	}
	
	@PostMapping("/user")
	public User insertUser(@RequestBody UserDto user)
	{
		return adminService.insertUser(user);
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody ProductDto product)
	{
		return adminService.insertProduct(product);
	}
	
	@PutMapping("/delivered/{oid}")
	public Order deliverdOrder(@PathVariable int oid)
	{
		return adminService.updateOrder(oid);
	}
	
	@PutMapping("/updatestock/{pid}/{count}")
	public Product updateStock(@PathVariable int pid,@PathVariable int count)
	{
		return adminService.updateProductCount(pid, count);
	}
	
	@DeleteMapping("/product/{pid}")
	public String deleteProduct(@PathVariable int pid)
	{
		adminService.deleteProduct(pid);
		return "Deleted";
	}
}
