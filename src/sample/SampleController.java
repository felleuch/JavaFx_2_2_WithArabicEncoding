package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;
import org.controlsfx.dialog.Dialogs;

import static org.controlsfx.dialog.Dialog.Actions.NO;
import static org.controlsfx.dialog.Dialog.Actions.YES;



public class SampleController {

    @FXML
    private TextField firstName;


    public void valider(ActionEvent actionEvent) {



        final CheckBox cbShowCancel = new CheckBox("Show Cancel Button");
        cbShowCancel.setSelected(true);
        String response = Dialogs.create()
                .title("تاكيد العملية")
                .masthead("الرجاء ادخال الاسم مرة ثانية")
                .message("هل أنت متأكد من رغبتك بفعل هذا؟")

                .showTextInput();


        /*String response =
                Dialogs.create()
                        .title("Name Guess")
                        .masthead("Name Guess" )
                        .message("Pick a name?").showChoices("Matthew", "Jonathan", "Ian", "Sue", "Hannah");*/

        System.out.println("response: " + response);

    }


    public void cancel(ActionEvent actionEvent) {

        firstName.setText("   عليكم  السلام");


    }
}




