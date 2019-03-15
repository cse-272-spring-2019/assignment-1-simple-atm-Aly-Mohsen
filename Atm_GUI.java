import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Atm_GUI extends Application {
	ArrayList<String> history = new ArrayList<String>();
	bankacc user = new bankacc(0, history);
	Validate valid = new Validate();
	
	public static void main(String[] args) {
		launch(args);
		}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label creditnumlabel = new Label("Enter your Credit Number:");
		PasswordField creditnumfield = new PasswordField();
		Button login = new Button("LOGIN");
		
		GridPane loginGrid = new GridPane();
		loginGrid.add(creditnumlabel, 0, 0);
		loginGrid.add(creditnumfield, 1, 0);
		loginGrid.add(login, 1, 1);

		
		Button back = new Button("BACK");
		
		Alert creditnumfail = new Alert(Alert.AlertType.INFORMATION);
		creditnumfail.setTitle("Warning");
		creditnumfail.setHeaderText("ERROR");
		creditnumfail.setContentText("Wrong Credit Number");
		
		Alert depositsucc = new Alert(Alert.AlertType.INFORMATION);
		depositsucc.setTitle("Deposit");
		depositsucc.setHeaderText("Transaction Succesfull!!");
		depositsucc.setContentText("congratulations!");
		
		Alert depositwithfail = new Alert(Alert.AlertType.INFORMATION);
		depositwithfail.setTitle("Warning");
		depositwithfail.setHeaderText("ERROR:UNACCEPTABLE AMOUNT");
		depositwithfail.setContentText("ONLY MULTIPLES OF 20 ARE ALLOWED");
		
		Alert withdrawsucc = new Alert(Alert.AlertType.INFORMATION);
		withdrawsucc.setTitle("Withdraw");
		withdrawsucc.setHeaderText("Transaction Succesfull!!");
		withdrawsucc.setContentText("congratulations!");
		
		Alert withdrawfail = new Alert(Alert.AlertType.INFORMATION);
		withdrawfail.setTitle("Warning");
		withdrawfail.setHeaderText("ERROR");
		withdrawfail.setContentText("You Cannot Withdraw That Amount!");
		
		Alert alphabeterror = new Alert(Alert.AlertType.INFORMATION);
		alphabeterror.setTitle("Warning");
		alphabeterror.setHeaderText("ERROR");
		alphabeterror.setContentText("your entry contains non numeric characters!!");
		
		Alert histinit = new Alert(Alert.AlertType.INFORMATION);
		histinit.setTitle("Warning");
		histinit.setHeaderText("ERROR");
		histinit.setContentText("No Previous Transactions Registered!!");
		
		Alert histinitnxt = new Alert(Alert.AlertType.INFORMATION);
		histinitnxt.setTitle("Warning");
		histinitnxt.setHeaderText("ERROR");
		histinitnxt.setContentText("No more Transactions Registered!!");
		
		Button inquire = new Button ("  INQUIRE   ");
		Button deposit = new Button ("  DEPOSIT   ");
		Button withdraw = new Button("WITHDRAW");
		Button Hist = new Button    ("  HISTORY   ");
		Label choose = new Label("KINDLY CHOOSE YOUR ACTION !! :			");
		
		TextField depositfield = new TextField();
		Label depositlabel =new Label("Enter The Required Deposit Amount:");
		Button depositsubmit = new Button("Submit");
		Button d0 = new Button("0");
		Button d1 = new Button("1");
		Button d2 = new Button("2");
		Button d3 = new Button("3");
		Button d4 = new Button("4");
		Button d5 = new Button("5");
		Button d6 = new Button("6");
		Button d7 = new Button("7");
		Button d8 = new Button("8");
		Button d9 = new Button("9");
		Button back2 = new Button("BACK");
		
		Label withdrawlabel = new Label("Enter The Required Withdraw Amount:");
		TextField withdrawfield = new TextField();
		Button back3 = new Button("BACK");
		Button withdrawsubmit = new Button("Submit");
		Button w0 = new Button("0");
		Button w1 = new Button("1");
		Button w2 = new Button("2");
		Button w3 = new Button("3");
		Button w4 = new Button("4");
		Button w5 = new Button("5");
		Button w6 = new Button("6");
		Button w7 = new Button("7");
		Button w8 = new Button("8");
		Button w9 = new Button("9");
		
		GridPane methgrid = new GridPane();
		methgrid.add(choose, 0, 0);
		methgrid.add(inquire, 2, 0);
		methgrid.add(deposit, 1, 0);
		methgrid.add(withdraw, 1, 1);
		methgrid.add(Hist, 2, 1);
		
		GridPane depositgrid = new GridPane();
		depositgrid.add(depositlabel, 0, 0);
		depositgrid.add(depositfield, 1, 0);
		depositgrid.add(d1,3,2);
		depositgrid.add(d2,4,2);
		depositgrid.add(d3,5,2);
		depositgrid.add(d4,3,3);
		depositgrid.add(d5,4,3);
		depositgrid.add(d6,5,3);
		depositgrid.add(d7,3,4);
		depositgrid.add(d8,4,4);
		depositgrid.add(d9,5,4);
		depositgrid.add(d0,4,5);
		depositgrid.add(back2, 0, 1);
		depositgrid.add(depositsubmit,2, 0);

		GridPane withdrawgrid = new GridPane();
		withdrawgrid.add(withdrawlabel, 0, 0);
		withdrawgrid.add(withdrawfield, 1, 0);
		withdrawgrid.add(withdrawsubmit, 2, 0);
		withdrawgrid.add(back3,0, 1);
		withdrawgrid.add(w1,3,2);
		withdrawgrid.add(w2,4,2);
		withdrawgrid.add(w3,5,2);
		withdrawgrid.add(w4,3,3);
		withdrawgrid.add(w5,4,3);
		withdrawgrid.add(w6,5,3);
		withdrawgrid.add(w7,3,4);
		withdrawgrid.add(w8,4,4);
		withdrawgrid.add(w9,5,4);
		withdrawgrid.add(w0,4,5);
		
		Button previous = new Button("Previous");
		Button next = new Button("Next");
		Label currenthist = new Label();
		Button back4 = new Button("BACK");

		GridPane histgrid = new GridPane();
		histgrid.add(currenthist, 0, 0);
		histgrid.add(previous, 0, 1);
		histgrid.add(next, 1, 1);
		histgrid.add(back4, 1, 2);

		Label inquirelabel = new Label();
		GridPane inquiregrid = new GridPane();
		inquiregrid.add(inquirelabel, 0, 0);
		inquiregrid.add(back, 0, 1);
		
		Scene histscene = new Scene (histgrid,300,200);
		Scene inquirescene = new Scene(inquiregrid,300,200);
		Scene loginscene = new Scene(loginGrid,300,200);
		Scene methscene = new Scene(methgrid,600,400);
		Scene depositscene = new Scene(depositgrid,500,300);
		Scene withdrawscene = new Scene(withdrawgrid,600,400);
		
		primaryStage.setScene(loginscene);
		
		back.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(methscene);
			}});
		back2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(methscene);				
			}});	
		back3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(methscene);
			}});
		back4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				primaryStage.setScene(methscene);
				user.setIndex2(0);
			}
		});
		login.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String CreditNumber= creditnumfield.getText();
				if(valid.CreditnumValidate(CreditNumber)==1)
					primaryStage.setScene(methscene);
				else 
					creditnumfail.show();				
			}});
		deposit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(depositscene);
			}});
		depositsubmit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String depvalstr =depositfield.getText();
				if (depvalstr.matches("[0-9]+"))
				{
					int depvalint = Integer.parseInt(depvalstr);
					boolean div_20 = valid.depWithValid(depvalint);
					if (div_20==true)
					{
						user.Deposit(depvalint);
						user.history("Deposited", depvalstr);
						user.Index1++;
						user.setIndex2(0);
						depositsucc.show();
					}
					else
					depositwithfail.show();
				}
				else
					alphabeterror.show();

				}});
		withdraw.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				primaryStage.setScene(withdrawscene);			
			}
		});
		withdrawsubmit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String withvalstr = withdrawfield.getText();
				if  (withvalstr.matches("[0-9]+"))
				{
					int withvalint = Integer.parseInt(withvalstr);
				
					boolean div_20 = valid.depWithValid(withvalint);
					boolean positive;
					if (div_20==true)
					{
						positive=user.Withdraw(withvalint);
				
						if (positive==false)
						withdrawfail.show();
						else
					{
						user.history("Withdrawn", withvalstr);
						user.Index1++;
						user.setIndex2(0);
						withdrawsucc.show();
					}
					}
					else
						depositwithfail.show();
				}
				else
					alphabeterror.show();
				}});
		inquire.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				inquirelabel.setText("Your Current Balance is:"+user.getBalance());
				double inqdouble = user.getBalance();
				String inqstring = Double.toString(inqdouble);
				user.history("Inquery",inqstring);
				user.Index1++;
				user.setIndex2(0);
				primaryStage.setScene(inquirescene);
			}});
		Hist.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (user.getIndex1()==0)
					histinit.show();
				else
				{
				currenthist.setText(""+history.get(user.Index1-1));
				primaryStage.setScene(histscene);

				}
			}});
		previous.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if ((user.Index2<=3)&&(user.Index2 + 1 != user.Index1))
					{user.Index2++;
					currenthist.setText(""+history.get(user.Index1-user.Index2-1));
				}
				else
					
				{
					histinit.show();
					previous.setDisable(true);
				}
			}});
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if ((user.Index2 > 0)&&(user.Index1!=0))
				{
					user.Index2--;
					currenthist.setText(""+history.get(user.Index1-user.Index2-1));
				}
				else
				{
					histinitnxt.show();
					next.setDisable(true);
				}
			}});
		d0.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("0");
				
			}
		});
		d1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("1");
				
			}
		});
		d2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("2");
				
			}
		});
		d3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("3");
				
			}
		});
		d4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("4");
				
			}
		});
		d5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("5");
				
			}
		});
		d6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("6");
				
			}
		});
		d7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("7");
				
			}
		});
		d8.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("8");
				
			}
		});
		d9.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositfield.appendText("9");
				}});
		w0.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("0");
				
			}
		});
		w1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("1");
				
			}
		});
		w2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("2");
				
			}
		});
		w3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("3");
				
			}
		});
		w4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("4");
				
			}
		});
		w5.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("5");
				
			}
		});
		w6.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("6");
				
			}
		});
		w7.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("7");
				
			}
		});
		w8.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("8");
				
			}
		});
		w9.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				withdrawfield.appendText("9");
				}});

		primaryStage.show();
	}
}
