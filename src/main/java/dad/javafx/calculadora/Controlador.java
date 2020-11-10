package dad.javafx.calculadora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controlador implements Initializable {

	private Modelo modelo = new Modelo();
	
	@FXML
	private GridPane view;
	
	@FXML
	private TextField textoPantalla;
	
	@FXML
	private Button boton0;
	
	@FXML
	private Button boton1;
	
	@FXML
	private Button boton2;
	
	@FXML
	private Button boton3;
	
	@FXML
	private Button boton4;
	
	@FXML
	private Button boton5;
	
	@FXML
	private Button boton6;
	
	@FXML
	private Button boton7;
	
	@FXML
	private Button boton8;
	
	@FXML
	private Button boton9;
	
	@FXML
	private Button botonSumar;
	
	@FXML
	private Button botonRestar;
	
	@FXML
	private Button botonMultiplicar;
	
	@FXML
	private Button botonDividir;
	
	@FXML
	private Button botonC;
	
	@FXML
	private Button botonCE;
	
	@FXML
	private Button botonComa;
	
	@FXML
	private Button botonIgual;
	
	public Controlador() throws IOException {
		FXMLLoader cargador = new FXMLLoader(getClass().getResource("Vista.fxml"));
		cargador.setController(this);
		cargador.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public Modelo getModelo() {
		return modelo;
	}

	public GridPane getView() {
		return view;
	}
}
