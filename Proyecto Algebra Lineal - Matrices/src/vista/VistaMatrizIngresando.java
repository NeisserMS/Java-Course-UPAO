package vista;

import controlador.MatrizControlador;
import javax.swing.JOptionPane;
import modelo.Matriz;
import modelo.Operacion;

public class VistaMatrizIngresando extends javax.swing.JFrame {

    private Matriz matrizA;
    private Matriz matrizB;
    private Matriz matrizC;

    public VistaMatrizIngresando() {
        initComponents();
        iniciarComponentesVentana();
        this.setLocationRelativeTo(null);//
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaMatrizB = new javax.swing.JTextArea();
        jtxfMatrizBNroFilas = new javax.swing.JTextField();
        jtxfMatrizBNroColumnas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnIngresarValoresMatrizB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaMatrizA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxfMatrizANroFilas = new javax.swing.JTextField();
        jtxfMatrizANroColumnas = new javax.swing.JTextField();
        jbtnIngresarValoresMatrizA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaMatrizC = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jcmbxOperacion = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Matriz B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jtxaMatrizB.setColumns(20);
        jtxaMatrizB.setEditable(false);
        jtxaMatrizB.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxaMatrizB.setRows(5);
        jScrollPane1.setViewportView(jtxaMatrizB);

        jtxfMatrizBNroFilas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxfMatrizBNroColumnas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("#COLUMNAS:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("#FILAS:");

        jbtnIngresarValoresMatrizB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnIngresarValoresMatrizB.setText("Ingresar Valores a la Matriz B");
        jbtnIngresarValoresMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarValoresMatrizBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxfMatrizBNroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jbtnIngresarValoresMatrizB, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfMatrizBNroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxfMatrizBNroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtxfMatrizBNroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnIngresarValoresMatrizB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Matriz A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jtxaMatrizA.setColumns(20);
        jtxaMatrizA.setEditable(false);
        jtxaMatrizA.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxaMatrizA.setRows(5);
        jScrollPane2.setViewportView(jtxaMatrizA);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("#FILAS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("#COLUMNAS:");

        jtxfMatrizANroFilas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxfMatrizANroColumnas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnIngresarValoresMatrizA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnIngresarValoresMatrizA.setText("Ingresar Valores a la Matriz A");
        jbtnIngresarValoresMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarValoresMatrizAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxfMatrizANroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(jbtnIngresarValoresMatrizA, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfMatrizANroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxfMatrizANroFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtxfMatrizANroColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnIngresarValoresMatrizA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Matriz C", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jtxaMatrizC.setColumns(20);
        jtxaMatrizC.setEditable(false);
        jtxaMatrizC.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxaMatrizC.setRows(5);
        jScrollPane3.setViewportView(jtxaMatrizC);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Seleccione la Operación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N

        jcmbxOperacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbxOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Multiplicación", "Determinante", "Inversa", "Adjunta", "Transpuesta", "Diagonal", "Resta" }));
        jcmbxOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbxOperacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcmbxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jcmbxOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addComponent(jButton1)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbxOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbxOperacionActionPerformed

        int opcion;
        opcion = 1 + jcmbxOperacion.getSelectedIndex();
        switch (opcion) {
            case 1:
                matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());
                matrizC = Operacion.suma(matrizA, matrizB);
                this.mostrarResultadoEnMatrizC();
                break;
            case 2:
                matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());
                matrizC = Operacion.multiplicacion(matrizA, matrizB);
                this.mostrarResultadoEnMatrizC();
                break;
            case 3:
                this.jtxaMatrizC.setText(Operacion.determinante(matrizA));
                break;
            case 4:
                this.jtxaMatrizC.setText(Operacion.inversa(matrizA));
                break;
            case 5:
                this.jtxaMatrizC.setText(Operacion.adjunta(matrizA));
                break;
            case 6:
                this.jtxaMatrizC.setText(Operacion.transpuesta(matrizA));
                break;
            case 7:
                this.jtxaMatrizC.setText(Operacion.diagonal(matrizA));
                break;
            case 8:
                matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());
                matrizC = Operacion.resta(matrizA, matrizB);
                this.mostrarResultadoEnMatrizC();
                break;
        }
    }//GEN-LAST:event_jcmbxOperacionActionPerformed

    private void jbtnIngresarValoresMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarValoresMatrizAActionPerformed

        String strNroFilas = this.jtxfMatrizANroFilas.getText();
        String strNroColumnas = this.jtxfMatrizANroColumnas.getText();

