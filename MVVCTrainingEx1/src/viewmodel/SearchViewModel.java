package viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import model.Car;
import model.CarService;
import model.CarServiceImpl;


public class SearchViewModel {
    
   private String keyword;
   private List<Car> carList;
   private Car selectedCar;
   private Car newCar;
    
   private CarService carService = new CarServiceImpl();
    
   public void setKeyword(String keyword) {
       this.keyword = keyword;
   }
   public String getKeyword() {
       return keyword;
   }

   public List<Car> getCarList(){
       return carList;
   }
    
        
   public void setSelectedCar(Car selectedCar) {
       this.selectedCar = selectedCar;
   }
   public Car getSelectedCar() {
       return selectedCar;
   }
   
   public Car getNewCar() {
		if(newCar == null ) {
			newCar = new Car();
		}
		return newCar;
	}
	
   public List<String> getCarModels() {
       return Car.getCarModels();
   }
    
   @Command
   @NotifyChange("carList")
   public void search(){
       carList = carService.search(keyword);
   }
   @Command
   @NotifyChange("carList")
   public void addNew(){
       carList = carService.addNew(newCar);
   }

}