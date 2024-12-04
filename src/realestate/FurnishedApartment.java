/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;


public class FurnishedApartment extends Property {
   
    private int furnitureQuality;

    public FurnishedApartment(double area, int rooms, String neighborhood, double price, int furnitureQuality) {
        super(area, rooms, neighborhood, price);
      
        
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        System.out.println("furnished apt:");
      
        System.out.println("area: " + area + " rooms:" + rooms + ", neighbr: " + neighborhood + " price:" + price);
      
        System.out.println("furniture: " + furnitureQuality + " (1=best 5=worst)");
    }
}
