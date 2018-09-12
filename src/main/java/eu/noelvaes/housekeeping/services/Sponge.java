package eu.noelvaes.housekeeping.services;

public class Sponge implements CleaningTool {
	public Sponge() {
		System.out.println("Sponge: constructor");
	}

   public void doCleanJob() {
      System.out.println("Splash splash");
   }
}
