package dad.javafx.calculadora;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Modelo {

	private DoubleProperty operando1 = new SimpleDoubleProperty();
	private DoubleProperty operando2 = new SimpleDoubleProperty();
	private StringProperty operador = new SimpleStringProperty();
	private StringProperty pantalla = new SimpleStringProperty();
	
	public final DoubleProperty operando1Property() {
		return this.operando1;
	}
	
	public final double getOperando1() {
		return this.operando1Property().get();
	}
	
	public final void setOperando1(final double operando1) {
		this.operando1Property().set(operando1);
	}
	
	public final DoubleProperty operando2Property() {
		return this.operando2;
	}
	
	public final double getOperando2() {
		return this.operando2Property().get();
	}
	
	public final void setOperando2(final double operando2) {
		this.operando2Property().set(operando2);
	}
	
	public final StringProperty operadorProperty() {
		return this.operador;
	}
	
	public final String getOperador() {
		return this.operadorProperty().get();
	}
	
	public final void setOperador(final String operador) {
		this.operadorProperty().set(operador);
	}
	
	public final StringProperty pantallaProperty() {
		return this.pantalla;
	}
	
	public final String getPantalla() {
		return this.pantallaProperty().get();
	}
	
	public final void setPantalla(final String pantalla) {
		this.pantallaProperty().set(pantalla);
	}
}
