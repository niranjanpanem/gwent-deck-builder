/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_finder_class;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Niranjan
 */
public class Image_Source {
     private String image_name;
    private BufferedImage img;
    private int image_height;
    private int image_width;
    private String filepath;
    private File file;

    /**
     * @return the image_name
     */
    public String getImage_name() {
        return image_name;
    }

    /**
     * @param image_name the image_name to set
     */
    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public void image(){
        try {
            file= new File("C:\\Users\\Niranjan\\Documents\\GWENT_DECK_CARDS\\"+this.image_name+".jpg");
   this.img = ImageIO.read(new File("C:\\Users\\Niranjan\\Documents\\GWENT_DECK_CARDS\\"+this.image_name+".jpg"));
   this.filepath= file.getAbsolutePath();
    image_height= this.img.getHeight();
    image_width= this.img.getWidth();
} catch (IOException e) {
}

    }
    /**
     * @return the img
     */
    public BufferedImage getImg() {
        return img;
    }

    /**
     * @return the image_height
     */
    public int getImage_height() {
        return image_height;
    }

    /**
     * @return the image_width
     */
    public int getImage_width() {
        return image_width;

    }

    /**
     * @return the filepath
     */
    public String getFilepath() {
        return filepath;
    }
}