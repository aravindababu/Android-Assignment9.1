/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdtvexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user2
 */
public class HDTVExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating a new ArrayList of HDTV and adding brand and size of the tv
        ArrayList<HDTV> tv = new ArrayList<HDTV>();
        //adding names and size
        tv.add(new HDTV("Sony",42));
        tv.add(new HDTV("LG",52));
        tv.add(new HDTV("Samsung",32));
        
        Collections.sort(tv);
        
        for(HDTV str: tv){
            System.out.println(str);
            
        }
    }
    
}
//class HDTV implementing Comparable
class HDTV implements Comparable{
    //Declaring Variables BrandName and Size
    private String BrandName;
    private int Size;
    //Defining parametrized constructors
    public HDTV(String BrandName,int Size){
        this.BrandName=BrandName;
        this.Size=Size;
    }
    //generating getters and setters
    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    
    
    
//Sorting the objects using compareTo method
    @Override
    public int compareTo(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    int Size = ((HDTV) o).getSize();
    return this.Size-Size;
    
    
    }
    //Displaying the output in String Format
    @Override
    public String toString() {
        return "[ Brand Name : " + BrandName + ", Size : " + Size+ "]";
    }
} 
