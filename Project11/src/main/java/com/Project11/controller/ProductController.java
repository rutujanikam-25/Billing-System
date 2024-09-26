package com.Project11.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.service.annotation.PutExchange;

import com.Project11.dao.ProductDao;
import com.Project11.model.Product;
import com.Project11.repository.ProductRepository;

@Controller
@SessionAttributes({"productKey","ProductDetails","productRevenue"})
public class ProductController {
  
	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private ProductDao dao;
	
	@RequestMapping("/AddProduct")
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping("/AddProductDeatils")
	@ResponseBody
	public String addProductDB(@ModelAttribute Product product,Model model) {
		Product p1=dao.addProduct(product);
		if(p1!=null) {
		
		return "<h1>ADD Products Successfully</h1> <a href='/Project11/'> Home Page</a><br> ";
		}
			return "<h1> Not able to add product</h1>";
		
	}
	
	@RequestMapping("viewProducts")
	public String viewProductDetails(Model model) {
		List<Product> pList=dao.viewProduct();
		model.addAttribute("productKey",pList);
		return "ViewProduct";
	}
	
	
	
	
	
	  @RequestMapping("/EditProduct/{id}") public String EditDetail(@PathVariable int id,Model model) 
	  {  
		 
		  Product obj=dao.getProductById(id);
	  model.addAttribute("ProductDetails",obj); 
	  return "EditDetails"; }
	 
	/*
	 * @RequestMapping(value="/updateProductDetails/{id}")
	 * 
	 * @ResponseBody public String updateProduct(@PathVariable("id") int
	 * id,@ModelAttribute Product product, Model model) { // Fetch the product by ID
	 * System.out.println("Inside update product"+product.getName()); Product
	 * product1 = prodRepo.findById(id).orElse(null);
	 * 
	 * if (product != null) { // Update the price
	 * product1.setName(product.getName()); product1.setPrice(product.getPrice());
	 * product1.setQuantity(product.getQuantity());
	 * product1.setBrand(product.getBrand());
	 * product1.setSupplier(product.getSupplier());
	 * product1.setStock(product.getStock());
	 * product1.setCategory(product.getCategory()); prodRepo.save(product1);
	 * //dao.addProduct(product); model.addAttribute("message",
	 * "Product price updated successfully."); } else {
	 * model.addAttribute("message", "Product not found."); }
	 * 
	 * return "result"; // Returns a JSP page to display the result }
	 */
	  
	  
	/*
	 * @RequestMapping("/updateProductDetails")
	 * 
	 * @ResponseBody public String update(@RequestBody Product prod) {
	 * dao.UpdateProduct(prod); return "Update successfully"; }
	 */
	  
	  
	  
	  
	  
	  @RequestMapping("/updateProductDetails")
		@ResponseBody
		public String updateProductDB(@ModelAttribute Product product,Model model) {
			Product p1=dao.addProduct(product);
			if(p1!=null) {
			
			return "<h1>ADD Products Successfully</h1> <a href='/'>Login</a> ";
			}
				return "<h1> Not able to add product</h1>";
			
		}
		
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
//	  @RequestMapping(value="/updateProductDetails/{id}" ,method=RequestMethod.POST)
//	  @ResponseBody
//	  public String updateProduct(@PathVariable("id") int id,@RequestParam(value ="name") String name, @RequestParam("price") Double
//	  price, @RequestParam("quantity")int quantity, @RequestParam("brand") String
//	  brand, @RequestParam("supplier") String supplier,@RequestParam("stock") int
//	  stock,@RequestParam("category") String category, Model model) { 
//	  
//	  
//	 Product p=new Product();
//	 p.setId(id);
//	 p.setName(name);
//	 p.setPrice(price);
//	 p.setQuantity(quantity);
//	 p.setSupplier(supplier);
//	 p.setStock(stock);
//	 p.setCategory(category);
//	 
//	 int UpdateStatus=dao.update(p);
//	 
//	 if(UpdateStatus>0) {
//			return"<h2><font color='green'>Course Update Successfully</font></h2>";
//		}
//		return"<h2><font color='red'>Not able to update</font></h2>";
//	 
//	 
//	  }
	/*
	 * @RequestMapping(path="/updateProductDetails")//@PathVariable("id") int id,
	 * 
	 * @ResponseBody public String updateProduct(
	 * 
	 * @RequestParam(value = "t1") String name,
	 * 
	 * @RequestParam("t2") Double price,
	 * 
	 * @RequestParam("t3") int quantity,
	 * 
	 * @RequestParam("t4") String brand,
	 * 
	 * @RequestParam("t5") String supplier,
	 * 
	 * @RequestParam("t6") int stock,
	 * 
	 * @RequestParam("t7") String category) { // Create and update the product
	 * Product p = new Product(); // p.setId(id); p.setName(name);
	 * p.setPrice(price); p.setQuantity(quantity); p.setBrand(brand);
	 * p.setSupplier(supplier); p.setStock(stock); p.setCategory(category);
	 * 
	 * int updateStatus = dao.update(p);
	 * 
	 * if (updateStatus > 0) { return
	 * "<h2><font color='green'>Product Updated Successfully</font></h2>"; } else {
	 * return "<h2><font color='red'>Unable to update product</font></h2>"; } }
	 */
	
	@RequestMapping("/DeleteProduct/{id}")
	@ResponseBody
	public String DeleteProduct(@PathVariable int id,Model model) {
		dao.deleteProduct(id);
		return "<h1>Delete Products Successfully</h1> <a href='Project11/viewProducts'>View Product</a> ";
	}
}
