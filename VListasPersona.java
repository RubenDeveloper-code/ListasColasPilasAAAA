
public class VListasPersona extends javax.swing.JInternalFrame {

    ListasEnlazadasPersona personas;
    public VListasPersona() {
        this.personas= new ListasEnlazadasPersona();
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

        jPanel1 = new javax.swing.JPanel();
        Iinicio = new javax.swing.JButton();
        Iposcicion = new javax.swing.JButton();
        Ifinal = new javax.swing.JButton();
        Efinal = new javax.swing.JButton();
        Einicio = new javax.swing.JButton();
        Rimprimir = new javax.swing.JButton();
        Rbuscar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Eposcicion = new javax.swing.JButton();
        Enombre = new javax.swing.JButton();
        Rinverso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nombre = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        apellido = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        edad = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        genero = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        direccion = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        correo = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        nacimiento = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        poscicion = new javax.swing.JTextPane();

        Iinicio.setText("Inicio");
        Iinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IinicioActionPerformed(evt);
            }
        });

        Iposcicion.setText("Poscicion");
        Iposcicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IposcicionActionPerformed(evt);
            }
        });

        Ifinal.setText("Final");
        Ifinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IfinalActionPerformed(evt);
            }
        });

        Efinal.setText("Final");
        Efinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfinalActionPerformed(evt);
            }
        });

        Einicio.setText("Inicio");
        Einicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EinicioActionPerformed(evt);
            }
        });

        Rimprimir.setText("Imprimir");
        Rimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimprimirActionPerformed(evt);
            }
        });

        Rbuscar.setText("Buscar");
        Rbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuscarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setText("Insertar");

        jLabel2.setText("Eliminar");

        Eposcicion.setText("Poscicion");
        Eposcicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EposcicionActionPerformed(evt);
            }
        });

        Enombre.setText("Nombre");
        Enombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnombreActionPerformed(evt);
            }
        });

        Rinverso.setText("Inverso");
        Rinverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RinversoActionPerformed(evt);
            }
        });

        jLabel3.setText("Reportes");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Edad");

        jLabel7.setText("Genero");

        jLabel8.setText("Direccion");

        jLabel9.setText("Correo");

        jLabel10.setText("Fecha Nacimiento");

        jScrollPane1.setViewportView(nombre);

        jScrollPane2.setViewportView(apellido);

        jScrollPane3.setViewportView(edad);

        jScrollPane4.setViewportView(genero);

        jScrollPane5.setViewportView(direccion);

        jScrollPane6.setViewportView(correo);

        jScrollPane7.setViewportView(nacimiento);

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane8.setViewportView(texto);

        jLabel11.setText("Poscicion");

        jScrollPane9.setViewportView(poscicion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Iinicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ifinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(Iposcicion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Einicio)
                                    .addComponent(Efinal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Rimprimir)
                                        .addGap(18, 18, 18)
                                        .addComponent(regresar))
                                    .addComponent(Rbuscar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Enombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Eposcicion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rinverso)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Einicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Efinal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Iinicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ifinal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rimprimir)
                            .addComponent(regresar))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Iposcicion)
                    .addComponent(Eposcicion)
                    .addComponent(Rinverso))
                .addGap(10, 10, 10)
                .addComponent(Enombre))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IinicioActionPerformed
        personas.insertarAlPrincipio(new Persona(nombre.getText(),apellido.getText(),Integer.parseInt(edad.getText()),genero.getText().charAt(0),direccion.getText(),correo.getText(),nacimiento.getText()));
        texto.setText("Añadido con exito");
    }//GEN-LAST:event_IinicioActionPerformed

    private void IfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IfinalActionPerformed
        personas.insertarAlFinal(new Persona(nombre.getText(),apellido.getText(),Integer.parseInt(edad.getText()),genero.getText().charAt(0),direccion.getText(),correo.getText(),nacimiento.getText()));
        texto.setText("Añadido con exito");
    }//GEN-LAST:event_IfinalActionPerformed

    private void IposcicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IposcicionActionPerformed
        personas.insertar(new Persona(nombre.getText(),apellido.getText(),Integer.parseInt(edad.getText()),genero.getText().charAt(0),direccion.getText(),correo.getText(),nacimiento.getText()),Integer.parseInt(poscicion.getText()));
        texto.setText("Añadido con exito");
    }//GEN-LAST:event_IposcicionActionPerformed

    private void EinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EinicioActionPerformed
        if(personas.contenidoLista()=="")
            texto.setText("No hay nada");
        else{
        personas.eliminarPrimero();
        texto.setText("Eliminado con exito");
        }
    }//GEN-LAST:event_EinicioActionPerformed

    private void EfinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfinalActionPerformed
        if(personas.contenidoLista()=="")
            texto.setText("No hay nada");
        else{
        personas.eliminarUltimo();
        texto.setText("Eliminado con exito");
        }
    }//GEN-LAST:event_EfinalActionPerformed

    private void EposcicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EposcicionActionPerformed
       personas.eliminarEnPosicion(Integer.parseInt(poscicion.getText()));
       texto.setText("Eliminado con exito");
    }//GEN-LAST:event_EposcicionActionPerformed

    private void EnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnombreActionPerformed
        
        personas.elminarPorNombre(nombre.getText());
        texto.setText("Eliminado con exito");
        
    }//GEN-LAST:event_EnombreActionPerformed

    private void RbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuscarActionPerformed
        texto.setText(personas.buscarPorNombre(nombre.getText()));
    }//GEN-LAST:event_RbuscarActionPerformed

    private void RimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RimprimirActionPerformed
        texto.setText(personas.contenidoLista());
    }//GEN-LAST:event_RimprimirActionPerformed

    private void RinversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RinversoActionPerformed
        texto.setText(personas.contenidoListaInverso());
    }//GEN-LAST:event_RinversoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Efinal;
    private javax.swing.JButton Einicio;
    private javax.swing.JButton Enombre;
    private javax.swing.JButton Eposcicion;
    private javax.swing.JButton Ifinal;
    private javax.swing.JButton Iinicio;
    private javax.swing.JButton Iposcicion;
    private javax.swing.JButton Rbuscar;
    private javax.swing.JButton Rimprimir;
    private javax.swing.JButton Rinverso;
    private javax.swing.JTextPane apellido;
    private javax.swing.JTextPane correo;
    private javax.swing.JTextPane direccion;
    private javax.swing.JTextPane edad;
    private javax.swing.JTextPane genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane nacimiento;
    private javax.swing.JTextPane nombre;
    private javax.swing.JTextPane poscicion;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
