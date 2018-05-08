package org.koushik.javabrains.service;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String language){
		if(language!=null && language.equals("java"))
		return "Java Brain";
		else{
			return "Language not supported yet!";
		}
	}

}
