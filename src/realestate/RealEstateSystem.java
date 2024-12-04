/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;


public class RealEstateSystem {
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();

       
        Property villa = new Villa(250, 5, "Palm Beach", 1_000_000, true, 2);
        Property apartment = new Apartment(120, 3, "Downtown", 300_000, 5, true);
      
        Property furnishedApartment = new FurnishedApartment(85, 2, "Suburbs", 200_000, 3);

      
        agency.addProperty(villa);
   agency.addProperty(apartment);
        agency.addProperty(furnishedApartment);

        
        System.out.println("all props:");
        agency.displayAllProperties();
    agency.removeProperty(1);

        System.out.println("props after:");
       
        
        agency.displayAllProperties();
    }
}
