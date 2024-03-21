import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

    private int turn = 0;
        Button A1 = new Button("");
        Button A2 = new Button("");
        Button A3 = new Button("");
        Button A4 = new Button("");
        Button A5 = new Button("");

        Button B1 = new Button("");
        Button B2 = new Button("");
        Button B3 = new Button("");
        Button B4 = new Button("");
        Button B5 = new Button("");

        Button C1 = new Button("");
        Button C2 = new Button("");
        Button C3 = new Button("");
        Button C4 = new Button("");
        Button C5 = new Button("");

        Button D1 = new Button("");
        Button D2 = new Button("");
        Button D3 = new Button("");
        Button D4 = new Button("");
        Button D5 = new Button("");

        Button E1 = new Button("");
        Button E2 = new Button("");
        Button E3 = new Button("");
        Button E4 = new Button("");
        Button E5 = new Button("");

        Label label = new Label("Tic Tac Toe");

        Boolean gameOver = false;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        

        BorderPane border = new BorderPane();
        border.setCenter(gridPane);
        border.setBottom(label);

        Scene scene = new Scene(border);
        
        Insets gridPadding = new Insets(100, 100, 100, 100);
        gridPane.setPadding(gridPadding);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        A1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                if ((A1.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        A1.setText("X");
                    }
                    else{
                        A1.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        A2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                if ((A2.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        A2.setText("X");
                    }
                    else{
                        A2.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        A3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((A3.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        A3.setText("X");
                    }
                    else{
                        A3.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                    
                }
            }
            
        });

        A4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((A4.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        A4.setText("X");
                    }
                    else{
                        A4.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        A5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((A5.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        A5.setText("X");
                    }
                    else{
                        A5.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        B1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((B1.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        B1.setText("X");
                    }
                    else{
                        B1.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        B2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((B2.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        B2.setText("X");
                    }
                    else{
                        B2.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        B3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((B3.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        B3.setText("X");
                    }
                    else{
                        B3.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        B4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((B4.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        B4.setText("X");
                    }
                    else{
                        B4.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        B5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((B5.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        B5.setText("X");
                    }
                    else{
                        B5.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        C1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((C1.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        C1.setText("X");
                    }
                    else{
                        C1.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        C2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((C2.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        C2.setText("X");
                    }
                    else{
                        C2.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        C3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((C3.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        C3.setText("X");
                    }
                    else{
                        C3.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        C4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((C4.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        C4.setText("X");
                    }
                    else{
                        C4.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        C5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((C5.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        C5.setText("X");
                    }
                    else{
                        C5.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        D1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((D1.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        D1.setText("X");
                    }
                    else{
                        D1.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        D2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((D2.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        D2.setText("X");
                    }
                    else{
                        D2.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        D3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((D3.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        D3.setText("X");
                    }
                    else{
                        D3.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        D4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((D4.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        D4.setText("X");
                    }
                    else{
                        D4.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        D5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((D5.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        D5.setText("X");
                    }
                    else{
                        D5.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        E1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((E1.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        E1.setText("X");
                    }
                    else{
                        E1.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        E2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((E2.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        E2.setText("X");
                    }
                    else{
                        E2.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        E3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((E3.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        E3.setText("X");
                    }
                    else{
                        E3.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        E4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((E4.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        E4.setText("X");
                    }
                    else{
                        E4.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });

        E5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                if ((E5.getText() == "") && gameOver == false){
                    if (turn %2 == 0)
                    {
                        E5.setText("X");
                    }
                    else{
                        E5.setText("0");
                    }
                    turn++;
                    checkWinCondition();
                }
            }
            
        });


        gridPane.add(A1, 0, 0);
        gridPane.add(A2, 1, 0);
        gridPane.add(A3, 2, 0);
        gridPane.add(A4, 3, 0);
        gridPane.add(A5, 4, 0);

        gridPane.add(B1, 0, 1);
        gridPane.add(B2, 1, 1);
        gridPane.add(B3, 2, 1);
        gridPane.add(B4, 3, 1);
        gridPane.add(B5, 4, 1);

        gridPane.add(C1, 0, 2);
        gridPane.add(C2, 1, 2);
        gridPane.add(C3, 2, 2);
        gridPane.add(C4, 3, 2);
        gridPane.add(C5, 4, 2);

        gridPane.add(D1, 0, 3);
        gridPane.add(D2, 1, 3);
        gridPane.add(D3, 2, 3);
        gridPane.add(D4, 3, 3);
        gridPane.add(D5, 4, 3);

        gridPane.add(E1, 0, 4);
        gridPane.add(E2, 1, 4);
        gridPane.add(E3, 2, 4);
        gridPane.add(E4, 3, 4);
        gridPane.add(E5, 4, 4);

        stage.setTitle("Tictactoe");
        stage.setScene(scene);
        stage.show();
    }

    public void checkWinCondition(){
        // Checking X winss
        // Checking Verticals
        if ((A1.getText() == "X") &&
        (A2.getText() == "X") &&
        (A3.getText() == "X") &&
        (A4.getText() == "X") &&
        (A5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((B1.getText() == "X") &&
        (B2.getText() == "X") &&
        (B3.getText() == "X") &&
        (B4.getText() == "X") &&
        (B5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((C1.getText() == "X") &&
        (C2.getText() == "X") &&
        (C3.getText() == "X") &&
        (C4.getText() == "X") &&
        (C5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((D1.getText() == "X") &&
        (D2.getText() == "X") &&
        (D3.getText() == "X") &&
        (D4.getText() == "X") &&
        (D5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((E1.getText() == "X") &&
        (E2.getText() == "X") &&
        (E3.getText() == "X") &&
        (E4.getText() == "X") &&
        (E5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        // Horizontal X's now
        if ((A1.getText() == "X") &&
        (B1.getText() == "X") &&
        (C1.getText() == "X") &&
        (E1.getText() == "X") &&
        (D1.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((A2.getText() == "X") &&
        (B2.getText() == "X") &&
        (C2.getText() == "X") &&
        (E2.getText() == "X") &&
        (D2.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if((A3.getText() == "X") &&
        (B3.getText() == "X") &&
        (C3.getText() == "X") &&
        (E3.getText() == "X") &&
        (D3.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((A4.getText() == "X") &&
        (B4.getText() == "X") &&
        (C4.getText() == "X") &&
        (E4.getText() == "X") &&
        (D4.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((A5.getText() == "X") &&
        (B5.getText() == "X") &&
        (C5.getText() == "X") &&
        (E5.getText() == "X") &&
        (D5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        // Checking Diagonals
        if ((A1.getText() == "X") &&
        (B2.getText() == "X") &&
        (C3.getText() == "X") &&
        (D4.getText() == "X") &&
        (E5.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        if ((A5.getText() == "X") &&
        (B4.getText() == "X") &&
        (C3.getText() == "X") &&
        (D2.getText() == "X") &&
        (E1.getText() == "X")){
            System.out.println("X wins!");
            gameOver = true;
        }

        // Checking O winss
        // Checking Verticals
        if ((A1.getText() == "0") &&
        (A2.getText() == "0") &&
        (A3.getText() == "0") &&
        (A4.getText() == "0") &&
        (A5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((B1.getText() == "0") &&
        (B2.getText() == "0") &&
        (B3.getText() == "0") &&
        (B4.getText() == "0") &&
        (B5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((C1.getText() == "0") &&
        (C2.getText() == "0") &&
        (C3.getText() == "0") &&
        (C4.getText() == "0") &&
        (C5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((D1.getText() == "0") &&
        (D2.getText() == "0") &&
        (D3.getText() == "0") &&
        (D4.getText() == "0") &&
        (D5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((E1.getText() == "0") &&
        (E2.getText() == "0") &&
        (E3.getText() == "0") &&
        (E4.getText() == "0") &&
        (E5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        // Horizontal X's now
        if ((A1.getText() == "0") &&
        (B1.getText() == "0") &&
        (C1.getText() == "0") &&
        (E1.getText() == "0") &&
        (D1.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((A2.getText() == "0") &&
        (B2.getText() == "0") &&
        (C2.getText() == "0") &&
        (E2.getText() == "0") &&
        (D2.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if((A3.getText() == "0") &&
        (B3.getText() == "0") &&
        (C3.getText() == "0") &&
        (E3.getText() == "0") &&
        (D3.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((A4.getText() == "0") &&
        (B4.getText() == "0") &&
        (C4.getText() == "0") &&
        (E4.getText() == "0") &&
        (D4.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((A5.getText() == "") &&
        (B5.getText() == "0") &&
        (C5.getText() == "0") &&
        (E5.getText() == "0") &&
        (D5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        // Checking Diagonals
        if ((A1.getText() == "0") &&
        (B2.getText() == "0") &&
        (C3.getText() == "0") &&
        (D4.getText() == "0") &&
        (E5.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if ((A5.getText() == "0") &&
        (B4.getText() == "0") &&
        (C3.getText() == "0") &&
        (D2.getText() == "0") &&
        (E1.getText() == "0")){
            System.out.println("0 wins!");
            gameOver = true;
        }

        if (gameOver == true){
            label.setText("Game over");
        }
        

    }
}
