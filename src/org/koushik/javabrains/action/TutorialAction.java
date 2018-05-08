package org.koushik.javabrains.action;

import org.koushik.javabrains.service.TutorialFinderService;

public class TutorialAction {
	
	private String bestTutorialSite;
	
	public String execute(){
		//System.out.println("Hello  from execute");
		// Better to have interface and the inject that service bean through spring
		TutorialFinderService tutorialFinderService =  new TutorialFinderService();
		setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	
	

}
