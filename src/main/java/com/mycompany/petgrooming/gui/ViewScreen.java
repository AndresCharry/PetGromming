package com.mycompany.petgrooming.gui;

import com.mycompany.petgrooming.logic.LogicController;
import com.mycompany.petgrooming.logic.Pet;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewScreen extends javax.swing.JFrame {

	LogicController logicController = null;

	public ViewScreen() {
		logicController = new LogicController();
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petTable = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        bntBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bntRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Pet Grooming");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        petTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        petTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(petTable);

        btnEdit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        bntBack.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bntBack.setText("<- back");
        bntBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        bntRemove.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bntRemove.setText("remove");
        bntRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntRemove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnEdit)
                .addGap(35, 35, 35)
                .addComponent(bntRemove)
                .addGap(35, 35, 35)
                .addComponent(bntBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
		loadTable();
    }//GEN-LAST:event_formWindowOpened

    private void bntBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBackActionPerformed
		MainScreen main = new MainScreen();
		main.setVisible(true);
		main.setLocationRelativeTo(null);
		this.dispose();
    }//GEN-LAST:event_bntBackActionPerformed

    private void bntRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRemoveActionPerformed
		if (petTable.getRowCount() > 0) {
			if (petTable.getSelectedRow() != -1) {
				int idPet = Integer.parseInt(String.valueOf(petTable.getValueAt(petTable.getSelectedRowCount(), 0)));

				logicController.remove(idPet);

				message("Was successfully deleted", "Pet Delete ", "Information");
				loadTable();
			} else {
				message("No Row Selected", "Error", "Error");
			}
		} else {
			message("table is empty", "Error", "Error");
		}
    }//GEN-LAST:event_bntRemoveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
		

		if (petTable.getRowCount() > 0) {
			if (petTable.getSelectedRow() != -1) {
				int idPet = Integer.parseInt(String.valueOf(petTable.getValueAt(petTable.getSelectedRow(), 0)));
				EditScreen edit = new EditScreen(idPet);
				edit.setVisible(true);
				edit.setLocationRelativeTo(null);
				this.dispose();
			} else {
				message("No Row Selected", "Error", "Error");
			}
		} else {
			message("table is empty", "Error", "Error");
		}
    }//GEN-LAST:event_btnEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBack;
    private javax.swing.JButton bntRemove;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable petTable;
    // End of variables declaration//GEN-END:variables

	private void loadTable() {
		DefaultTableModel table = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		String[] list = {"Id", "Pet's Name", "Pets's Breed", "Pet's Color", "Allergic", "Spe. Atte ",
			"Owner's Name", "Owner's phone"};
		table.setColumnIdentifiers(list);

		List<Pet> petslist = logicController.bringpets();

		if (petslist != null) {
			for (Pet pet : petslist) {
				Object[] object = {pet.getId(), pet.getName(), pet.getBreed(), pet.getColor(), pet.getAllergic(),
					pet.getSpecialAttention(), pet.getOwner().getName(), pet.getOwner().getPhone()};

				table.addRow(object);
			}
		}

		petTable.setModel(table);
	}

	private void message(String message, String title, String typeMessage) {
		JOptionPane optionPane = null;
		if (typeMessage.equalsIgnoreCase("information")) {
			optionPane = new JOptionPane(message, JOptionPane.INFORMATION_MESSAGE);
		} else if (typeMessage.equalsIgnoreCase("error")) {
			optionPane = new JOptionPane(message, JOptionPane.ERROR_MESSAGE);
		}
		JDialog dialog = optionPane.createDialog(title);
		dialog.setAlwaysOnTop(true);
		dialog.setVisible(true);
	}
}
