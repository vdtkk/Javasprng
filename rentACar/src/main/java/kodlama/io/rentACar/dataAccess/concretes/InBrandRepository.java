package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class InBrandRepository implements BrandRepository {

	List<Brand> brands;
	
	public InBrandRepository() {
		brands=new ArrayList<Brand>();
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(1,"mercedes"));
		brands.add(new Brand(1,"audi"));
		brands.add(new Brand(1,"Fiat"));
	
	}	
	
	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}
	
	

}
