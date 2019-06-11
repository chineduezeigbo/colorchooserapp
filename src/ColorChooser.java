
import java.awt.Color;

public class ColorChooser extends javax.swing.JFrame
{

    public ColorChooser()
    {
        initComponents();
    }
    
    public void changeColor()
    {
        colorJPanel.setBackground(new Color(redJSlider.getValue(), greenJSlider.getValue(), blueJSlider.getValue()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        redJSlider = new javax.swing.JSlider();
        greenJSlider = new javax.swing.JSlider();
        blueJSlider = new javax.swing.JSlider();
        redJLabel = new javax.swing.JLabel();
        greenJLabel = new javax.swing.JLabel();
        blueJLabel = new javax.swing.JLabel();
        redJTextField = new javax.swing.JTextField();
        greenJTextField = new javax.swing.JTextField();
        blueJTextField = new javax.swing.JTextField();
        colorJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        redJSlider.setMaximum(255);
        redJSlider.setValue(0);
        redJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                redJSliderStateChanged(evt);
            }
        });

        greenJSlider.setMaximum(255);
        greenJSlider.setValue(0);
        greenJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                greenJSliderStateChanged(evt);
            }
        });

        blueJSlider.setMaximum(255);
        blueJSlider.setValue(0);
        blueJSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                blueJSliderStateChanged(evt);
            }
        });

        redJLabel.setText("Red");

        greenJLabel.setText("Green");

        blueJLabel.setText("Blue");

        redJTextField.setColumns(4);
        redJTextField.setText("0");

        greenJTextField.setColumns(4);
        greenJTextField.setText("0");

        blueJTextField.setColumns(4);
        blueJTextField.setText("0");

        colorJPanel.setBackground(java.awt.Color.black);

        javax.swing.GroupLayout colorJPanelLayout = new javax.swing.GroupLayout(colorJPanel);
        colorJPanel.setLayout(colorJPanelLayout);
        colorJPanelLayout.setHorizontalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        colorJPanelLayout.setVerticalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(redJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(redJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(greenJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(greenJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(blueJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blueJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(colorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(greenJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(greenJSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_redJSliderStateChanged
        
        redJTextField.setText(String.valueOf(redJSlider.getValue()));
        changeColor();
    }//GEN-LAST:event_redJSliderStateChanged

    private void greenJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_greenJSliderStateChanged
        
        greenJTextField.setText(String.valueOf(greenJSlider.getValue()));
        changeColor();
    }//GEN-LAST:event_greenJSliderStateChanged

    private void blueJSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_blueJSliderStateChanged
        
        blueJTextField.setText(String.valueOf(blueJSlider.getValue()));
        changeColor();
    }//GEN-LAST:event_blueJSliderStateChanged

    
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ColorChooser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueJLabel;
    private javax.swing.JSlider blueJSlider;
    private javax.swing.JTextField blueJTextField;
    private javax.swing.JPanel colorJPanel;
    private javax.swing.JLabel greenJLabel;
    private javax.swing.JSlider greenJSlider;
    private javax.swing.JTextField greenJTextField;
    private javax.swing.JLabel redJLabel;
    private javax.swing.JSlider redJSlider;
    private javax.swing.JTextField redJTextField;
    // End of variables declaration//GEN-END:variables
}
