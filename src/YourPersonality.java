package sample;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPanel;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class YourPersonality extends Application {

    Button startBtn,submit;
    TextField choice1Field,choice2Field,choice3Field,choice4Field,choice5Field;
    int choice1,choice2,choice3,choice4,choice5;
    Text choice1Txt,choice2Txt,choice3Txt,choice4Txt,choice5Txt,welcome;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(final Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Personality Quiz");

        startBtn = new Button();
        startBtn.setText("Start");
        welcome = new Text("You will be given a series of scenarios and asked to pick an option regarding what you would do in that situation. \n At the end of the quiz you will find your results, stats, and an explanation. \n To begin, click the start button!");





        startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nextScreen(primaryStage);
            }
        });

        //StackPane layout = new StackPane();
        GridPane layout = new GridPane();
        layout.setStyle("-fx-background-color: #D8BFD8;");
        layout.setMinSize(300, 300);
        layout.setVgap(5);
        layout.setHgap(5);
        layout.setPadding(new Insets(10, 20, 10, 10));


        layout.add(welcome,1,1);
        layout.add(startBtn,1,2);

        Scene scene = new Scene(layout, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void nextScreen(final Stage primaryStage){
        primaryStage.setTitle("Personality Quiz");
        GridPane layout = new GridPane();
        layout.setStyle("-fx-background-color: #D8BFD8;");
        layout.setPadding(new Insets(10, 20, 10, 10));

        choice1Field = new TextField();
        choice1Field.setPrefColumnCount(3);
        choice2Field = new TextField();
        choice2Field.setPrefColumnCount(3);
        choice3Field = new TextField();
        choice3Field.setPrefColumnCount(3);
        choice4Field = new TextField();
        choice4Field.setPrefColumnCount(3);
        choice5Field = new TextField();
        choice5Field.setPrefColumnCount(3);

        layout.setMinSize(300, 300);
        layout.setVgap(5);
        layout.setHgap(5);

        choice1Txt = new Text("You are on your way home and as you come closer to your house, you see smoke coming from your neighbors house, and you hear the wails for your neighbours." +
                "\n You realize that there is afire and your neighbors are trapped. " +
                "\n What do you do?\n" +
                "1. Run into your house and gather your belongings and flee in case the fire comes to your house\n" +
                "2. Call the police and wait in front of the neighbours house till they arrive\n"+
                "3. Call the police then run into the neighbors house in hopes of rescuing someone");


        layout.add(choice1Txt,0,0);
        layout.add(choice1Field,0,1);

        choice2Txt = new Text("You are sitting in a bus and waiting for your stop to come soon. " +
                "As you sit and wait, you notice an old woman who is struggling to stand with the help of her cane and nobody else seems to notice her struggle. " +
                "What do you do?" +
                "\n 4. You look the other way. No one else is helping, why should you?" +
                "\n 5. You nudge your elbow towards the person sitting next to you and gesture towards the old woman. Hopefully they get the hint." +
                "\n 6. You get up from your seat and you tell her that she can use your seat.");

        layout.add(choice2Txt,0,2);
        layout.add(choice2Field,0,3);


        choice3Txt = new Text("Your friends are fighting and you find yourself in between them. " +
                "\n You love both of your friends and value both of their friendship equally, but yuo also feel that one of your friends is on th eright side of the argument. " +
                "\n What would you do?" +
                "\n 7. You are annoyed by all this fighting and go find new friends." +
                "\n 8. You decide to stay true to yourself and support the friend whose side you believe is more reasonable" +
                "\n 9. You remain neutral in the argument and decide to stay out of the fight");

        layout.add(choice3Txt,0,4);
        layout.add(choice3Field,0,5);

        choice4Txt = new Text("You are taking a really important test which took you weeks to study for. " +
                "\n You are close to finishing when you notice the person next to you look in the sleeve of their jacket and quickly covering up when the proctor walks by. " +
                "\nThen with your detective skills you peice together that they are...cheating! " +
                "\n What do you do?" +
                "\n 10. You just pat yourself on the back for your great detective skills and leave it at that. You remain silent." +
                "\n 11. You decide to finish the test then talk to the proctor after everyone leaves" +
                "\n 12. You immediately jump up from your seat and shout out that the person next to you is cheating. Hopefully the proctor is not deaf.");

        layout.add(choice4Txt,0,6);
        layout.add(choice4Field,0,7);

        choice5Txt = new Text(" You are visited by the fairy godmother, and are granted the choice to do anything you want in your life without the fear of responsibility or debt." +
                "\n What would you do? " +
                "\n 13. Travel the world and live a nomad lifestyle" +
                "\n 14. Stay at home and read a lot of books." +
                "\n 15. Become a doctor or social worker to help all the underprivileged and sick people.");

        layout.add(choice5Txt,0,8);
        layout.add(choice5Field,0,9);


        submit = new Button();
        submit.setText("Submit the quiz");

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                choice1 = Integer.parseInt(choice1Field.getText());
                choice2 = Integer.parseInt(choice2Field.getText());
                choice3 = Integer.parseInt(choice3Field.getText());
                choice4 = Integer.parseInt(choice4Field.getText());
                choice5 = Integer.parseInt(choice5Field.getText());


                finalScreen(primaryStage); //this takes it to the final Screen!
            }
        });

        layout.add(submit,0,10);


        Scene scene = new Scene(layout, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    //finish the finalScreen
    public void finalScreen(Stage primaryStage){
        //Analyzing personality

        //Over here, take the answers (stored in choice1,choice2,choice3,choice4,choice5) and use them to determine the personality

        String output = "";

        if(choice1 == 1 && choice2 == 4 && choice3 == 7 && choice4 == 10 && choice5 == 13)
        {
            output = " You are quite a vicious person, and have a mean streak. You do what you want and do not let anyone dictate how you would like to live your life. " +
                    "\n At the same time you are a courageous person who is willing to stand your for themselves";
        }
        else if (choice1 == 1 && choice2 == 4 && choice3 == 8 && choice4 == 12 && choice5 == 13)
        {
            output = "You are on the adventurous side of life. Yet you have a complex personality." +
                    " \n Sometimes you are very timid and are going against humanity, but for the most part you are kind and outgoing.";
        }
        else if (choice1 == 1 && choice2 == 5 && choice3 == 8 && choice4 == 12 && choice5 == 14)
        {
            output = " You are a strange person. At times you are a kind person and other times, you are a little selfish and think only about yourself." +
                    "\n  Try thinking more about the people around you and help when they need it instead of only being in your own world.";
        }
        else if (choice1 == 2 && choice2 == 5 && choice3 == 8 && choice4 == 11 && choice5 == 14)
        {
            output = "You are a pretty calm person, but your main drawback is your timidness. " +
                    "\n You look for the easy way out, and be as uninvolved as possible. " +
                    "\n Your intentions are good, but it’s time you start being more expressive." ;
        }
        else if(choice1 == 2 && choice2 == 6 && choice3 == 7 && choice4 == 11 && choice5 == 14)
        {
            output = "You are a pretty normal person. " +
                    "\n Your personality identifies you as someone with various emotions." +
                    " \n You do not stick to stereotypes and react to the situation according to your mood. ";
        }
        else if(choice1 == 2 && choice2 == 4 && choice3 == 7 && choice4 == 10 && choice5 == 13)
        {
            output = "You are very selfish." +
                    " \n You only care about yourself and don’t think how your actions hurt others. " +
                    "\n Nevertheless, it can be seen that your heart is not completely made of ice. " +
                    "\n You can change and become a better person. You need channel your kind side more often.";
        }
        else if(choice1 == 3 && choice2 == 6 && choice3 == 9 && choice4 == 12 && choice5 == 15)
        {
            output = "You are a very amiable person. " +
                    "\n You put Mother Teresa to shame. " +
                    "\n You are willing to sacrifice yourself for others, and never hesitate to show your courageous side. " +
                    "\n We need more people like you in this world.\n";
        }
        else if(choice1 == 3 && choice2 == 5 && choice3 == 8 && choice4 == 12 && choice5 == 15)
        {
            output = "Your personality mainly shows that you are a kind person, but still are quite hesitant about your decisions. " +
                    "\n Try to be less timid and believe in yourself. You could do great things in this big world.  ";
        }

        else if(choice1 == 3 && choice2 == 5 && choice3 == 9 && choice4 == 11 && choice5 == 15)
        {
            output = "You are a strange person. " +
                    "\n You do like to help people but at the comfort of your time. " +
                    "It can be seen that you are a kind person so try harder to be better and be there for others. \n";
        }
        else if(choice1 == 3 && choice2 == 4 && choice3 == 9 && choice4 == 11 && choice5 == 15)
        {
           output = "You are mostly cold hearted. " +
                   "\n You are need to find the warm hearted part of you. Your kind side is evident, just bring it out more.";
        }



        else
        {
            output = " You are quite a neutral person, There is no on personality that solely identifies you. " +
                    "\n You are kind, calm, but also can be courageous and cold hearted when needed to. ";
        }




        primaryStage.setTitle("Personality Quiz");

        GridPane layout = new GridPane();
        layout.setStyle("-fx-background-color: #D8BFD8;");
        layout.setPadding(new Insets(10, 20, 10, 10));

        Text finalOutput = new Text(output); //place the final output here, showing the user his or her personality

        layout.add(finalOutput,0,0);
        Scene scene = new Scene(layout, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