        if (strNroFilas.length() != 0 && strNroColumnas.length() != 0) {
            Integer intNroFilas = Integer.parseInt(strNroFilas);
            Integer intNroColumnas = Integer.parseInt(strNroColumnas);

            //creamos un objeto de Matriz A
            matrizA = new Matriz(intNroFilas, intNroColumnas);
            inicializarMatrizAConValoresCero(intNroFilas, intNroColumnas);

            for (int i = 0; i < intNroFilas; i++) {
                for (int j = 0; j < intNroColumnas; j++) {
                    Integer valor = Integer.parseInt(JOptionPane.showInputDialog("MatrizA[" + i + "][" + j + "]="));
                    matrizA.setValor(i, j, valor);
                    mostrarMatrizA();
                }
            }
        } else {
            if (strNroFilas.length() == 0) {
                JOptionPane.showMessageDialog(this, "Matriz A: Ingrese el Nro de Filas", "Datos Incompletos", 2);
            } else {
                if (strNroColumnas.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Matriz A: Ingrese el Nro de Columnas", "Datos Incompletos", 2);
                }
            }

        }
    }//GEN-LAST:event_jbtnIngresarValoresMatrizAActionPerformed

    private void jbtnIngresarValoresMatrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarValoresMatrizBActionPerformed

        String strNroFilas = this.jtxfMatrizBNroFilas.getText();
        String strNroColumnas = this.jtxfMatrizBNroColumnas.getText();
        if (strNroFilas.length() != 0 && strNroColumnas.length() != 0) {
            Integer intNroFilas = Integer.parseInt(strNroFilas);
            Integer intNroColumnas = Integer.parseInt(strNroColumnas);

            //creamos un objeto de Matriz B
            matrizB = new Matriz(intNroFilas, intNroColumnas);
            inicializarMatrizBConValoresCero(intNroFilas, intNroColumnas);

            for (int i = 0; i < intNroFilas; i++) {
                for (int j = 0; j < intNroColumnas; j++) {
                    Integer valor = Integer.parseInt(JOptionPane.showInputDialog("MatrizB[" + i + "][" + j + "]="));
                    matrizB.setValor(i, j, valor);
                    mostrarMatrizB();
                }
            }
        } else {
            if (strNroFilas.length() == 0) {
                JOptionPane.showMessageDialog(this, "Matriz B: Ingrese el Nro de Filas", "Datos Incompletos", 2);
            } else {
                if (strNroColumnas.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Matriz B: Ingrese el Nro de Columnas", "Datos Incompletos", 2);
                }
            }

        }
    }//GEN-LAST:event_jbtnIngresarValoresMatrizBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaMenuOpciones vo=new VistaMenuOpciones();
        vo.setVisible(true);
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnIngresarValoresMatrizA;
    private javax.swing.JButton jbtnIngresarValoresMatrizB;
    private javax.swing.JComboBox jcmbxOperacion;
    private javax.swing.JTextArea jtxaMatrizA;
    private javax.swing.JTextArea jtxaMatrizB;
    private javax.swing.JTextArea jtxaMatrizC;
    private javax.swing.JTextField jtxfMatrizANroColumnas;
    private javax.swing.JTextField jtxfMatrizANroFilas;
    private javax.swing.JTextField jtxfMatrizBNroColumnas;
    private javax.swing.JTextField jtxfMatrizBNroFilas;
    // End of variables declaration//GEN-END:variables

    private void sumarMatrices() {
        matrizC = new Matriz(matrizB.getNroFilas(), matrizB.getNroColumnas());
        Integer suma = 0;
        if ((matrizA.getNroFilas() == matrizB.getNroFilas())
                && (matrizA.getNroColumnas() == matrizB.getNroColumnas())) {
            for (int i = 0; i < matrizA.getNroFilas(); i++) {
                for (int j = 0; j < matrizA.getNroColumnas(); j++) {
                    suma = matrizA.getValor(i, j) + matrizB.getValor(i, j);
                    matrizC.setValor(i, j, suma);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dimensiones Incorrectas", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        mostrarResultadoEnMatrizC();
    }

    private void mostrarResultadoEnMatrizC() {
        this.jtxaMatrizC.setText("");
        for (int i = 0; i < matrizC.getNroFilas(); i++) {
            for (int j = 0; j < matrizC.getNroColumnas(); j++) {

                if (j == (matrizC.getNroColumnas() - 1)) {
                    this.jtxaMatrizC.append("[" + matrizC.getValor(i, j) + "]\n");
                } else {
                    this.jtxaMatrizC.append("[" + matrizC.getValor(i, j) + "] ");
                }
            }
        }
    }

    private void inicializarMatrizAConValoresCero(Integer intNroFilas, Integer intNroColumnas) {
        for (int i = 0; i < intNroFilas; i++) {
            for (int j = 0; j < intNroColumnas; j++) {
                matrizA.setValor(i, j, 0);
            }
        }
    }

    private void inicializarMatrizBConValoresCero(Integer intNroFilas, Integer intNroColumnas) {
        for (int i = 0; i < intNroFilas; i++) {
            for (int j = 0; j < intNroColumnas; j++) {
                matrizB.setValor(i, j, 0);
            }
        }
    }

    private void mostrarMatrizA() {
        this.jtxaMatrizA.setText("");
        for (int i = 0; i < matrizA.getNroFilas(); i++) {
            for (int j = 0; j < matrizA.getNroColumnas(); j++) {
                if (j == (matrizA.getNroColumnas() - 1)) {
                    this.jtxaMatrizA.append("[" + matrizA.getValor(i, j) + "]\n");
                } else {
                    this.jtxaMatrizA.append("[" + matrizA.getValor(i, j) + "] ");
                }
            }
        }
    }

    private void mostrarMatrizB() {
        this.jtxaMatrizB.setText("");//limpiando el area de texto
        for (int i = 0; i < matrizB.getNroFilas(); i++) {
            for (int j = 0; j < matrizB.getNroColumnas(); j++) {
                if (j == (matrizB.getNroColumnas() - 1)) {
                    this.jtxaMatrizB.append("[" + matrizB.getValor(i, j) + "]\n");
                } else {
                    this.jtxaMatrizB.append("[" + matrizB.getValor(i, j) + "] ");
                }
            }
        }
    }

    private void iniciarComponentesVentana() {
        tituloVentana();
        centrarVentana();
    }

    private void centrarVentana() {
        this.setLocationRelativeTo(null);
    }

    private void tituloVentana() {
        this.setTitle("Operaciones Con Matrices - Ingresando valores por teclado");
    }
}
