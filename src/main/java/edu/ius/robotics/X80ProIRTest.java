package edu.ius.robotics;

import java.io.IOException;

import edu.ius.robotics.robots.X80Pro;

public class X80ProIRTest
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		X80Pro robot = null;
		//X80Pro otherRobot = null;
		
		try
		{
			robot = new X80Pro("192.168.0.201");
			//otherRobot = new X80Pro("192.168.0.202");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		if (robot == null) // || otherRobot == null)
		{
			return;
		}
		
		//otherRobot.resumeAllSensors();
		//otherRobot.resetHead();
		
		robot.resumeAllSensors();
		robot.resetHead();
		
		while (true)
		{
			System.err.println(robot.getIRRange(1));
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//robot.lowerHead();
		//robot.shutdown();
	}
	
}
