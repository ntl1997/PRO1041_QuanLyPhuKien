package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDiaLogHoTro extends javax.swing.JDialog {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public JDiaLogHoTro(java.awt.Frame parent, boolean modal) {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void sendMessage() {
        String userInput = txtYeuCau.getText();
        if (!userInput.isEmpty()) {
            txtHoiDap.append("You: " + userInput + "\n");
            txtYeuCau.setText(""); // Xóa trường nhập tin nhắn
            String response = generateResponse(userInput);
            txtHoiDap.append("TechZone: " + response + "\n");
        }
    }

    private String generateResponse(String userInput) {
        userInput = userInput.toLowerCase(); // Chuyển đổi đầu vào của người dùng về chữ thường

        if (userInput.contains("xin chào") || userInput.contains("chào")) {
            return "Chào bạn! Tôi có thể giúp gì cho bạn hôm nay?\n\n"
                    + "1. **Quản lý nhân viên**\n"
                    + "2. **Quản lý sản phẩm**\n"
                    + "3. **Bán hàng**\n"
                    + "4. **Xem thống kê**\n"
                    + "5. **Đổi mật khẩu**\n"
                    + "6. **Xem hóa đơn**\n"
                    + "7. **Liên hệ hỗ trợ kỹ thuật**\n"
                    + "8. **Hướng dẫn sử dụng phần mềm**\n"
                    + "9. **Khắc phục sự cố phần mềm**\n\n"
                    + "Vui lòng chọn số tương ứng với tùy chọn bạn muốn.";
        } else if (userInput.contains("cảm ơn") || userInput.contains("cảm ơn bạn")) {
            return "Không có gì! Nếu bạn cần thêm sự hỗ trợ,\n"
                    + "đừng ngần ngại hỏi nhé.";
        } else if (userInput.contains("hướng dẫn sử dụng phần mềm")) {
            return "Để sử dụng phần mềm, bạn có thể tìm thấy\n"
                    + "hướng dẫn chi tiết trong tài liệu hướng dẫn\n"
                    + "hoặc video hướng dẫn có sẵn.\n"
                    + "Bạn cần hướng dẫn về phần nào cụ thể không?";
        } else if (userInput.contains("khắc phục sự cố phần mềm")) {
            return "Nếu bạn gặp sự cố với phần mềm, hãy cung cấp thêm\n"
                    + "thông tin về lỗi hoặc vấn đề cụ thể.\n"
                    + "Tôi có thể giúp bạn kiểm tra hoặc hướng dẫn cách khắc phục.";
        } else if (userInput.contains("quản lý nhân viên") || userInput.contains("nhân viên")) {
            return "Bạn có thể quản lý nhân viên bằng cách xem danh sách,\n"
                    + "thêm, hoặc cập nhật thông tin nhân viên.\n"
                    + "Bạn cần hỗ trợ chi tiết ở phần nào,\n"
                    + "ví dụ như thêm nhân viên mới hoặc xem báo cáo nhân viên?";
        } else if (userInput.contains("quản lý sản phẩm") || userInput.contains("sản phẩm mới")) {
            return "Để quản lý sản phẩm, bạn có thể kiểm tra tình trạng\n"
                    + "hàng tồn kho, thêm sản phẩm mới, hoặc cập nhật giá bán.\n"
                    + "Bạn muốn thực hiện thao tác nào,\n"
                    + "ví dụ như thêm sản phẩm mới hoặc cập nhật thông tin sản phẩm?";
        } else if (userInput.contains("bán hàng") || userInput.contains("thực hiện đơn hàng")) {
            return "Khi thực hiện bán hàng, đừng quên kiểm tra kỹ thông tin\n"
                    + "sản phẩm và khách hàng.\n"
                    + "Nếu cần hỗ trợ về quy trình bán hàng hoặc cần hướng dẫn cụ thể,\n"
                    + "hãy cho tôi biết.";
        } else if (userInput.contains("xem thống kê") || userInput.contains("thống kê")) {
            return "Thống kê có thể bao gồm doanh thu, lượng hàng tồn,\n"
                    + "hoặc số lượng đơn hàng.\n"
                    + "Bạn muốn xem thống kê chi tiết nào,\n"
                    + "chẳng hạn như doanh thu theo từng sản phẩm hoặc số lượng đơn hàng theo ngày?";
        } else if (userInput.contains("đổi mật khẩu")) {
            return "Bạn có thể đổi mật khẩu trong phần cài đặt tài khoản.\n"
                    + "Hãy đảm bảo rằng mật khẩu mới đủ mạnh và an toàn.\n"
                    + "Nếu cần hướng dẫn chi tiết, tôi có thể hỗ trợ thêm.";
        } else if (userInput.contains("hóa đơn") || userInput.contains("xem hóa đơn")) {
            return "Bạn có thể xem hóa đơn chi tiết trong hệ thống.\n"
                    + "Bạn cần tìm hóa đơn theo mã hay theo ngày,\n"
                    + "hoặc có thông tin cụ thể nào khác?";
        } else if (userInput.contains("liên hệ hỗ trợ kỹ thuật") || userInput.contains("hỗ trợ kỹ thuật") || userInput.contains("liên hệ")) {
            return "Bạn có thể liên hệ bộ phận hỗ trợ kỹ thuật qua số điện thoại\n"
                    + "hoặc email sau:\n\n"
                    + "Zalo: 0976195801\n"
                    + "Gmail: dien01112005@gmail.com\n\n"
                    + "Nếu cần thông tin cụ thể về cách liên hệ hoặc giờ làm việc,\n"
                    + "hãy cho tôi biết.";
        } else if (userInput.contains("giúp tôi với")) {
            return "Tôi luôn sẵn sàng giúp bạn.\n"
                    + "Bạn đang gặp khó khăn ở phần nào,\n"
                    + "ví dụ như quản lý nhân viên hay xử lý đơn hàng?";
        } else {
            return "Xin lỗi, tôi không hiểu yêu cầu của bạn.\n"
                    + "Hãy thử diễn đạt lại hoặc chọn một trong các tùy chọn từ menu.";
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtYeuCau = new javax.swing.JTextField();
        btnGui = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHoiDap = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 104, 120));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(15, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/18_1_2.png"))); // NOI18N

        txtYeuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYeuCauActionPerformed(evt);
            }
        });

        btnGui.setBackground(new java.awt.Color(51, 153, 255));
        btnGui.setText("Gửi");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });

        txtHoiDap.setColumns(20);
        txtHoiDap.setRows(5);
        jScrollPane2.setViewportView(txtHoiDap);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGui)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane2))
                .addGap(15, 15, 15)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtYeuCau, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(btnGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        sendMessage();
    }//GEN-LAST:event_btnGuiActionPerformed

    private void txtYeuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYeuCauActionPerformed
        sendMessage();
    }//GEN-LAST:event_txtYeuCauActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(JDiaLogHoTro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(() -> {
        // Assuming the parent frame is null for a modal dialog
        JFrame parentFrame = new JFrame(); // Create a dummy parent frame
        JDiaLogHoTro dialog = new JDiaLogHoTro(parentFrame, true); // Pass the frame and modality
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtHoiDap;
    private javax.swing.JTextField txtYeuCau;
    // End of variables declaration//GEN-END:variables
}
