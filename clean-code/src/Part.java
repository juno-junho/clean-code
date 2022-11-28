import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Part {
    /*private String m_dsc;

    void setName(String name) {
        m_dsc = name;
    }*/

    String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {

    }

    private static double determinant(double a, double b, double c) {
        return b*b - 4*a*c;
    }


}

