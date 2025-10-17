/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp1_grupo;


import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import static tp1_grupo.MenuOpciones.registrarVehiculo;

/**
 *
 * @author Aaron R
 */
public class ReporteIngresos extends javax.swing.JFrame {
    private DefaultTableModel modelo;

    public ReporteIngresos() {
        initComponents();
        setLocationRelativeTo(null);
        configurarTabla();
        cargarReporte();
    }

    private void configurarTabla() {
        modelo = new DefaultTableModel(
            new Object[]{"Tipo de Vehículo", "Cantidad", "Total Recaudado"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblIngresos.setModel(modelo);
        tblIngresos.getColumnModel().getColumn(0).setPreferredWidth(120);
        tblIngresos.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblIngresos.getColumnModel().getColumn(2).setPreferredWidth(120);
    }

    private void cargarReporte() {
        modelo.setRowCount(0);
        double totalGeneral = 0;

        // Crear mapa para agrupar por tipo de vehículo
        Map<String, Integer> cantidadPorTipo = new HashMap<>();
        Map<String, Double> ingresoPorTipo = new HashMap<>();

        // Recorrer todos los vehículos registrados
        for (Vehiculo v : registrarVehiculo) {
            String tipo = v.toString();
            cantidadPorTipo.put(tipo, cantidadPorTipo.getOrDefault(tipo, 0) + 1);
             double tarifa = v.calcularTarifa();
            ingresoPorTipo.put(tipo, ingresoPorTipo.getOrDefault(tipo, 0.0) + tarifa);
        }
        for (Vehiculo v : MenuOpciones.historialVehiculos) {
            String tipo = v.obtenerTipo();
            cantidadPorTipo.put(tipo, cantidadPorTipo.getOrDefault(tipo, 0) + 1);
            double tarifa = v.calcularTarifa();
            ingresoPorTipo.put(tipo, ingresoPorTipo.getOrDefault(tipo, 0.0) + tarifa);
        }
           
            // Si no hay datos
        if (cantidadPorTipo.isEmpty()) {
            modelo.addRow(new Object[]{"---", "0", "₡0.00"});
            txtTotalGeneral.setText("₡0.00");
            return;
        }  
        
           for (String tipo : cantidadPorTipo.keySet()) {
            int cantidad = cantidadPorTipo.get(tipo);
            double total = ingresoPorTipo.get(tipo);
            
            modelo.addRow(new Object[]{
                tipo,
                cantidad,
                String.format("₡%.2f", total)
            });
            
            totalGeneral += total;
        }

        txtTotalGeneral.setText(String.format("₡%.2f", totalGeneral));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTotalGeneral = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ReporteIngresos");

        tblIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TipoDeVehiculo", "Cantidad", "TotalRecaudado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblIngresos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Reporte General de Ingresos");

        jLabel2.setText("Total General:");

        txtTotalGeneral.setEditable(false);
        txtTotalGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalGeneralActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(txtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void txtTotalGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalGeneralActionPerformed
        // TODO add your handling code here:
        MenuOpciones menu = new MenuOpciones();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtTotalGeneralActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MenuOpciones menu = new MenuOpciones();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteIngresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngresos;
    private javax.swing.JTextField txtTotalGeneral;
    // End of variables declaration//GEN-END:variables
}
