import java.awt.Color;

public class Image {

    public static void main(String[] args){

        Picture image = new Picture(args[0]); //constructor for the Picture class
        image.show(); //displays the image

        int height = image.height();
        int width = image.width();
        StdOut.println("Rows = " + height);
        StdOut.println("Columns = " + width);
        StdOut.println(height*width + " pixels in the image.");

        //Create 3 images that have all pixels in black
        Picture imageR = new Picture(width, height); //creates a black image with widthxheight
        Picture imageB = new Picture(width, height);
        Picture imageG = new Picture(width, height);

        //seperate colors
        for (int col = 0; col<width; col++){
            for(int row=0; row<height; row++){

                Color color = image.get(col, row); //picks up the color at col,row coordinates
                int r = color.getRed();
                int b = color.getBlue();
                int g = color.getGreen();

                //set the components in each image
                imageR.set(col,row, new Color(r,0,0));
                imageG.set(col,row, new Color(0,g,0));
                imageB.set(col,row, new Color(0,0,b));
            }
        }
        //display each image in its own window
        imageR.show();
        imageB.show();
        imageG.show();


    }
}