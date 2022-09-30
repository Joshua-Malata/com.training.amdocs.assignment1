import java.util.*;
public class shoppingCart {
//    -----------------------------Grocery
    private HashMap<Groceries,Groceries> itemGrocery = new HashMap<>();
    public void setGrocery(HashMap<Groceries,Groceries> obj){
        itemGrocery=obj;
    }
    public HashMap<Groceries,Groceries> getGrocery(){
        return itemGrocery;
    }

    public void addGrocery(Groceries groceriesObj){
        itemGrocery.put(groceriesObj,groceriesObj);
    }
    public HashMap<Groceries,Groceries> viewAllGrocery(){
        return itemGrocery;
    }

    public boolean removeGrocery(long productID){
        boolean f=false;
        for(Groceries obj:itemGrocery.keySet()){
            if(obj.getProductId()==productID){
                f=true;
                itemGrocery.remove(obj);
                break;
            }
        }
        return f;
    }
//------------------------------------------------------Electronics
    private HashMap<electronics,electronics> itemElectronics = new HashMap<>();
    public void setElectornic(HashMap<electronics,electronics> obj){
        itemElectronics=obj;
    }
    public HashMap<electronics,electronics> getElectornic(){
        return itemElectronics;
    }

    public void addElectornic(electronics electronicObj){
        itemElectronics.put(electronicObj,electronicObj);
    }
    public HashMap<electronics,electronics> viewAllElectornic(){
        return itemElectronics;
    }

    public boolean removeElectronic(long productID){
        boolean f1=false;
        for(electronics obj:itemElectronics.keySet()){
            if(obj.getProductId()==productID){
                f1=true;
                itemElectronics.remove(obj);
                break;
            }
        }
        return f1;
    }




}
