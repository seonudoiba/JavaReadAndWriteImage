import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;

        BufferedImage image = null;
        image = readFromFile(width, height, image);
        writeToFile(image);
    }
    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
       try{
           File sampleFile = new File("C:\\Users\\starr\\Desktop\\projects\\test\\inimages\\ThinkingDuke.PNG");
           image = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);

           image = ImageIO.read(sampleFile);
           System.out.println("reading complete.: " + image);
       } catch (IOException e) {
           System.out.println("error: " + e);
       }
       return image;
    }
    private static void writeToFile(BufferedImage image){
        try {
            File output = new File("C:\\Users\\starr\\Desktop\\projects\\test\\outimages\\thinkingDuke.png");
            ImageIO.write(image, "png", output);
            System.out.println("Writing complete");
        } catch (IOException e){
            System.out.println("Error: "+ e);
        }
    }>>>
}