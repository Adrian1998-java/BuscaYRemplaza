package dad.BuscaYRemplaza;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
	CheckBox esxpresionCheck;
	CheckBox resaltaResultCheck;
	
	TextField buscarText;
	TextField remplazarText;
	

	
	@Override
	public void start(Stage primaryStage) throws Exception {

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
		
		VBox menuDerecha = new VBox(5);
		menuDerecha.getChildren().addAll(buscarButton, reemplazaButton, reemplazaTodoButton, cerrarButton, ayudaButton);
		
		
		
		
		BorderPane root = new BorderPane();
		root.setRight(menuDerecha);
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
