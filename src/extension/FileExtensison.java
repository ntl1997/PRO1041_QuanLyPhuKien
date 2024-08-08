/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luand
 */
public class FileExtensison {

    public String getPath() throws IOException {
        StringBuilder path = new StringBuilder();
        try (FileReader fr = new FileReader("src\\file\\saveQRCode.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                path.append((char) i);
            }
        }
        return path.toString();
    }

    public void setPath(String newPath) throws IOException {
        try (FileOutputStream file = new FileOutputStream(new File("src\\file\\saveQRCode.txt")); FilterOutputStream filter = new FilterOutputStream(file)) {
            byte[] b = newPath.getBytes();
            filter.write(b);
            filter.flush();
        }
    }

}
