package eu.noelvaes.housekeeping;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.noelvaes.housekeeping.services.CleaningService;

public class HouseApp {
   public static void main(String[] args) {
      try (
         ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(
            AppConfig.class)) {
         System.out.println("Container initialized");
         CleaningService jill = ctx.getBean("Jill",CleaningService.class);
         CleaningService jane = ctx.getBean("Jane",CleaningService.class);
         CleaningService richard = ctx.getBean("Richard",CleaningService.class);
         CleaningService scott = ctx.getBean("Scott", CleaningService.class);
         CleaningService gwijde = ctx.getBean("gwijde", CleaningService.class);
         jill.clean();
         jane.clean();
         richard.clean();
         System.out.println("Scott");
         scott.clean();
         scott.clean();

         System.out.println("Gwijde");
         gwijde.clean();
         gwijde.clean();
      }
   }
}
