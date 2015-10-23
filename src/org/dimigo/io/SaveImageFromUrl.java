package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 * └ SaveImageFromUrl
 *
 * Date : 2015-10-23
 * </pre>
 *
 * @author : 2636 홍성빈123
 * @version : 1.0
 */
public class SaveImageFromUrl {
    public static void main(String[] args) {
        String imageUrl = "http://static.dimigo.in/img/logobeta.png";

        try {
            URL url = new URL(imageUrl);

            try(InputStream is = url.openStream();
            OutputStream os = new FileOutputStream("C:\\Users\\성빈\\git\\JavaPractice\\file\\logo.png")) {
                int result;
                byte[] buf = new byte[100];

                while((result = is.read(buf)) != -1) {
                    os.write(buf, 0, result);
                }

                System.out.println("파일 생성 완료!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
