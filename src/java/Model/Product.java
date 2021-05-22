
package Model;


public class Product {
    private String id;
    private String name;
    private String price;
    private String image;
 
    
    public Product(String name, String price, String image){
    
    }
    
    public Product(String id, String name, String price, String image) {
       
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public Product() {
        
        this.id = "null";
        this.name = "null";
        this.price = "null";
        this.image = "null";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + "  }";
    }
}
   
    
    

