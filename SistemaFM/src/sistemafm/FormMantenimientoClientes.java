/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBAS
 */
public class FormMantenimientoClientes extends javax.swing.JInternalFrame {

    private static String db = "sistema_fm";
    private static String user = "root";
    private static String password = "Cagada1234";
    private static String host = "localhost";
    private static String server = "jdbc:mysql://"+ host + "/" +db; 
    /**
     * Creates new form FormMantenimientoClientes
     */
    public FormMantenimientoClientes() {
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

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtEstatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setVisible(true);

        jButton1.setText("Buscar por Numero Tarjeta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Apellido: ");

        jLabel1.setText("FORMULARIO DE MANTENIMIENTO CLIENTES");

        jLabel5.setText("Correo: ");

        jLabel7.setText("Estatus:");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Direccion: ");

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("No. Tarjeta:  ");

        lblStatus.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtEstatus))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDireccion))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
          try{
            //local host y el nombre de la base de datos y la contraseña
            Connection cn = DriverManager.getConnection(server, user, password);
            //Esto permitirá el insert
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?,?)");
            //El primer parametro de cada setString es cada ?
            pst.setString(1, txtNumeroTarjeta.getText().trim());
            pst.setString(2, txtNombreCliente.getText().trim());
            pst.setString(3, txtApellidoCliente.getText().trim());
            pst.setString(4, txtCorreoCliente.getText().trim());
            pst.setString(5, txtDireccion.getText().trim());
            pst.setString(6, txtEstatus.getText().trim());
            pst.executeUpdate();

            txtNumeroTarjeta.setText("");
            txtNombreCliente.setText("");
            txtApellidoCliente.setText("");
            txtCorreoCliente.setText("");
            txtDireccion.setText("");
            txtEstatus.setText("");
            lblStatus.setText("Registro exitoso.");
        }catch (Exception e){

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
         try {
            String ID = txtBuscar.getText().trim();

            Connection cn = DriverManager.getConnection(server, user, password);
            PreparedStatement pst = cn.prepareStatement("update clientes set No_Tarjeta = ?, Nombre = ? , Apellido = ?, Correo =?, Direccion = ?, Estatus = ? where No_Tarjeta = " + ID);

            pst.setString(1, txtNumeroTarjeta.getText().trim());
            pst.setString(2, txtNombreCliente.getText().trim());
            pst.setString(3, txtApellidoCliente.getText().trim());
            pst.setString(4, txtCorreoCliente.getText().trim());
            pst.setString(5, txtDireccion.getText().trim());
            pst.setString(6, txtEstatus.getText().trim());
            pst.executeUpdate();

            txtNumeroTarjeta.setText("");
            txtNombreCliente.setText("");
            txtApellidoCliente.setText("");
            txtCorreoCliente.setText("");
            txtDireccion.setText("");
            txtEstatus.setText("");
            
            lblStatus.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Connection cn = DriverManager.getConnection(server, user, password);
            PreparedStatement pst = cn.prepareStatement("delete from clientes where No_Tarjeta = ?");

            pst.setString(1, txtBuscar.getText().trim());
            pst.executeUpdate();

            txtNumeroTarjeta.setText("");
            txtNombreCliente.setText("");
            txtApellidoCliente.setText("");
            txtCorreoCliente.setText("");
            txtDireccion.setText("");
            txtEstatus.setText("");

            lblStatus.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
            //local host y el nombre de la base de datos y la contraseñña
            Connection cn = DriverManager.getConnection(server, user, password);
            //Esto permitirá el buscar registro a traves del ID
            PreparedStatement pst = cn.prepareStatement("select * from clientes where No_Tarjeta = ?");
            //El parametro 1 es de que solo un ? esta llenando y entra lo del txt
            pst.setString(1, txtBuscar.getText().trim());

            //El result del query, lo que ira a traer
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtNumeroTarjeta.setText(rs.getString("No_Tarjeta"));
                txtNombreCliente.setText(rs.getString("Nombre"));
                txtApellidoCliente.setText(rs.getString("Apellido"));
                txtCorreoCliente.setText(rs.getString("Correo"));
                txtDireccion.setText(rs.getString("Direccion"));
                txtEstatus.setText(rs.getString("Estatus"));

                JOptionPane.showMessageDialog(null, "Cliente encontrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstatus;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
