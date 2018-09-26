package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

public class FileUpload extends ActionSupport {

    private File file;
    private String fileFileName;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }



    public String upload() {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(file);
            os = new FileOutputStream("d:\\" + fileFileName);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;


    }
}
