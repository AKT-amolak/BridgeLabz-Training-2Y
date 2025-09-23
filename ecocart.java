public class ecocart {
    abstract static class Product {
        private int id;
        private String name;
        private double price;
        public Product(int id,String name,double price){
            this.id=id;
            this.name=name;
            this.price=price;
        }
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price=price;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public abstract double getDiscountedPrice();
        public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discounted Price: " + getDiscountedPrice());
        }
    }
    class OrganicProduct extends Product {
    public OrganicProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.9;
    }
    @Override
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() + ", Base Price: " + getPrice() + ", Discounted Price: " + getDiscountedPrice();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return getId() == product.getId();
    }
    }
    
}