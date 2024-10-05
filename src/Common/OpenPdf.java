/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.io.File;
import javax.swing.JOptionPane;
import jema.MethodistUtils;

/**
 *
 * @author CODE
 */
public class OpenPdf {
    public static void openById(String txtSname) {
    try {
        File file = new File(MethodistUtils.results +txtSname+ ".pdf");
        if (file.exists()) {
            Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "File does not exist");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

}
