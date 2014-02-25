
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.net.Socket;

import javax.imageio.ImageIO;


public class ImageHandler implements Runnable{

	
	private boolean Effect1;//the resize option
	private boolean Effect2;//add blur pixel size option
	private boolean Effect3;// convert to grey scale option
	
	private Image aImage;
	
	public ImageHandler(String FilePath){
		aImage=new Image(FilePath);
		//get Effect1,2 and 3 from the GUI
		//read image from the given image
	}
	
	
    public void run(){
    	if(Effect1==true)//if need to resize the image
    	{
    		aImage.ResizeImage(0, 0, 0);
    	}
    	
    	if(Effect2==true)// if need to add blur pixel size
    	{
    		aImage.AddlurPixelSize();
    	}
    	
    	if(Effect3==true)//if need to convert to grey scale
    	{
    		aImage.ConvertToGrayscale();
    	}
    
    }
}
