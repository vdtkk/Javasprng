package kodlama.io.rentACar.bussiness.concretes;

import java.util.List;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class BrandManager implements BrandService{

	
	
	private BrandRepository brandRepository;
		
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		
		this.brandRepository = brandRepository;
	}




@override
	public List<Brand> getAll(){
//		//İŞ KRUALI
		
		return null;
	}
	
	
}
