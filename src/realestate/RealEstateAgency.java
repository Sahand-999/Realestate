/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestate;

public class RealEstateAgency {
    private Property[] properties;
    private int propertyCount;

    public RealEstateAgency() {
        properties = new Property[100];
        propertyCount = 0;
    }

    public void addProperty(Property property) {
        if (propertyCount < 100) {
          
     properties[propertyCount++] = property;
          System.out.println("added");
       
        
        } else {
            System.out.println("cant add its full");
        }
    }

   
    public void removeProperty(int index) {
        if (index < 0 || index >= propertyCount) {
            
            
            System.out.println("error.");
            return;
        }
        for (int i = index; i < propertyCount - 1; i++) {
            properties[i] = properties[i + 1];
        }
       
        
        properties[--propertyCount] = null;
        
        System.out.println("removed");
    }

    public void displayAllProperties() {
        if (propertyCount == 0) {
            System.out.println("no props");
            return;
        }
        for (int i = 0; i < propertyCount; i++) {
         
            System.out.println("prop " + (i + 1) + ":");
           
            properties[i].display();
            System.out.println();
        }
    }
}
