package eu.noelvaes.housekeeping.services;

public class DisposableDuster implements CleaningTool {
   private boolean used = false;

   public void doCleanJob() {
      if (used) {
         System.out
               .println("I'm already used. Please throw me away!");
      } else {
         System.out.println("Wipe the dust away");
         used = true;
      }
   }
}
