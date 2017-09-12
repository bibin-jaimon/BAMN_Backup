package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.Provider.Service;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController implements Initializable {
	@FXML
	private Button btn1file;
	@FXML
	private Button btn2file;
	@FXML
	private Button btn3file;
	@FXML
	private Button btn4file;
	@FXML
	private Button btn5file;
	@FXML
	private Button btn6file;
	@FXML
	private Button btn7file;
	@FXML
	private Button btn8file;
	@FXML
	private Button btn9file;
	@FXML
	private Button btn1fold;
	@FXML
	private Button btn2fold;
	@FXML
	private Button btn3fold;
	@FXML
	private Button btn4fold;
	@FXML
	private Button btn5fold;
	@FXML
	private Button btn6fold;
	@FXML
	private Button btn7fold;
	@FXML
	private Button btn8fold;
	@FXML
	private Button btn9fold;
	@FXML
	private Button destfold;
	@FXML
	private Button copy;
	@FXML
	private Button reset;

	@FXML
	private ListView<String> listview1;
	@FXML
	private ListView<String> listview2;
	@FXML
	private ListView<String> listview3;
	@FXML
	private ListView<String> listview4;
	@FXML
	private ListView<String> listview5;
	@FXML
	private ListView<String> listview6;
	@FXML
	private ListView<String> listview7;
	@FXML
	private ListView<String> listview8;
	@FXML
	private ListView<String> listview9;
	@FXML
	private ListView<String> destinationview;
	@FXML
	private ListView<String> status;
	@FXML
	public ProgressBar pb;

	private String path1;
	private String path2;
	private String path3;
	private String path4;
	private String path5;
	private String path6;
	private String path7;
	private String path8;
	private String path9;
	private String dest;
	private String name1, name2, name3, name4, name5, name6, name7, name8, name9;
	private String dest1, dest2, dest3, dest4, dest5, dest6, dest7, dest8, dest9;
	private int count = 0, temp;
	private double progress;
	private File selectDest = null;

	public void Button1FileAction(ActionEvent event) throws IOException

	{
		if (count == 0) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path1 = selectedFile.getAbsolutePath();
				path1 = path1.replace("\\", "\\\\");
				name1 = selectedFile.getName();
				listview1.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}

	}

	public void Button1FolderAction(ActionEvent event) throws IOException {
		if (count == 0) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path1 = selectedDir.getAbsolutePath();
				path1 = path1.replace("\\", "\\\\");
				name1 = selectedDir.getName();
				listview1.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not Selected");
		}
	}

	public void Button2FileAction(ActionEvent event) throws IOException {
		if (count == 1) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path2 = selectedFile.getAbsolutePath();
				path2 = path2.replace("\\", "\\\\");
				name2 = selectedFile.getName();
				listview2.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not Selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button2FolderAction(ActionEvent event) throws IOException {
		if (count == 1) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path2 = selectedDir.getAbsolutePath();

				path2 = path2.replace("\\", "\\\\");
				name2 = selectedDir.getName();
				listview2.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button3FileAction(ActionEvent event) throws IOException {
		if (count == 2) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path3 = selectedFile.getAbsolutePath();
				path3 = path3.replace("\\", "\\\\");
				name3 = selectedFile.getName();
				listview3.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button3FolderAction(ActionEvent event) throws IOException {
		if (count == 2) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path3 = selectedDir.getAbsolutePath();
				path3 = path3.replace("\\", "\\\\");
				name3 = selectedDir.getName();
				listview3.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button4FileAction(ActionEvent event) throws IOException {
		if (count == 3) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				path4 = selectedFile.getAbsolutePath();
				path4 = path4.replace("\\", "\\\\");
				name4 = selectedFile.getName();
				listview4.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		}
	}

	public void Button4FolderAction(ActionEvent event) throws IOException {
		if (count == 3) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path4 = selectedDir.getAbsolutePath();
				path4 = path4.replace("\\", "\\\\");
				name4 = selectedDir.getName();
				listview4.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}

		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button5FileAction(ActionEvent event) throws IOException {
		if (count == 6) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path5 = selectedFile.getAbsolutePath();
				path5 = path5.replace("\\", "\\\\");
				name5 = selectedFile.getName();
				listview5.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}

	}

	public void Button5FolderAction(ActionEvent event) throws IOException {
		if (count == 4) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path5 = selectedDir.getAbsolutePath();
				path5 = path5.replace("\\", "\\\\");
				name5 = selectedDir.getName();
				listview5.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button6FileAction(ActionEvent event) throws IOException {
		if (count == 5) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path6 = selectedFile.getAbsolutePath();
				path6 = path6.replace("\\", "\\\\");
				name6 = selectedFile.getName();
				listview6.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}

	}

	public void Button6FolderAction(ActionEvent event) throws IOException {
		if (count == 5) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path6 = selectedDir.getAbsolutePath();
				path6 = path6.replace("\\", "\\\\");
				name6 = selectedDir.getName();
				listview6.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button7FileAction(ActionEvent event) throws IOException {
		if (count == 6) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path7 = selectedFile.getAbsolutePath();
				path7 = path7.replace("\\", "\\\\");
				name7 = selectedFile.getName();
				listview7.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button7FolderAction(ActionEvent event) throws IOException {
		if (count == 6) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path7 = selectedDir.getAbsolutePath();
				path7 = path7.replace("\\", "\\\\");
				name7 = selectedDir.getName();
				listview7.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button8FileAction(ActionEvent event) throws IOException {
		if (count == 7) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path8 = selectedFile.getAbsolutePath();
				path8 = path8.replace("\\", "\\\\");
				name8 = selectedFile.getName();
				listview8.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button8FolderAction(ActionEvent event) throws IOException {
		if (count == 7) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {
				count = count + 1;
				path8 = selectedDir.getAbsolutePath();
				path8 = path8.replace("\\", "\\\\");
				name8 = selectedDir.getName();
				listview8.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void Button9FileAction(ActionEvent event) throws IOException {
		if (count == 8) {
			FileChooser fc = new FileChooser();
			fc.setInitialDirectory(new File("C:\\"));
			File selectedFile = fc.showOpenDialog(null);
			if (selectedFile != null) {
				count = count + 1;
				path9 = selectedFile.getAbsolutePath();
				path9 = path9.replace("\\", "\\\\");
				name9 = selectedFile.getName();
				listview9.getItems().add(selectedFile.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}

	}

	public void Button9FolderAction(ActionEvent event) throws IOException {
		if (count == 8) {
			DirectoryChooser directoryChooser = new DirectoryChooser();
			File selectedDir = directoryChooser.showDialog(null);
			if (selectedDir != null) {

				count = count + 1;
				path9 = selectedDir.getAbsolutePath();
				path9 = path9.replace("\\", "\\\\");
				name9 = selectedDir.getName();
				listview9.getItems().add(selectedDir.getAbsolutePath());

			} else {
				System.out.println("File not selected");
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select the sources in the ascending order!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void ButtonDestination(ActionEvent event) throws IOException {
		DirectoryChooser directoryChooser = new DirectoryChooser();
		File selectedDest = directoryChooser.showDialog(null);
		if (selectedDest != null) {

			dest = selectedDest.getAbsolutePath();
			dest = dest.replace("\\", "\\\\");
			destinationview.getItems().add(selectedDest.getAbsolutePath());

		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please Select a destination!");

			alert.showAndWait();
			System.out.println("File not selected");
		}
	}

	public void ButtonReset(ActionEvent event) {
		System.out.println("Reset");
		count = 0;
		temp = 1;
		progress = 0;
		listview1.getItems().clear();
		listview2.getItems().clear();
		listview3.getItems().clear();
		listview4.getItems().clear();
		listview5.getItems().clear();
		listview6.getItems().clear();
		listview7.getItems().clear();
		listview8.getItems().clear();
		listview9.getItems().clear();
		destinationview.getItems().clear();
		pb.setProgress(0.0);
	}

	public void copyAllFiles(ActionEvent event) throws IOException{
		
		
		if (count == 0) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please Select a file or directory!");

			alert.showAndWait();
			System.out.println("File or diectory not selected");
		} else if (selectDest == null) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Please, Select a destination!");

			alert.showAndWait();
			System.out.println("Destination not selected");
		} else {
			temp = 1;
			progress = 0;
			File sourceFolder;
			File destinationFolder;
			if (temp <= count) {
				// 1
				sourceFolder = new File(path1);
				dest1 = dest + "\\\\" + name1;
				destinationFolder = new File(dest1);
				progress = 1.0 / (float) count;
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 2
				sourceFolder = new File(path2);
				dest2 = dest + "\\\\" + name2;
				destinationFolder = new File(dest2);
				System.out.println(count);
				progress = progress + (1.0 / (float) count);
				System.out.println(progress);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 3
				sourceFolder = new File(path3);
				dest3 = dest + "\\\\" + name3;
				destinationFolder = new File(dest3);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 4
				sourceFolder = new File(path4);
				dest4 = dest + "\\\\" + name4;
				destinationFolder = new File(dest4);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 5
				sourceFolder = new File(path5);
				dest5 = dest + "\\\\" + name5;
				destinationFolder = new File(dest5);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 6
				sourceFolder = new File(path6);
				dest6 = dest + "\\\\" + name6;
				destinationFolder = new File(dest6);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {

				// 7
				sourceFolder = new File(path7);
				dest7 = dest + "\\\\" + name7;
				destinationFolder = new File(dest7);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 8
				sourceFolder = new File(path8);
				dest8 = dest + "\\\\" + name8;
				destinationFolder = new File(dest8);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
			if (temp <= count) {
				// 9
				sourceFolder = new File(path9);
				dest9 = dest + "\\\\" + name9;
				destinationFolder = new File(dest9);
				progress = progress + (1.0 / (float) count);
				copyFolder(sourceFolder, destinationFolder, status, pb, progress);
				temp++;
			}
		}
	}

	public static void startTask(File destinationFolder, ListView status) {
		// Create a Runnable
		Runnable task = new Runnable() {
			public void run() {
				runTask(destinationFolder, status);
			}
		};

		// Run the task in a background thread
		Thread backgroundThread = new Thread(task);
		// Terminate the running thread if the application exits
		backgroundThread.setDaemon(true);
		// Start the thread
		backgroundThread.start();
	}

	public static void runTask(File destinationFolder, ListView status) {
		try {
			status.getItems().add(destinationFolder.toPath());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void copyFolder(File sourceFolder, File destinationFolder, ListView status, ProgressBar pb,
			double progress) throws IOException {
		// Check if sourceFolder is a directory or file
		// If sourceFolder is file; then copy the file directly to new location
		// pb.setProgress(progress);

		if (sourceFolder.isDirectory()) {

			// Verify if destinationFolder is already present; If not then
			// create it
			if (!destinationFolder.exists()) {

				destinationFolder.mkdir();
				System.out.println("Directory created :: " + destinationFolder);
			}

			// Get all files from source directory
			String files[] = sourceFolder.list();

			// Iterate over all files and copy them to destinationFolder one by
			// one
			for (String file : files) {
				File srcFile = new File(sourceFolder, file);
				File destFile = new File(destinationFolder, file);

				// Recursive function call
				copyFolder(srcFile, destFile, status, pb, progress);
			}
		} else {

			// setProgress(destinationFolder,status);
			// Copy the file content from one place to another
			Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
			pb.setProgress(progress);
			startTask(destinationFolder, status);
			System.out.println("File Copied ::" + destinationFolder);
			// status.getItems().add(destinationFolder.toPath());
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}