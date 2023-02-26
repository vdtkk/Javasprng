package kodlama.io.rentACar.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.bussiness.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotion
@RequestMapping("/api/brands")

public class BrandsController {

	private BrandService brandService;

	

	public BrandsController(BrandService brandService) {
		
		this.brandService = brandService;
	}
	
	
	@GetMapping("/getAll")
	public List<Brand> getAll(){
		
		return brandService.getAll();
	}
	
	
}
