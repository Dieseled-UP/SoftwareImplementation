package tests;

import main.VideoFileHandler;

public class VideoTester {

	public static void main(String[] args) {

		VideoFileHandler videoFileHandler = new VideoFileHandler();

		// Read videos from the file
		videoFileHandler.readRecordsFromFile();

		// List the records in the ArrayList
		videoFileHandler.list();

		// Add a new video object
		videoFileHandler.add();

		// Write the ArrayList to the File
		videoFileHandler.writeRecordsToFile();

		// Read videos from the file
		videoFileHandler.readRecordsFromFile();

		// List the records in the ArrayList
		videoFileHandler.list();

		// View a selected video
		videoFileHandler.view();
	}

}
