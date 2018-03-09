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
	
	/**
	 * Convert a distance form one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		 String text1 = textfield1.getText().trim();
		 Length unit1 = unitbox1.getValue();
		 String text2 = textfield2.getText().trim();
		 Length unit2 = unitbox2.getValue();
		unit2.getValue();
		System.out.println(unit2);
		System.out.println(unit2.getValue());
		try {
			
			}catch (Exception e) {
				textfield1.setStyle("-fx-text-inner-color: red;");
			}
		}
	
	/**
	 * Clear a text in the text field.
	 */
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield2.clear();
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
