import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Image {

	BufferedImage image;
	int image_width;
	int image_height;
	
	public Image(String ImageFilePath){
		try{
		image=ImageIO.read(new File(ImageFilePath));
		image_width=image.getWidth();
		image_height=image.getHeight();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	};
	
	
	
	public BufferedImage ResizeImage(int IMG_WIDTH,int IMG_HEIGHT, int type){
		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(image, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();
	 
		return resizedImage;
	    }
	
	
	public void AddlurPixelSize(){
		
		
	}
	
	public BufferedImage ConvertToGrayscale(){
		BufferedImage covertedimage = null;
		
		return covertedimage;
	    }
	
	
}
