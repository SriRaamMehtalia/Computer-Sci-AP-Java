public class sd {

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

}
