/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clarityapp;

/*hello*/
/*just a test to see if it works, and it does*/
//hello test

/**
 *
 * @author Andre
 */
public class ClarityGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClarityGUI
     */
    public ClarityGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        descLbl = new javax.swing.JLabel();
        formBtn = new javax.swing.JButton();
        calcBtn = new javax.swing.JButton();
        quizBtn = new javax.swing.JButton();
        aGameBtn = new javax.swing.JButton();
        goalBtn = new javax.swing.JButton();
        nutriGame = new javax.swing.JButton();
        quizDescLbl = new javax.swing.JLabel();
        goalDescLbl = new javax.swing.JLabel();
        nutriGameDescLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        calcDescLbl = new javax.swing.JLabel();
        anxietyDescLbl = new javax.swing.JLabel();
        healthLbl = new javax.swing.JLabel();
        mentalLbl = new javax.swing.JLabel();
        nutriLbl = new javax.swing.JLabel();
        formDescLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 700));

        descLbl.setText("Let us Calculate your Mental Health and have fun doing so!");

        formBtn.setText("Form");
        formBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formBtnActionPerformed(evt);
            }
        });

        calcBtn.setText("Calculator");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });

        quizBtn.setText("Quiz");
        quizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizBtnActionPerformed(evt);
            }
        });

        aGameBtn.setText("Anxiety Game");
        aGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aGameBtnActionPerformed(evt);
            }
        });

        goalBtn.setText("Goal List");
        goalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalBtnActionPerformed(evt);
            }
        });

        nutriGame.setText("Nutrition Game");
        nutriGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutriGameActionPerformed(evt);
            }
        });

        quizDescLbl.setText("Test your Mental Health");

        goalDescLbl.setText("Make your own Goals!");

        nutriGameDescLbl.setText("Guess the Calories");

        titleLbl.setText("                        Clarity");
        titleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        calcDescLbl.setText("Calculate Nutrition");

        anxietyDescLbl.setText("Spot the problems!");

        healthLbl.setText("Health & Wellness");

        mentalLbl.setText("Mental Health");

        nutriLbl.setText("Nutrition");

        formDescLbl.setText("Take part in the Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(goalBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(healthLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(formDescLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(goalDescLbl)
                                    .addComponent(formBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anxietyDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mentalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(nutriLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quizDescLbl)
                                            .addComponent(quizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nutriGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(calcDescLbl)
                                            .addComponent(calcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nutriGameDescLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(descLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mentalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutriLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizBtn)
                    .addComponent(calcBtn)
                    .addComponent(formBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quizDescLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalBtn)
                    .addComponent(aGameBtn)
                    .addComponent(nutriGame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anxietyDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutriGameDescLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        ClarityGUI cg= new ClarityGUI();
        cg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void formBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formBtnActionPerformed
        // TODO add your handling code here:
        FormJFrame fj= new FormJFrame();
        fj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formBtnActionPerformed

    private void quizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizBtnActionPerformed
        QuizJFrame qj= new QuizJFrame();
        qj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quizBtnActionPerformed

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        CalculatorJFrame cf= new CalculatorJFrame();
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_calcBtnActionPerformed

    private void goalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalBtnActionPerformed
        GoalJFrame gf= new GoalJFrame();
        gf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goalBtnActionPerformed

    private void aGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aGameBtnActionPerformed
        AnxietyJFrame af= new AnxietyJFrame();
        af.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aGameBtnActionPerformed

    private void nutriGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutriGameActionPerformed
        NutritionJFrame nf= new NutritionJFrame();
        nf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nutriGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClarityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClarityGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aGameBtn;
    private javax.swing.JLabel anxietyDescLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcBtn;
    private javax.swing.JLabel calcDescLbl;
    private javax.swing.JLabel descLbl;
    private javax.swing.JButton formBtn;
    private javax.swing.JLabel formDescLbl;
    private javax.swing.JButton goalBtn;
    private javax.swing.JLabel goalDescLbl;
    private javax.swing.JLabel healthLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel mentalLbl;
    private javax.swing.JButton nutriGame;
    private javax.swing.JLabel nutriGameDescLbl;
    private javax.swing.JLabel nutriLbl;
    private javax.swing.JButton quizBtn;
    private javax.swing.JLabel quizDescLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
