import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

/**
 * 
 */

/**
 * @author teodora.cosma
 */
public class MainPanel extends JPanel {
    
    private static final long serialVersionUID = 1L;
    
    private static final int MARGIN_SIZE = 10;
    private static final int SPACE_SIZE = 3;
    private static final int IMAGE_WIDTH = 350;
    private static final int IMAGE_HEIGHT = 125;
    
    /**
     * @param frame
     */
    public MainPanel(JFrame frame) {
        FormLayout layout = new FormLayout(
                        new ColumnSpec[] {
                                        ColumnSpec.decode(MARGIN_SIZE + "px"),
                                        // ColumnSpec.decode("10px:grow"),
                                        // ColumnSpec.decode("10px:grow"),
                                        // ColumnSpec.decode("10px:grow"),
                                        ColumnSpec.decode(IMAGE_WIDTH + "px:grow"),
                                        ColumnSpec.decode(SPACE_SIZE + "px"),
                                        ColumnSpec.decode(IMAGE_WIDTH + "px:grow"),
                                        ColumnSpec.decode(SPACE_SIZE + "px"),
                                        ColumnSpec.decode(IMAGE_WIDTH + "px:grow"),
                                        ColumnSpec.decode(MARGIN_SIZE + "px")
                        },
                        new RowSpec[] {
                                        RowSpec.decode(MARGIN_SIZE + "px"),
                                        RowSpec.decode(IMAGE_HEIGHT + "px:grow"),
                                        RowSpec.decode(SPACE_SIZE + "px"),
                                        RowSpec.decode(IMAGE_HEIGHT + "px:grow"),
                                        RowSpec.decode(SPACE_SIZE + "px"),
                                        RowSpec.decode(IMAGE_HEIGHT + "px:grow"),
                                        RowSpec.decode(MARGIN_SIZE + "px")
                        });
        PanelBuilder builder = new PanelBuilder(layout, this);
        
        CellConstraints constraints = new CellConstraints();
        
        String imagePath1 = "src/main/resources/images/birds.jpg";
        String imagePath2 = "src/main/resources/images/cat_eyes.png";
        String imagePath3 = "src/main/resources/images/comparison.jpg";
        String imagePath4 = "src/main/resources/images/flowers.jpg";
        String imagePath5 = "src/main/resources/images/galaxy.jpg";
        
        JPanel panel1 = new ImagePanel(imagePath1);
        panel1.setBackground(Color.RED);
        JPanel panel2 = new ImagePanel(imagePath2);
        panel2.setBackground(Color.GREEN);
        JPanel panel3 = new ImagePanel(imagePath3);
        panel2.setBackground(Color.GREEN);
        JPanel panel4 = new ImagePanel(imagePath4);
        panel2.setBackground(Color.GREEN);
        JPanel panel5 = new ImagePanel(imagePath5);
        panel2.setBackground(Color.GREEN);
        JPanel panel6 = new JPanel();
        panel2.setBackground(Color.GREEN);
        
        builder.add(panel1, constraints.xy(2, 2));
        builder.add(panel2, constraints.xy(4, 2));
        builder.add(panel3, constraints.xy(6, 2));
        builder.add(panel4, constraints.xy(2, 4));
        builder.add(panel5, constraints.xy(4, 4));
        builder.add(panel6, constraints.xy(6, 4));
    }
}
