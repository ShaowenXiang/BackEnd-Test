 class Main {

	
	public static void main(String[] args) {
		int Num_Image=0;
		//detect how many images need to be manipulated at once
		
		String [] ImageFilePath=new String[Num_Image];
		//get image file path
		
		for(int i=0;i<Num_Image;i++){//Create multiple threads to handle multiple image once
			Runnable imageHandler = new ImageHandler(ImageFilePath[i]);
			new Thread(imageHandler).start();
		}
	   
	}

}

