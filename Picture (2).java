//SriRaam A. Mehtali

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
 }

  /**
   * Constructor that takes a file name and creates the picture
  * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
 }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }

  /** Method to set the blue to 0 */
  /**public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for(int i = 0; i < 5; i++) {
         
         
     }
  }
  
  */

  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for(int a = 0; a < 5; a++) {
    
      int topStart = (int)(Math.random()*400);
      int topEnd = (int)(Math.random()*400);
      
      if(topEnd < topStart) {
         int temp = topStart;
         topStart = topEnd;
         topEnd = temp;
      }
      
      int botStart = (int)(Math.random()*617);
      int botEnd = (int)(Math.random()*610);
      
      if(botEnd < botStart) {
         int tempo = botStart;
         botStart = botEnd;
         botEnd = tempo;
      }

      
      
      for (int i = topStart; i < topEnd; i++) {
        for(int j = botStart; j < botEnd; j++) {
        
           pixels[i][j].setRed((int)(Math.random() * 255));
           pixels[i][j].setGreen((int)(Math.random() * 255));
           pixels[i][j].setBlue((int)(Math.random() * 255));
         }
      }
    }
  }
  public Pixel[][] getPixels2D()
 {
  int width = getWidth();
   int height = getHeight();
   Pixel[][] pixelArray = new Pixel[height][width];

   // loop through height rows from top to bottom
   for (int row = 0; row < height; row++)
     for (int col = 0; col < width; col++)
       pixelArray[row][col] = new Pixel(this,col,row);

   return pixelArray;
 }


  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }

  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int avg = (int)((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3);
        pixelObj.setRed(avg);
        pixelObj.setBlue(avg);
        pixelObj.setGreen(avg);
      }
    }
  }


  /** Method that mirrors the picture around a
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBotToTop()
  {
     Pixel[][] pixels = this.getPixels2D();
     Pixel topPixel = null;
     Pixel bottomPixel = null;
     int height = pixels.length;
     for (int row = 0; row < height; row++)
     {
      for (int col = 0; col < pixels[0].length; col++)
       {
          topPixel = pixels[row][col];
          bottomPixel = pixels[height - 1 - row][col];
          topPixel.setColor(bottomPixel.getColor());
       }
      }
  }

  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {

        leftPixel = pixels[row][col];
        rightPixel = pixels[row]
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic,
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow;
        fromRow < fromPixels.length &&
         toRow < toPixels.length;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }
  
  //Other copy method from exercise 1
  
  public void otherCopy(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow;
         fromRow < fromPixels.length &&
         toRow < endRow;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol;
           fromCol < fromPixels[0].length &&
           toCol < endCol;
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
        

      }
    }
  }
  
  

  /** Method to create a collage of several pictures */
   public void createCollage()
 {
 Picture flower1 = new Picture("flower1.jpg");
 Picture flower2 = new Picture("flower2.jpg");
 this.copy(flower1,0,0);
 this.copy(flower2,100,0);
 this.copy(flower1,200,0);
 Picture flowerNoBlue = new Picture(flower2);
 //flowerNoBlue.zeroBlue();
 this.copy(flowerNoBlue,300,0);
 this.copy(flower1,400,0);
 this.copy(flower2,500,0);
 this.mirrorVertical();
 this.write("collage.jpg");
 
 }
 
 //Exercise 2: MyCollage method
 
  public void myCollage()
  {
      Picture flower1 = new Picture("flower1.jpg");
      flower1.mirrorVertical();
      Picture flower2 = new Picture("flower1.jpg");
      flower2.mirrorHorizontalBotToTop();
      Picture flower3 = new Picture("flower1.jpg");
      flower3.negate();
      this.otherCopy(flower1,0,100, 0, 100);
      this.otherCopy(flower2,100,200,100,300);
      this.otherCopy(flower3,200,350,200,350);
      this.write("mycollage.jpg");
  }

  /** Method to show large changes in color
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0;
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
       if (leftPixel.colorDistance(rightColor) >
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }


  /* Main method for testing - each class in Java can have a main
   * method
   */
  public static void main(String[] args)
  {
    Picture beach = new Picture("artifact.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

} // this } is the end of class Picture, put all new methods before this