package ContentHandle;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Panel {
    /**
     * Handles the JPanel for make the JForm more dynamic
     * @param container The parent container of the panel.
     * @param panel The panel wich will be inserted in container.
     * @param XSize The X size of the container.
     * @param YSize The Y size of the container.
     */
    public static void Show(JPanel container, JPanel panel, int XSize, int YSize){
        
        panel.setSize(XSize, YSize);
        panel.setLocation(0, 0);

        container.removeAll();
        container.add(panel, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
        
    }
}
