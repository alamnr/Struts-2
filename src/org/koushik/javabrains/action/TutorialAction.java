package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	
	// Struts Interceptor transfer the input parameters to  action's member variables
	// and the action instance and member variables  are saved into the value stack for each request and then pulled out from that stack
	private String language;
	
	public String execute(){
		//System.out.println("Hello  from execute");
		// Better to have interface and the inject that service bean through spring
		TutorialFinderService tutorialFinderService =  new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
		System.out.println(getLanguage());
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
