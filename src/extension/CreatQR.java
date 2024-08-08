/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extension;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFileChooser;
/**
 *
 * @author luand
 */
public class CreatQR {
        public void createQRProduct(int maSP) throws Exception {
        int qrCodeData = maSP;
        //String filePath = /*qr.getPath()*/ " " + hoTen + ".png";
        FileExtensison fe = new FileExtensison();
        String filePath = fe.getPath()+"\\" + maSP + ".png";
        System.out.println("File path: " + filePath);
        //String filePath = fe.GetPath()+"src\\com\\images\\product\\" + maSP + ".png";
        try {
            //Trình tạo mã QR
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map< EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap< EncodeHintType, ErrorCorrectionLevel>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                    String.valueOf(qrCodeData),
                    BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                    .lastIndexOf('.') + 1), new File(filePath));
            //System.out.println("QR Code image created successfully! and stored at location " + filePath);
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) throws Exception {
        CreatQR qr = new CreatQR();
        qr.createQRProduct(2);

        //System.out.println(qr.createQR("QRCode"));
        //System.out.println(qr.createMailQR());
        // TODO code application logic here
    }
}
