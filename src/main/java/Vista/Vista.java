package Vista;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Vista extends Application {

	//Preparemos las variables necesarias
	private TextField busca;
	private TextField remplazaPor;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		//Fila Busca
		HBox Buscar = new HBox();
		Label Busqueda = new Label("Busca: ");
		Buscar.setAlignment(Pos.BASELINE_CENTER);
		Buscar.setSpacing(5);
		Buscar.getChildren().addAll(Busqueda, busca);
		
		//Fila Remplaza
		HBox Remplazar = new HBox();
		Label Remplaza = new Label("Remplazar por: ");
		Remplazar.setAlignment(Pos.BASELINE_CENTER);
		Remplazar.setSpacing(5);
		Remplazar.getChildren().addAll(Remplaza, remplazaPor);
		
		
		HBox Todo = new HBox();
		Todo.setAlignment(Pos.BASELINE_CENTER);
		Todo.setSpacing(5);
		Todo.getChildren().addAll(Buscar, Remplazar);
		//Ventana de la Aplicación
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(Todo);
		
		Scene ventana = new Scene(root, 320, 200);	
		
		primaryStage.setScene(ventana);
		primaryStage.setTitle("Busca y Remplaza");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
