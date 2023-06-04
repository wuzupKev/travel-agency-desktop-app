import java.sql.*;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    public Vista() {
        initComponents();
        this.cambiarVista(this.Panel3);
        listar();
        listar2();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBackground = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        CodigoProvincia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NombreProvincia = new javax.swing.JTextField();
        CapitalProvincia = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CostoProvincia = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        DiasProvincia = new javax.swing.JTextField();
        ObservacionProvincia = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProvincias = new javax.swing.JTable();
        Insertar2 = new javax.swing.JButton();
        Eliminar2 = new javax.swing.JButton();
        Modificar2 = new javax.swing.JButton();
        Limpiar2 = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CodigoGuia = new javax.swing.JTextField();
        NombreGuia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ApellidoGuia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        EquipoGuia = new javax.swing.JTextField();
        Provincia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ObservacionGuia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaGuia = new javax.swing.JTable();
        InsertarGuia = new javax.swing.JButton();
        EliminarGuia = new javax.swing.JButton();
        ModificarGuia = new javax.swing.JButton();
        LimpiarGuia = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Panel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setFont(new java.awt.Font("DK Lemon Yellow Sun", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("\"NOMBRE GENERICO\"");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Adminstracion de datos");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AGENCIA DE VIAJES");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/O-Generico-positivo-OK.png"))); // NOI18N

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 436, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        Panel2.setBackground(new java.awt.Color(255, 102, 0));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ingresar datos de las provincias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("codigo");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Nombre");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("capital");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("costo");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("dias");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Observacion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CapitalProvincia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ObservacionProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiasProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(CodigoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(NombreProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(CostoProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DiasProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(ObservacionProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(CapitalProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Provincias");

        TablaProvincias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nombre", "capital", "costo", "dias", "observacion"
            }
        ));
        TablaProvincias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProvinciasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProvincias);

        Insertar2.setText("insertar");
        Insertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insertar2ActionPerformed(evt);
            }
        });

        Eliminar2.setText("eliminar");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
            }
        });

        Modificar2.setText("modificar");
        Modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar2ActionPerformed(evt);
            }
        });

        Limpiar2.setText("limpiar");
        Limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(Insertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)
                    .addComponent(Eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)
                    .addComponent(Modificar2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62)
                    .addComponent(Limpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(304, 304, 304)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Insertar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modificar2)
                            .addComponent(Limpiar2)
                            .addComponent(Eliminar2)))
                    .addContainerGap(305, Short.MAX_VALUE)))
        );

        Panel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ingresar datos del guia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("codigo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("equipo asignado");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("provincia");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("OBSERVACION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ApellidoGuia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EquipoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ObservacionGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CodigoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NombreGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EquipoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(ObservacionGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ApellidoGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agendar viajes");

        TablaGuia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nombre", "apellido", "equipo", "observacion", "idprovincia"
            }
        ));
        TablaGuia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaGuiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaGuia);

        InsertarGuia.setText("insertar");
        InsertarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarGuiaActionPerformed(evt);
            }
        });

        EliminarGuia.setText("eliminar");
        EliminarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarGuiaActionPerformed(evt);
            }
        });

        ModificarGuia.setText("modificar");
        ModificarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarGuiaActionPerformed(evt);
            }
        });

        LimpiarGuia.setText("limpiar");
        LimpiarGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarGuiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(InsertarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(EliminarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(ModificarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(LimpiarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertarGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ModificarGuia)
                        .addComponent(LimpiarGuia)
                        .addComponent(EliminarGuia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuPanel.setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("AGENDAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("PROVINCIAS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(89, 89, 89))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelBackgroundLayout = new javax.swing.GroupLayout(PanelBackground);
        PanelBackground.setLayout(PanelBackgroundLayout);
        PanelBackgroundLayout.setHorizontalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBackgroundLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBackgroundLayout.setVerticalGroup(
            PanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        this.cambiarVista(this.Panel1);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.cambiarVista(this.Panel2);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void LimpiarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarGuiaActionPerformed
        CodigoGuia.setText("");
        NombreGuia.setText("");
        ApellidoGuia.setText("");
        EquipoGuia.setText("");
        ObservacionGuia.setText("");
        Provincia.setText("");
    }//GEN-LAST:event_LimpiarGuiaActionPerformed

    private void InsertarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarGuiaActionPerformed
        añadir();
        CodigoGuia.setText("");
        NombreGuia.setText("");
        ApellidoGuia.setText("");
        EquipoGuia.setText("");
        ObservacionGuia.setText("");
        Provincia.setText("");
    }//GEN-LAST:event_InsertarGuiaActionPerformed

    private void Insertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insertar2ActionPerformed
        añadir2();
       CodigoProvincia.setText("");
       NombreProvincia.setText("");
       CapitalProvincia.setText("");
       CostoProvincia.setText("");
       DiasProvincia.setText("");
       ObservacionProvincia.setText("");
    }//GEN-LAST:event_Insertar2ActionPerformed

    private void EliminarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarGuiaActionPerformed
        eliminar();
    }//GEN-LAST:event_EliminarGuiaActionPerformed

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        eliminar2();
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void ModificarGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarGuiaActionPerformed
        actualizar();
        CodigoGuia.setText("");
        NombreGuia.setText("");
        ApellidoGuia.setText("");
        EquipoGuia.setText("");
        ObservacionGuia.setText("");
        Provincia.setText("");
    }//GEN-LAST:event_ModificarGuiaActionPerformed

    private void TablaGuiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaGuiaMouseClicked
        int seleccionado= TablaGuia.getSelectedRow();
        String value =(String) TablaGuia.getValueAt(seleccionado, 0).toString();
        CodigoGuia.setText((String) TablaGuia.getValueAt(seleccionado, 0));
        NombreGuia.setText((String) TablaGuia.getValueAt(seleccionado, 1));
        ApellidoGuia.setText((String) TablaGuia.getValueAt(seleccionado, 2));
        EquipoGuia.setText((String) TablaGuia.getValueAt(seleccionado, 3));
        ObservacionGuia.setText((String) TablaGuia.getValueAt(seleccionado, 4));
        Provincia.setText(TablaGuia.getValueAt(seleccionado, 5).toString());
    }//GEN-LAST:event_TablaGuiaMouseClicked

    private void TablaProvinciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProvinciasMouseClicked
       int seleccionado= TablaProvincias.getSelectedRow();
       CodigoProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 0).toString());
       NombreProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 1));
       CapitalProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 2));
       CostoProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 3).toString());
       DiasProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 4).toString());
       ObservacionProvincia.setText((String) TablaProvincias.getValueAt(seleccionado, 5));
    }//GEN-LAST:event_TablaProvinciasMouseClicked

    private void Limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar2ActionPerformed
       CodigoProvincia.setText("");
       NombreProvincia.setText("");
       CapitalProvincia.setText("");
       CostoProvincia.setText("");
       DiasProvincia.setText("");
       ObservacionProvincia.setText("");
       
    }//GEN-LAST:event_Limpiar2ActionPerformed

    private void Modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar2ActionPerformed
        actualizar2();
    }//GEN-LAST:event_Modificar2ActionPerformed

    void listar(){
        String sql ="select * from guia";
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object []guia= new Object[6];
            modelo= (DefaultTableModel) TablaGuia.getModel();
            while(rs.next()){
                guia[0]=rs.getString("codigoGuia");
                guia[1]=rs.getString("nombreGuia");
                guia[2]=rs.getString("apellido");
                guia[3]=rs.getString("equipoAsignado");
                guia[4]=rs.getString("observacion");
                guia[5]=rs.getInt("idprovincia");
                modelo.addRow(guia);
            }
            TablaGuia.setModel(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void listar2(){
        
        String sql="select * from provincias";
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object []provincias= new Object[6];
            modelo= (DefaultTableModel) TablaProvincias.getModel();
            while(rs.next()){
                provincias[0]=rs.getInt("codigoProvincia");
                provincias[1]=rs.getString("nombre");
                provincias[2]=rs.getString("capital");
                provincias[3]=rs.getFloat("costo");
                provincias[4]=rs.getInt("dias");
                provincias[5]=rs.getString("observacion");
                modelo.addRow(provincias);
            }
            TablaProvincias.setModel(modelo);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    void añadir(){
        String sql="insert into guia(codigoGuia,nombreGuia,apellido,equipoAsignado,observacion,idprovincia) values('"+CodigoGuia.getText()+"','"+NombreGuia.getText()+"','"+ApellidoGuia.getText()+"','"+EquipoGuia.getText()+"',"
                + "'"+ObservacionGuia.getText()+"','"+Provincia.getText()+"')";
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaGuia.getModel();
            modelo.setRowCount(0);
            listar();
        }catch(Exception e){
            
        }
    }
    
    void añadir2(){
        String sql="insert into provincias(codigoProvincia,nombre,capital,costo,dias,observacion) values('"+CodigoProvincia.getText()+"','"+NombreProvincia.getText()+"','"+CapitalProvincia.getText()+"','"+CostoProvincia.getText()+"',"
                    + "'"+DiasProvincia.getText()+"','"+ObservacionProvincia.getText()+"')";
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaProvincias.getModel();
            modelo.setRowCount(0);
            listar2();
            
        }catch(Exception e){
            
        }
    }
    
    
    void eliminar(){
        int seleccionado= TablaGuia.getSelectedRow();
        String value =(String) TablaGuia.getValueAt(seleccionado, 0);
        String sql="delete from guia where codigoGuia="+value;
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaGuia.getModel();
            modelo.setRowCount(0);
            listar();
        }catch(Exception e){
            
        }
    }
    void eliminar2(){
        int seleccionado= TablaProvincias.getSelectedRow();
        String value =(String) TablaProvincias.getValueAt(seleccionado, 0).toString();
        String sql="delete from provincias where codigoProvincia="+value;
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaProvincias.getModel();
            modelo.setRowCount(0);
            listar2();
        }catch(Exception e){
            
        }
    }
    
    
    void actualizar(){
        int seleccionado= TablaGuia.getSelectedRow();
        String value =(String) TablaGuia.getValueAt(seleccionado, 0).toString();
        String sql="update guia set codigoGuia = '"+CodigoGuia.getText()+"',nombreGuia='"+NombreGuia.getText()+"',apellido='"+ApellidoGuia.getText()+"',equipoAsignado='"+EquipoGuia.getText()+"',observacion='"+ObservacionGuia.getText()+"',idprovincia='"+Provincia.getText()+"' where codigoGuia="+value;
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaGuia.getModel();
            modelo.setRowCount(0);
            listar();
        }catch(Exception e){
            
        }
        
    }
    
    void actualizar2(){
        int seleccionado= TablaProvincias.getSelectedRow();
        String value =(String) TablaProvincias.getValueAt(seleccionado, 0).toString();
        String sql="update provincias set codigoProvincia='"+CodigoProvincia.getText()+"',nombre='"+NombreProvincia.getText()+"', capital='"+CapitalProvincia.getText()+"',costo='"+CostoProvincia.getText()+"',dias='"+DiasProvincia.getText()+"',observacion='"+ObservacionProvincia.getText()+"' where codigoProvincia= "+value;
        
        try{
            cn=con.getconnection();
            st=cn.createStatement();
            st.executeUpdate(sql);
            modelo= (DefaultTableModel) TablaProvincias.getModel();
            modelo.setRowCount(0);
            listar2();
        }catch(Exception e){
            
        }
        
    }
    
    
    void limpiartabla(){
        for(int x=0;x<TablaGuia.getRowCount();x++){
            modelo.removeRow(x);
            x=x-1;
        }
    }
    
     
    private void cambiarVista(JPanel jpanel){
        jpanel.setSize(this.MainPanel.getWidth(),this.MainPanel.getHeight());
        this.MainPanel.removeAll();
        this.MainPanel.add(jpanel);
        this.MainPanel.repaint();
    }
    
    private void activarVista(JPanel jpanel){    
        
        
        this.Panel1.setEnabled(false);
        this.Panel1.setVisible(false);
                
        this.Panel2.setEnabled(false);
        this.Panel2.setVisible(false);        
                
        
                
        this.Panel3.setEnabled(false);
        this.Panel3.setVisible(false);
        
        
        
        jpanel.setVisible(true);
        jpanel.setEnabled(true);
    }
    
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoGuia;
    private javax.swing.JTextField CapitalProvincia;
    private javax.swing.JTextField CodigoGuia;
    private javax.swing.JTextField CodigoProvincia;
    private javax.swing.JTextField CostoProvincia;
    private javax.swing.JTextField DiasProvincia;
    private javax.swing.JButton Eliminar2;
    private javax.swing.JButton EliminarGuia;
    private javax.swing.JTextField EquipoGuia;
    private javax.swing.JButton Insertar2;
    private javax.swing.JButton InsertarGuia;
    private javax.swing.JButton Limpiar2;
    private javax.swing.JButton LimpiarGuia;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JButton Modificar2;
    private javax.swing.JButton ModificarGuia;
    private javax.swing.JTextField NombreGuia;
    private javax.swing.JTextField NombreProvincia;
    private javax.swing.JTextField ObservacionGuia;
    private javax.swing.JTextField ObservacionProvincia;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JTextField Provincia;
    private javax.swing.JTable TablaGuia;
    private javax.swing.JTable TablaProvincias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
