package eu.noelvaes.housekeeping.services;

public class Broom implements CleaningTool {
	public Broom() {
		System.out.println("Broom: constructor");
	}
	
   public void doCleanJob() {
      System.out.println("Scrub scrub");
   }
}
