package team3647subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;

public class Lights 
{
  static DigitalOutput one = new DigitalOutput(5);
	static DigitalOutput two = new DigitalOutput(6);
	static DigitalOutput three = new DigitalOutput(7);
  
  public static void LightOutput(boolean input1, boolean input2, boolean input3)
  {
    one.set(input1);
		two.set(input2);
		three.set(input3);
  }
  /*
  Code Combo One - Have Cube:
  input1 = true;
  input2 = false;
  input3 = false;
  
  Code Combo Two - Elevator Low Gear:
  input1 = false;
  input2 = true;
  input3 = false;
  
  Code Combo Three - Red Alliance Idle:
  input1 = false;
  input2 = false;
  input3 = true;
  
  Code Combo Four - Blue Alliance Idle:
  input1 = true;
  input2 = true;
  input3 = false;
  
  Code Combo Five - Default:
  input1 = false;
  input2 = false;
  input3 = false;
  
  */
}
