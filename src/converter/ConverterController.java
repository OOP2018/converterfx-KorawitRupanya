package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * @author Smarty
 *
 */

public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	private ComboBox<Length> unitbox1;
	@FXML
	private ComboBox<Length> unitbox2;
	
	private String defaultStyle;
	
	/**
	 * Convert a distance form one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		TextField startNumber = textfield1;
		TextField convertedNumber = textfield2;
		defaultStyle=startNumber.getStyle();
		
		if(textfield1.getText().length()!=0) {
		startNumber = textfield1;
		convertedNumber = textfield2;
		}
		if(textfield2.getText().length()!=0){
		startNumber=textfield2;
		convertedNumber=textfield1;
		}
		try {
			String text1 = startNumber.getText().trim();
			double startNumberDb = Double.parseDouble(text1);
			Length unit1 = unitbox1.getValue();
			double meter = startNumberDb*unit1.getValue();
			Length unit2 = unitbox2.getValue();
			double result = meter/unit2.getValue();
			String acresult = String.format("%.4g",result);
			convertedNumber.setText(acresult);
			}catch (Exception e) {
				startNumber.setStyle("-fx-text-inner-color: red;");
			}
		}
	
	/**
	 * Clear a text in the text field.
	 */
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
		textfield1.setStyle(defaultStyle);
		textfield2.setStyle(defaultStyle);
		}
	
	/**
	 * JavaFX calls the initialize() method of your controller when
	 * it creates the UI form, after the components have been created
	 * and @FXML annotated attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
	    System.out.println("Running initialize");
	    if (unitbox1 != null) {
	      unitbox1.getItems().addAll( Length.values() );
	      unitbox1.getSelectionModel().select(unitbox1.getSelectionModel().getSelectedItem());; // select an item to show
	    }
	    if (unitbox2 != null) {
	      unitbox2.getItems().addAll( Length.values() );
	      unitbox2.getSelectionModel().select(unitbox2.getSelectionModel().getSelectedItem()); // select an item to show
	    }
	}
	
}
