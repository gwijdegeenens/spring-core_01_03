package eu.noelvaes.housekeeping;

import org.springframework.context.annotation.*;

import eu.noelvaes.housekeeping.services.*;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(value="prototype")
	public CleaningTool broom() {
		return new Broom();
	}
	
	@Bean
	@Scope("prototype")
	public CleaningTool vacuum() {
		return new VacuumCleaner();
	}
	
	@Bean
	@Scope("prototype")
	public CleaningTool sponge() {
		return new Sponge();
	}

	@Bean
	//@Scope(value="prototype",proxyMode=ScopedProxyMode.INTERFACES)
	//@Scope(value="prototype")
	public CleaningTool duster() {
		return new DisposableDuster();
	}
	
	@Bean(name="Jill")
	@Lazy
	public CleaningService jill() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(broom());
		return cs;
	}

	@Bean(name="Jane")
   @Lazy
	public CleaningService jane() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(broom());
		return cs;
	}
	
	@Bean(name="Richard")
   @Lazy
	public CleaningService richard() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(sponge());
		return cs;
	}
	
	@Bean(name="Scott")
    @Lazy
	public CleaningService scott() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(duster());
		return cs;
	}

	@Bean
	@Lazy
	public CleaningService gwijde() {
		CleaningServiceImpl cs = new CleaningServiceImpl();
		cs.setCleaningTool(duster());
		return cs;
	}
	
}
