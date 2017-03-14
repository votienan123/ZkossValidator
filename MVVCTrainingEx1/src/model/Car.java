package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Car {

   private Integer id;
   private String model;
   private String make;
   private Integer year;
   
   public Integer getYear() {
	return year;
}

public void setYear(Integer year) {
	this.year = year;
}

private String preview;
   private String description;
   private Integer price;

   public Car() {
   }

   public Car(Integer id, String model, String make, Integer year, String description, String preview, Integer price) {
       this.id = id;
       this.model = model;
       this.make = make;
       this.year =  year;
       this.preview = preview;
       this.description = description;
       this.price = price;
   }

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getMake() {
       return make;
   }

   public void setMake(String make) {
       this.make = make;
   }

   public String getPreview() {
       return preview;
   }

   public void setPreview(String preview) {
       this.preview = preview;
   }

   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }

   public Integer getPrice() {
       return price;
   }

   public void setPrice(Integer price) {
       this.price = price;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }
   
   private static List<String> listModel = new ArrayList<String>();
   
   static{
	   listModel.add("Primera");		  
		  listModel.add("Cefiro");
		  listModel.add("Camry");
		  listModel.add("Century");
		  listModel.add("Sigma");
		  listModel.add("Challenger");
		  listModel.add("Civic");
		  listModel.add("New Beetle");
		  listModel.add("Golf V");
		  listModel.add("Neon");

   }
    
   public static final List<String> getCarModels() {
       return new ArrayList<String>(listModel);
   }
}