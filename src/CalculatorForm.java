
import javax.swing.JOptionPane;

public class CalculatorForm extends javax.swing.JFrame {

    private Object secondNumber;
    private String val;

    public CalculatorForm() {
        initComponents();
        setTitle("Calculator");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sccondNumber = new javax.swing.JTextField();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        multipleButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        answerLabel = new javax.swing.JLabel();
        sinButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        taninvButton = new javax.swing.JButton();
        sininvButton = new javax.swing.JButton();
        cosinvButton = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        persentButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        cuberootButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        etoxButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        lnButton = new javax.swing.JButton();
        xinverseButton = new javax.swing.JButton();
        decButton = new javax.swing.JButton();
        B2D = new javax.swing.JButton();
        O2D = new javax.swing.JButton();
        H2D = new javax.swing.JButton();
        dtoOButton = new javax.swing.JButton();
        DtoHButton = new javax.swing.JButton();
        B2O = new javax.swing.JButton();
        B2H = new javax.swing.JButton();
        O2B = new javax.swing.JButton();
        O2H = new javax.swing.JButton();
        H2B = new javax.swing.JButton();
        H2O = new javax.swing.JButton();
        nCr = new javax.swing.JButton();
        nPr = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Number");

        firstNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        jLabel2.setText("Second Number");

        plusButton.setText("+");
        plusButton.setToolTipText("add");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setText("-");
        minusButton.setToolTipText("subtract");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        multipleButton.setText("*");
        multipleButton.setToolTipText("mul");
        multipleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleButtonActionPerformed(evt);
            }
        });

        divideButton.setText("/");
        divideButton.setToolTipText("div");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        answerLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        answerLabel.setText("The Answer is:");

        sinButton.setText("Sin");
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        cosButton.setText("Cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        tanButton.setText("tan");
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        taninvButton.setText("tan_in");
        taninvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taninvButtonActionPerformed(evt);
            }
        });

        sininvButton.setText("sin_in");
        sininvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sininvButtonActionPerformed(evt);
            }
        });

        cosinvButton.setText("cos_in");
        cosinvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosinvButtonActionPerformed(evt);
            }
        });

        factorialButton.setText("!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        persentButton.setText("%");
        persentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persentButtonActionPerformed(evt);
            }
        });

        rootButton.setText("Sq_Root");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        cuberootButton.setText("Cu_Root");
        cuberootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootButtonActionPerformed(evt);
            }
        });

        powerButton.setText("^");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        etoxButton.setText("E^X");
        etoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etoxButtonActionPerformed(evt);
            }
        });

        logButton.setText("Log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        lnButton.setText("Ln");
        lnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnButtonActionPerformed(evt);
            }
        });

        xinverseButton.setText("X^-1");
        xinverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xinverseButtonActionPerformed(evt);
            }
        });

        decButton.setText("D2B");
        decButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decButtonActionPerformed(evt);
            }
        });

        B2D.setText("B2D");
        B2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2DActionPerformed(evt);
            }
        });

        O2D.setText("O2D");
        O2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2DActionPerformed(evt);
            }
        });

        H2D.setText("H2D");
        H2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2DActionPerformed(evt);
            }
        });

        dtoOButton.setText("D2O");
        dtoOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtoOButtonActionPerformed(evt);
            }
        });

        DtoHButton.setText("D2H");
        DtoHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DtoHButtonActionPerformed(evt);
            }
        });

        B2O.setText("B2O");
        B2O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2OActionPerformed(evt);
            }
        });

        B2H.setText("B2H");
        B2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2HActionPerformed(evt);
            }
        });

        O2B.setText("O2B");
        O2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2BActionPerformed(evt);
            }
        });

        O2H.setText("O2H");
        O2H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2HActionPerformed(evt);
            }
        });

        H2B.setText("H2B");
        H2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2BActionPerformed(evt);
            }
        });

        H2O.setText("H2O");
        H2O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2OActionPerformed(evt);
            }
        });

        nCr.setText("nCr");
        nCr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCrActionPerformed(evt);
            }
        });

        nPr.setText("nPr");
        nPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(minusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sccondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(multipleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(answerLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taninvButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sininvButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cosinvButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(persentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rootButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(xinverseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etoxButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(powerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cuberootButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(factorialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(decButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(dtoOButton)
                        .addGap(18, 18, 18)
                        .addComponent(DtoHButton)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(B2D, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(O2D, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(H2D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nCr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(H2B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2O, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(O2B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(O2H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(H2O, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B2H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton)
                    .addComponent(multipleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sccondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton)
                    .addComponent(divideButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinButton)
                    .addComponent(cosinvButton)
                    .addComponent(powerButton)
                    .addComponent(decButton)
                    .addComponent(dtoOButton)
                    .addComponent(DtoHButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cosButton)
                    .addComponent(etoxButton)
                    .addComponent(xinverseButton)
                    .addComponent(B2D)
                    .addComponent(B2O)
                    .addComponent(B2H))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanButton)
                    .addComponent(persentButton)
                    .addComponent(logButton)
                    .addComponent(O2D)
                    .addComponent(O2B)
                    .addComponent(O2H))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taninvButton)
                    .addComponent(rootButton)
                    .addComponent(lnButton)
                    .addComponent(H2D)
                    .addComponent(H2B)
                    .addComponent(H2O))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sininvButton)
                    .addComponent(cuberootButton)
                    .addComponent(factorialButton)
                    .addComponent(nCr)
                    .addComponent(nPr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(answerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
    }//GEN-LAST:event_plusButtonActionPerformed
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sum = number1 + number2;
        this.answerLabel.setText("The answer is:" + sum);
    }

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sum = number1 - number2;
        this.answerLabel.setText("The answer is:" + sum);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multipleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sum = number1 * number2;
        this.answerLabel.setText("The answer is:" + sum);
    }//GEN-LAST:event_multipleButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sum = number1 / number2;
        this.answerLabel.setText("The answer is:" + sum);
    }//GEN-LAST:event_divideButtonActionPerformed

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinButtonActionPerformed
        double degrees;
        try {

            degrees = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double radians = Math.toRadians(degrees);
        double answer = Math.sin(radians);
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_sinButtonActionPerformed

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        double degrees;
        try {

            degrees = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double radians = Math.toRadians(degrees);
        double answer = Math.cos(radians);
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_cosButtonActionPerformed

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanButtonActionPerformed
        double degrees;
        try {

            degrees = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double radians = Math.toRadians(degrees);
        double answer = Math.tan(radians);
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_tanButtonActionPerformed

    private void taninvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taninvButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double answer = Math.toDegrees(Math.atan(number));
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_taninvButtonActionPerformed

    private void sininvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sininvButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double answer = Math.toDegrees(Math.asin(number));
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_sininvButtonActionPerformed

    private void cosinvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosinvButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double answer = Math.toDegrees(Math.acos(number));
        this.answerLabel.setText("The answer is:" + answer);
    }//GEN-LAST:event_cosinvButtonActionPerformed

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed

        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        this.answerLabel.setText("The answer is:" + fact);

    }//GEN-LAST:event_factorialButtonActionPerformed

    private void persentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persentButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double sum = (number1 * number2) / 100;
        this.answerLabel.setText("The answer is:" + sum);
    }//GEN-LAST:event_persentButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + Math.sqrt(number));
    }//GEN-LAST:event_rootButtonActionPerformed

    private void cuberootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + Math.cbrt(number));
    }//GEN-LAST:event_cuberootButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        double number1, number2;
        try {
            number1 = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            number2 = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double i, power = 1;
        for (i = 1; i <= number2; i++) {
            power = power * number1;
        }
        this.answerLabel.setText("The answer is:" + power);
    }//GEN-LAST:event_powerButtonActionPerformed

    private void etoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etoxButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + Math.exp(number));
    }//GEN-LAST:event_etoxButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + Math.log10(number));
    }//GEN-LAST:event_logButtonActionPerformed

    private void lnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + (Math.log10(number)) * 2.303);
    }//GEN-LAST:event_lnButtonActionPerformed

    private void xinverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xinverseButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + (1 / number));
    }//GEN-LAST:event_xinverseButtonActionPerformed

    private void decButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String binary = Integer.toBinaryString((int) number);
        this.answerLabel.setText("The answer is:" + binary);
    }//GEN-LAST:event_decButtonActionPerformed

    private void dtoOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtoOButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String octal = Integer.toOctalString((int) number);
        this.answerLabel.setText("The answer is:" + octal);
    }//GEN-LAST:event_dtoOButtonActionPerformed

    private void DtoHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DtoHButtonActionPerformed
        double number;
        try {

            number = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String hexa = Integer.toHexString((int) number);
        this.answerLabel.setText("The answer is:" + hexa);
    }//GEN-LAST:event_DtoHButtonActionPerformed

    private void B2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2DActionPerformed
        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String numberAsString = Integer.toString(number);
        this.answerLabel.setText("The answer is:" + Integer.parseInt(numberAsString, 2));
    }//GEN-LAST:event_B2DActionPerformed

    private void B2OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2OActionPerformed
        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String numberAsString = Integer.toString(number);
        long l = Long.parseLong(numberAsString, 2);
        System.out.println(Long.toOctalString(l));
        this.answerLabel.setText("The answer is:" + Long.toOctalString(l));
    }//GEN-LAST:event_B2OActionPerformed

    private void B2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2HActionPerformed
        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String numberAsString = Integer.toString((int) number);
        int decimal = Integer.parseInt(numberAsString, 2);
        String hexStr = Integer.toString(decimal, 16);
        this.answerLabel.setText("The answer is:" + hexStr);
    }//GEN-LAST:event_B2HActionPerformed

    private void O2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2DActionPerformed
        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int i = 0, decnum = 0;
        while (number != 0) {
            decnum = decnum + (number % 10) * (int) Math.pow(8, i);
            i++;
            number = number / 10;
        }

        this.answerLabel.setText("The answer is:" + decnum);
    }//GEN-LAST:event_O2DActionPerformed


    private void O2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2BActionPerformed

        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String octal = Integer.toString((int) number);

        int binary = 0;
        for (int i = 0; i < octal.length(); i++) {
            char octalDigit = octal.charAt(i);
            int octalDigitValue = octalDigit - '0';
            // Octal must be 0 - 7
            if (0 <= octalDigitValue && octalDigitValue <= 7) {
                binary = binary << 3 + octalDigitValue;
            } else {
                throw new NumberFormatException("Invalid octal number " + octal);
            }
        }
        this.answerLabel.setText("The answer is:" + binary);
    }//GEN-LAST:event_O2BActionPerformed

    private void O2HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2HActionPerformed
        int number;
        try {

            number = Integer.parseInt(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String input = Integer.toString((int) number);

        String hex = Long.toHexString(Long.parseLong(input, 8));
        this.answerLabel.setText("The answer is:" + hex);
    }//GEN-LAST:event_O2HActionPerformed

    private void H2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2DActionPerformed
        String number;
        try {   
                  number  = this.firstNumber.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String input = number;
        this.answerLabel.setText("The answer is:" + hex2decimal(input));
    }//GEN-LAST:event_H2DActionPerformed

 public static int hex2decimal(String s) {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++) {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
         }
    private void nCrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCrActionPerformed

        double n, r;
        try {
            n = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            r = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + (fact((int) n) / (fact((int) (n - r)) * fact((int) r))));
    }//GEN-LAST:event_nCrActionPerformed

    private void nPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPrActionPerformed

        double n, r;
        try {
            n = Double.parseDouble(
                    this.firstNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            r = Double.parseDouble(
                    this.sccondNumber.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.answerLabel.setText("The answer is:" + (fact((int) n) / (fact((int) (n - r)))));
    }//GEN-LAST:event_nPrActionPerformed
     public static int fact(int num) {
        int fact = 1, i;
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    private void H2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2BActionPerformed
       String number;
        try {   
                  number  = this.firstNumber.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String input = number;      
        int decimal = Integer.parseInt(input, 16);     
        String binary = Integer.toBinaryString(decimal);
        this.answerLabel.setText("The answer is:" + binary);
    }//GEN-LAST:event_H2BActionPerformed

    private void H2OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2OActionPerformed
         String number;
        try {   
                  number  = this.firstNumber.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "The number is not correct", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String input = number;      
        int decimal = Integer.parseInt(input, 16);     
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        this.answerLabel.setText("The answer is:" + octal);
    }//GEN-LAST:event_H2OActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B2D;
    private javax.swing.JButton B2H;
    private javax.swing.JButton B2O;
    private javax.swing.JButton DtoHButton;
    private javax.swing.JButton H2B;
    private javax.swing.JButton H2D;
    private javax.swing.JButton H2O;
    private javax.swing.JButton O2B;
    private javax.swing.JButton O2D;
    private javax.swing.JButton O2H;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton cosinvButton;
    private javax.swing.JButton cuberootButton;
    private javax.swing.JButton decButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dtoOButton;
    private javax.swing.JButton etoxButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lnButton;
    private javax.swing.JButton logButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multipleButton;
    private javax.swing.JButton nCr;
    private javax.swing.JButton nPr;
    private javax.swing.JButton persentButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JTextField sccondNumber;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton sininvButton;
    private javax.swing.JButton tanButton;
    private javax.swing.JButton taninvButton;
    private javax.swing.JButton xinverseButton;
    // End of variables declaration//GEN-END:variables
}
