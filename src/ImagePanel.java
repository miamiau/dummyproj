import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.builder.PanelBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

/**
 * @author teodora.cosma
 */
public class ImagePanel extends JPanel {
    
    private static final long serialVersionUID = 1L;
    
    private static final int IMAGE_WIDTH = 300;
    private static final int IMAGE_HEIGHT = 100;
    
    
    private String imagePath;
    
    public ImagePanel(String imagePath) {
        this.imagePath = imagePath;
        
        definePanel();
    }
    
    private void definePanel() {
        FormLayout layout = new FormLayout(
                        new ColumnSpec[] {
                                        ColumnSpec.decode("3px"),
                                        ColumnSpec.decode(IMAGE_WIDTH + "px:grow"),
                                        ColumnSpec.decode("3px")
                        },
                        new RowSpec[] {
                                        RowSpec.decode("3px"),
                                        RowSpec.decode(IMAGE_HEIGHT + "px:grow"),
                                        RowSpec.decode("3px")
                        });
        PanelBuilder builder = new PanelBuilder(layout, this);
        
        CellConstraints constraints = new CellConstraints();
        
        JLabel imageLabel = new JLabel("bla bla", new ImageIcon(imagePath), JLabel.CENTER);
        
        builder.add(imageLabel, constraints.xy(2, 2));
    }
    
}
