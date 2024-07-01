package TxtField;

import javax.swing.JTextField;

public class Focus {

    /**
     * Handles the <b>focusGainEvent</b> of a JTextField inside the project
     * <p>
     * Mimics the function of a field that is emptied when the cursor is positioned.
     * <p>
     * Field.setForeground is handled itself by ColorSheme
     * <p>         
     * <b>Default text color:</b> UMBER
     * @author Kris
     * @param field The target JTextField.
     * @param fieldPlaceholder The String of the JTextField placeholder (example: "Usuario:").
     */
    public static void Gain(JTextField field, String fieldPlaceholder){
        if(fieldPlaceholder.equals(field.getText().toLowerCase())){
        field.setForeground(ColorScheme.SetColor.UMBER);
        field.setText("");
        }
    }

    /**
     * Handles the <b>focusLostEvent</b> of a JTextField inside the project
     * <p>
     * When the field is blank and replaces it with a placeholder.
     * <p>
     * Otherwise it will set the default text color.
     * <p>
     * field.setForeground is handled itself by ColorSheme
     * <p>
     * <b>Primary color:</b> ROSE_TAUPE
     * <p>
     * <b>Default text color:</b> UMBER
     * @author Kris
     * @param  field the target JTextField.
     * @param fieldPlaceholder the desired placeholder (example: "Usuario:")
     */
    public static void Lost(JTextField field, String fieldPlaceholder){
        if(field.getText().isBlank()){
            field.setForeground(ColorScheme.SetColor.ROSE_TAUPE);
            field.setText(fieldPlaceholder);
        }
        else{
            field.setForeground(ColorScheme.SetColor.UMBER);
        }
    }
}
