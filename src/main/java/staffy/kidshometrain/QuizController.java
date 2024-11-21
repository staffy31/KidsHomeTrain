package staffy.kidshometrain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuizController {
  @FXML
  public Label question;

  @FXML
  public Button ans1,ans2,ans3,ans4;

  int counter = 0;
  static int right = 0;
  static int wrong = 0;

  @FXML
  private void initialize(){

    loadQuestions();

  }

  private void loadQuestions() {

    if(counter == 0){
      question.setText("1. Choose the right answer for the full word of USB device? ");
      ans1.setText("United States Belgium");
      ans2.setText("Universal Serial Bus");
      ans3.setText("United Student Band");
      ans4.setText("Unique Standard Board");

    }
    else if(counter == 1){
      question.setText("2. Who was the president of Republic of Rwanda in 2019? ");
      ans1.setText("John Magufuri");
      ans2.setText("Barack Obama");
      ans3.setText("Paul Kagame");
      ans4.setText("Yoweri Kaguta Museveni");

    }
  }

  @FXML
  public void ans1clicked(ActionEvent actionEvent) {

    checkAnswer(ans1.getText().toString());
    if(checkAnswer(ans1.getText().toString())){
      right = right + 1;
    } else {
      wrong = wrong +1;
    }

    if(counter == 2){

    } else {
      counter++;
      loadQuestions();
    }
  }

  boolean checkAnswer(String answer) {

    if(counter == 0){
      if(answer.equals("Universal Serial Bus")) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }

  @FXML
  public void ans2clicked(ActionEvent actionEvent) {

  }

  @FXML
  public void ans3clicked(ActionEvent actionEvent) {

  }

  @FXML
  public void ans4clicked(ActionEvent actionEvent) {

  }
}
