import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//-----------------------> Inheritance Example
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class BikeListModel{
    String bikeName;
    String bikeType;
    int bikePrice;

    public BikeListModel(String bikeName, String bikeType, int bikePrice){
        this.bikeName = bikeName;
        this.bikeType = bikeType;
        this.bikePrice = bikePrice;
    }
    public BikeListModel(){
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public int getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(int bikePrice) {
        this.bikePrice = bikePrice;
    }
}
class BikeAdding{
    public List<BikeListModel> listModels = new ArrayList<BikeListModel>();
}
class BikeRental{
    public String bikeName;
    public String bikeType;
    public int bikePrice;

    public BikeRental(String bikeName, String bikeType, int bikePrice){
        this.bikeName = bikeName;
        this.bikeType = bikeType;
        this.bikePrice = bikePrice;
    }

    BikeRental() {
    }

    public boolean bikeAvailableStatus(){
        return bikePrice > 0;
    }

    public String bikeStatusChange(int bikeNumber){
        if (bikePrice == 0){
            return "Available";
        }
        else{
            return "Not Available";
        }
    }

    public String addBikeList(List<BikeListModel> bikeList){
        BikeAdding bikeAdding = new BikeAdding();
        bikeAdding.listModels = bikeList;
        return "Added";
    }
}

class GearBike extends BikeRental{
    @Override
    public String addBikeList(List<BikeListModel> bikeList) {
        return super.addBikeList(bikeList);
    }
}
class WithOutGearBike extends GearBike{
    @Override
    public String addBikeList(List<BikeListModel> bikeList) {
        return super.addBikeList(bikeList);
    }
}
public class Main {
    public static void main(String[] args) {
//        GearBike gearBike = new GearBike();
//        BikeListModel listModel = new BikeListModel("R15", "GearType", 45000);
//        List<BikeListModel> finalModel = Collections.singletonList(listModel);
//        System.out.println(gearBike.addBikeList(finalModel));

        WithOutGearBike bike = new WithOutGearBike();
        BikeListModel listModel = new BikeListModel("R15", "GearType", 45000);
        List<BikeListModel> finalModel = Collections.singletonList(listModel);
        System.out.println(bike.addBikeList(finalModel));
    }
}


/*
     Class :-
        A class is a blueprint of the object, They have a 2 field are in class 1. states and 2. behaviour.
        Example :-
        class Bicycle {    // class
            int cyclePrice; // states or field
            name cycleName;

            public String getCycleName(){  // behaviours or method
                return "gear cycle";
            }
        }
        In above code not complete, because of no main methods.
     Object :-
        object is an instance of class, that contain two characters, state and behaviour.

     Example of Object using a before classes:-
     class Main {
        Bicycle bicycle = new Bicycle(); ----> object creation.
        System.Out.println(bicycle.getCycleName()); // output will be :- gear cycle.
     }
 */