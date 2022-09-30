public class electronics {
    private String item;
    private int productId;
    private int allItems;

    public electronics(){

    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAllItems() {
        return allItems;
    }

    public void setAllItems(int allItems) {
        this.allItems = allItems;
    }

    public electronics(String item, int allItems){
        this.item = item;
        this.allItems = allItems;
    }


}
