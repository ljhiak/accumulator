/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Pun
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    public CreateAccount() {
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

        top_panel = new javax.swing.JPanel();
        role_label = new javax.swing.JLabel();
        logout_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        account_creation_header = new javax.swing.JPanel();
        first_name_field = new javax.swing.JTextField();
        last_name_field = new javax.swing.JTextField();
        id_field = new javax.swing.JTextField();
        account_type_dropdown = new javax.swing.JComboBox();
        username_field = new javax.swing.JTextField();
        passwrd_field = new javax.swing.JPasswordField();
        password_generate_button = new javax.swing.JButton();
        first_name_label = new javax.swing.JLabel();
        last_name_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        account_type_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        modify_existing_checkbox = new javax.swing.JCheckBox();
        existing_account_dropdown = new javax.swing.JComboBox();
        existing_account_separator = new javax.swing.JSeparator();
        ok_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarkShark - Home");
        setResizable(false);

        role_label.setText("Role: System Administrator");

        logout_button.setText("Log Out");

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(top_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout_button))
                    .addGroup(top_panelLayout.createSequentialGroup()
                        .addGap(17, 499, Short.MAX_VALUE)
                        .addComponent(role_label)))
                .addContainerGap())
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(role_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logout_button)
                    .addComponent(back_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        account_creation_header.setBorder(javax.swing.BorderFactory.createTitledBorder("Create/Modify an Account:"));
        account_creation_header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        account_creation_header.setName(""); // NOI18N

        first_name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_fieldActionPerformed(evt);
            }
        });

        account_type_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "System Admin", "Administrator", "Assistant Admin", "Instructor", "TA" }));
        account_type_dropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_type_dropdownActionPerformed(evt);
            }
        });

        password_generate_button.setText("Generate");
        password_generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_generate_buttonActionPerformed(evt);
            }
        });

        first_name_label.setText("First Name");

        last_name_label.setText("Last Name");

        id_label.setText("Employee ID");

        account_type_label.setText("Account Type");

        username_label.setText("Username");

        password_label.setText("Password");

        modify_existing_checkbox.setText("Modify Existing Account");
        modify_existing_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_existing_checkboxActionPerformed(evt);
            }
        });

        existing_account_dropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "jtoering", "cyoung", "gsmith", "cwoodbury", "mbalaski", "ipun", "slaboucane" }));
        existing_account_dropdown.setEnabled(false);

        existing_account_separator.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout account_creation_headerLayout = new javax.swing.GroupLayout(account_creation_header);
        account_creation_header.setLayout(account_creation_headerLayout);
        account_creation_headerLayout.setHorizontalGroup(
            account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_creation_headerLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(account_creation_headerLayout.createSequentialGroup()
                        .addComponent(modify_existing_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(existing_account_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(existing_account_separator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account_creation_headerLayout.createSequentialGroup()
                        .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(account_creation_headerLayout.createSequentialGroup()
                                .addComponent(password_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password_generate_button))
                            .addGroup(account_creation_headerLayout.createSequentialGroup()
                                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(last_name_label)
                                    .addComponent(id_label)
                                    .addComponent(account_type_label)
                                    .addComponent(username_label)
                                    .addComponent(first_name_label))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(first_name_field)
                            .addComponent(last_name_field)
                            .addComponent(id_field)
                            .addComponent(account_type_dropdown, 0, 118, Short.MAX_VALUE)
                            .addComponent(username_field)
                            .addComponent(passwrd_field))))
                .addGap(34, 34, 34))
        );
        account_creation_headerLayout.setVerticalGroup(
            account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account_creation_headerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify_existing_checkbox)
                    .addComponent(existing_account_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(existing_account_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account_type_dropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_type_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(account_creation_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwrd_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_generate_button)
                    .addComponent(password_label))
                .addGap(33, 33, 33))
        );

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(account_creation_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_button)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(account_creation_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok_button)
                    .addComponent(cancel_button))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(655, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void password_generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_generate_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_generate_buttonActionPerformed

    private void first_name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_fieldActionPerformed

    private void account_type_dropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_type_dropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_type_dropdownActionPerformed

    private void modify_existing_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_existing_checkboxActionPerformed
        if (modify_existing_checkbox.isSelected())
            existing_account_dropdown.setEnabled(true);
        else
            existing_account_dropdown.setEnabled(false);
            
    }//GEN-LAST:event_modify_existing_checkboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account_creation_header;
    private javax.swing.JComboBox account_type_dropdown;
    private javax.swing.JLabel account_type_label;
    private javax.swing.JButton back_button;
    private javax.swing.JButton cancel_button;
    private javax.swing.JComboBox existing_account_dropdown;
    private javax.swing.JSeparator existing_account_separator;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JLabel first_name_label;
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JLabel last_name_label;
    private javax.swing.JButton logout_button;
    private javax.swing.JCheckBox modify_existing_checkbox;
    private javax.swing.JButton ok_button;
    private javax.swing.JButton password_generate_button;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField passwrd_field;
    private javax.swing.JLabel role_label;
    private javax.swing.JPanel top_panel;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
