package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoFileHandler {

	// Create scanner for user input
	private Scanner keyboard = new Scanner(System.in);
	private ObjectOutputStream os;
	private ObjectInputStream is;
	private File file = new File("Assets/videos.bin");

	// An ArrayList called videos - for storing a list of videos
	private ArrayList<Video> videos;

	// Default Constructor
	public VideoFileHandler() {

		videos = new ArrayList<Video>();
	}

	/**
	 * Method that adds a new video object to the ArrayList
	 */
	public void add() {

		// Create a Video object
		Video tmpVideo = new Video();

		// Read its details
		tmpVideo.read();

		// And add it to the videos
		videos.add(tmpVideo);
	}

	/**
	 * Method to return a list of all video objects
	 */
	public void list() {

		// for every Video object in videos
		for (Video tmpVideo : videos)
			// display it
			System.out.println(tmpVideo);
	}

	/**
	 * Method to show selected video
	 */
	public void view() {

		// Read the number of the video to be viewed from the user
		System.out.println("ENTER NUMBER OF VIDEO TO VIEW : ");

		String videoToView = keyboard.nextLine();

		// for every Video object in videos
		for (Video tmpVideo : videos) {
			
			// if it's number equals the number of the Video to View
			if (tmpVideo.getVidNumber().equalsIgnoreCase(videoToView)) {
				
				// display it
				System.out.print(tmpVideo);
				break;
			}
		}
	}

	/**
	 * Method to write full ArrayList out to file. Data can either be written
	 * out to a .bin file or a .txt file
	 */
	public void writeRecordsToFile() {

		// Once the file is created we can write to the file
		try {

			// Serialize the ArrayList
			os = new ObjectOutputStream(new FileOutputStream(file));

			// Write the ArrayList out to the file
			os.writeObject(videos);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			// Close the output stream
			try {
				os.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Method to read the data in from a file we check that we are reading in
	 * the correct type of data
	 */
	@SuppressWarnings("unchecked")
	public void readRecordsFromFile() {

		// If the file exists read from it
		if (file.exists()) {
			
			try {

				// Deserialize the ArrayList
				is = new ObjectInputStream(new FileInputStream(file));

				// We read in the data from the file
				videos = (ArrayList<Video>) is.readObject();

			} catch (Exception e) {

				System.out.println(e.getMessage());
			} finally {

				// Close the input stream
				try {
					is.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {

			// If the file doesn't exists create it
			try {
				file.createNewFile();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
