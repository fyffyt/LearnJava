package com.practise.opencv2;

import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;

class PractiseCV2 {

	static{ System.loadLibrary("opencv_java249"); }
	
//	static{ System.loadLibrary("opencv_highgui"); }
//	static{ System.loadLibrary("opencv_core"); }

	public static void main(String[] args) {
	    Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
	    System.out.println("OpenCV Mat: " + m);
	    Mat mr1 = m.row(1);
	    mr1.setTo(new Scalar(1));
	    Mat mc5 = m.col(5);
	    mc5.setTo(new Scalar(5));
	    System.out.println("OpenCV Mat data:\n" + m.dump());
	    
/******get Mat frame from video file, store in jpg files*******/
//	    VideoCapture video = new VideoCapture("/home/percolata/ftp/videodump/lot-peds/bright_8200017_es-2015-07-07-17-45-03_1_89820.3gp");
//	    int vHeight = (int)(video.get(Highgui.CV_CAP_PROP_FRAME_HEIGHT));
//	    int vWidth = (int)(video.get(Highgui.CV_CAP_PROP_FRAME_WIDTH));
//	    System.out.println("height: " + vHeight + "\nwidth: " + vWidth);
//	    Mat frame = new Mat(vHeight,vWidth,CvType.CV_8UC1, new Scalar(0));
//	    
//	    int count = 0;
//	    
//	    while(video.read(frame)){
//	    	 Highgui.imwrite("./imageDump/test"+count+".jpg",frame);
//	    	 count ++;
//	    }
	    
	    Mat image = Highgui.imread("./imageDump/test0.jpg");
	    System.out.println("height: " + image.height() + "\nwidth: " + image.width());
	    System.out.println("\nchannels: " + image.channels());
	    
	    		
	   
	    
	    
	    
	}

}