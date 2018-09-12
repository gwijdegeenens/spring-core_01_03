package eu.noelvaes.housekeeping.services;

public class CleaningServiceImpl implements CleaningService {
   private CleaningTool tool;

   public CleaningServiceImpl() {
		System.out.println("CleaningServiceImpl: constructor");
	}

   public void setCleaningTool(CleaningTool tool) {
      this.tool = tool;
   }
   
	public void clean() {
      System.out.println("Cleaning the house");
      tool.doCleanJob();      
   }
}
