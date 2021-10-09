package dad.BuscaYRemplaza;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscaYRemplaza extends Application {

	//vista
	private Button buscarButton;
	private Button reemplazaButton;
	private Button reemplazaTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	CheckBox mayuMinuCheck;
	CheckBox buscaAtrasCheck;
	CheckBox expresionCheck;
	CheckBox resaltaResultCheck;
	
	TextField buscarText;
	TextField remplazarText;
	

	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//Inicializamos Textfields
		buscarText = new TextField();
		remplazarText = new TextField();
		
		//Inicializamos Checkboxes
		mayuMinuCheck = new CheckBox("May�sculas y min�sculas");
		buscaAtrasCheck = new CheckBox("Buscar hacia atr�s");
		expresionCheck = new CheckBox("Expresi�n regular");
		resaltaResultCheck = new CheckBox("Resaltar resultados");
		
		//Inicializamos botones
		buscarButton = new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		
		reemplazaButton = new Button("Reemplazar");
		reemplazaButton.setMaxWidth(Double.MAX_VALUE);
		
		reemplazaTodoButton = new Button("Reemplazar todo");
		reemplazaTodoButton.setMaxWidth(Double.MAX_VALUE);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		//Metemos los botones en un VBox
		VBox menuDerecha = new VBox(5);
		menuDerecha.getChildren().addAll(buscarButton, reemplazaButton, reemplazaTodoButton, cerrarButton, ayudaButton);
		
		//Inicializamos el GridPane
		GridPane FormerPane = new GridPane();
		FormerPane.setPadding(new Insets(5));
		FormerPane.setHgap(5);
		FormerPane.setVgap(5);
		FormerPane.addRow(0, new Label("Buscar: "), buscarText);
		FormerPane.addRow(1, new Label("Remplazar con: "), remplazarText);
		FormerPane.add(mayuMinuCheck, 1, 2);
		FormerPane.add(buscaAtrasCheck, 2, 2);
		FormerPane.add(expresionCheck, 1, 3);
		FormerPane.add(resaltaResultCheck, 2, 3);
		
		//Inicializamos el BordePane root
		BorderPane root = new BorderPane();
		root.setRight(menuDerecha);
		root.setCenter(FormerPane);
		root.setPadding(new Insets(5));
		
		Scene scene = new Scene(root, 400, 200);

		primaryStage.setTitle("Busca y remplaza");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
