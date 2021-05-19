
package Model;


public class Product {
    private int id;
    private String name;
    private int price;
    private String image;
    private int sum;
    
    public Product(int sum){
    
    }
    
    public Product(String name, int price, String image){
    
    }
    
    public Product(int id, String name, int price, String image) {
       
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public Product() {
        
        this.id = 0;
        this.name = "null";
        this.price = 0;
        this.image = "null";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + " +  }";
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    
}
