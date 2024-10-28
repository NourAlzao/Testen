package gui;

import java.io.IOException;

import business.BuergeraemterModel;
import javafx.stage.Stage;

public class BuergeraemterControl {
	
	private BuergeraemterModel buergeraemterModel;
	private BuergeraemterView buergeraemterView;
	

	public BuergeraemterControl(Stage primaryStage){
		this.buergeraemterModel = new BuergeraemterModel();
		this.buergeraemterView = new BuergeraemterView(this, primaryStage, buergeraemterModel);
	}
	
	void schreibeBuergeraemterInDatei(String typ){
	   	try{
	   		if("csv".equals(typ)){
	   			buergeraemterModel.schreibeBuergeraemterInCsvDatei();
	   			buergeraemterView.zeigeInformationsfensterAn("Die Burgeremter wurden gespeichert!");
	   			
	   		}
	   		else{
	   			buergeraemterView.zeigeInformationsfensterAn("Noch nicht implementiert!");
	   		}
	    } 
		catch(Exception exc){
			  buergeraemterView.zeigeFehlermeldungsfensterAn("Unbekannter Fehler beim Speichern!");
		}
    }

}


