package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

   @Test
   public void isOnTest() {
      //given that I have an AC and my AC is on
      AirConditioner malik = new AirConditioner();
      //when I want to turn it on
      malik.setOn(true);
      assertTrue(malik.isOn());
   }

   @Test
   public void isOff(){
     AirConditioner malik = new AirConditioner();
     malik.setOff(true);
     assertTrue(malik.isOff());
   }

   @Test
   public void increaseTemperatureTest(){
      //
      AirConditioner malik = new AirConditioner();
      //when I increase the temperature to 27 degrees
      malik.increaseTemperature(32);
      //check that temperature has increased to 27 degrees
      int temperature = malik.getTemperature();
      assertEquals(30, temperature);
   }

   @Test
   public void decreaseTemperatureTest(){
      // given that my AC is on
      AirConditioner malik = new AirConditioner();
      // I want to decrease my AC
      malik.decreaseTemperature(32);
      int temperature = malik.getTemperature();
      assertEquals(30, temperature);
   }

   @Test
   public void decreaseTemperatureBetween16And30Test(){
      AirConditioner malik = new AirConditioner();
      malik.decreaseTemperature(27);
      int temperature = malik.getTemperature();
      assertEquals(26, temperature);
   }




}