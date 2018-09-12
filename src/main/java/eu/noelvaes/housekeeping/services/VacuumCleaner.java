package eu.noelvaes.housekeeping.services;

public class VacuumCleaner implements CleaningTool {
	public VacuumCleaner() {
		System.out.println("VacuumCleaner: constructor");
	}

   public void doCleanJob() {
      System.out.println("Zuuuuuuuuuuu");
   }
}
