# Resume
simple lib for handling java colors in RGB color space on the  [project Sistema de Empleados](https://github.com/RitzzRiver/SistemaDeEmpleados)

the lib include this Color scheme:

<img src="./App.png" width=600/>

## use for color
```JAVA
JavaSwingComponent.setBackground(ColorScheme.SetColor.{desired color});
```

## use for show a pannel
You must create a JFrame to display another panels
```JAVA
package ProjectHandler;

public class MainContent extends javax.swing.JFrame {

  // content window for modules in   size 
  int contentWidth = 1080;
  int contentHeight = 640;

  // module list
  Module1 m1 = new Module1();

  //the event 
  private void btn_displayModule1MouseClicked(java.awt.event.MouseEvent evt) {
    /**
     * @param displaycontainer The parent container of the panel.
     * @param m1 The panel wich will be inserted in container.
     * @param contentWidth The X size of the container.
     * @param contentHeight The Y size of the container.
     */
    ContentHandle.Panel.Show(displaycontent, m1, contentWidth, contentHeight);
  }
  
}
```

## use to manage focus-onfocus event
```JAVA
package ProjectHandler;

public class MainContent extends javax.swing.JFrame {

    //the event
    private void JTxtPanelFocusGained(java.awt.event.FocusEvent evt) {
        /**
         * @param JTxtPanel is the target JTxtPanel.
         * @param placeholder is the text to check with the JTxtPanel.
         */
        TxtField.Focus.Gain(JTxtPanel, placeholder);
    }

    private void JTxtPanelFocusLost(java.awt.event.FocusEvent evt) {
        /**
         * @param JTxtPanel is the target JTxtPanel.
         * @param placeholder is the text to replace with if the JTxtPanel is empty.
         */
        TxtField.Focus.Lost(JTxtPanel, placeholder);
    }
  
}
```