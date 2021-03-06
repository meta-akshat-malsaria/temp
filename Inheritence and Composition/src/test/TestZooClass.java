package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Zoo.Cage;
import Zoo.Zone;
import Zoo.Zoo;
import Animal.Animal;
import Animal.Aqua.Carnivorous.Shark;
import Animal.Bird.Carnivorous.Owl;
public class TestZooClass 
{
    
    @Test
    public void testAnimalAdditionAndRemoval() 
    {
        Animal instance1 = new Shark("Shark1", 22, 1000);
        Animal instance2 = new Shark("Shark1", 22, 1000);
        Animal instance3 = new Owl("Owl1", 22, 1000);
        try
        {
            assertEquals(true, Zoo.addAnimal(instance1));
            assertEquals(false, Zoo.addAnimal(instance3));
        }
        catch(Exception e)
        {   
            
            
            String msg1 = "Supported zone not found for given animal!!!";
            assertEquals(msg1,e.getMessage());

        }
        try 
        {
            assertEquals(false, Zoo.addAnimal(instance2));
        }
        catch(Exception e)
        {
            String msg = "Same name animal already present in zoo!!!";
            assertEquals(msg,e.getMessage());        }
        try
        {
            assertEquals(true, Zoo.removeAnimal(instance1));
            assertEquals(false, Zoo.removeAnimal(instance3));
        }
        catch(Exception e)
        {  
            String msg2 = "Supported zone not found for given animal!!!";
            assertEquals(msg2,e.getMessage());      
            }
    }
    @Before  
    public void testCageAddition()
    {
        Zone addNewZoneInstance1 = new Zone(10, "Aqua", true, true); 
        Zone addNewZoneInstance2 = new Zone(15, "Mammal", true, true); 
        Zone addNewZoneInstance3 = new Zone(1, "Reptile", true, true); 
        Cage addnewCageInstance1 = new Cage(1, "Shark");
        Cage addnewCageInstance2 = new Cage(4, "Deer");
        Cage addnewCageInstance3 = new Cage(4, "Crocodile");
        Cage addnewCageInstance4 = new Cage(1, "Duck");
        Zoo.addZone(addNewZoneInstance1);
        Zoo.addZone(addNewZoneInstance2);
        Zoo.addZone(addNewZoneInstance3);
        assertEquals(true, Zoo.addCage(addNewZoneInstance1, addnewCageInstance1));
        assertEquals(true, Zoo.addCage(addNewZoneInstance2, addnewCageInstance2));
        assertEquals(true, Zoo.addCage(addNewZoneInstance3, addnewCageInstance3));
        assertEquals(false, Zoo.addCage(addNewZoneInstance3, addnewCageInstance4));
    }
    
}