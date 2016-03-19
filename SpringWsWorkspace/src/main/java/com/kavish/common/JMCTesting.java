package com.kavish.common;

public abstract class JMCTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  for (int i=0;i<1000;i++){
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Loop Count "+i);
	  }

	}

}
