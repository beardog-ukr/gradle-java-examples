package deltaApp;

import java.io.InputStreamReader;
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

class MainApp {

  public static void main(String[] args) {
    System.out.println("main: application started"); //

    SettingsLoader sl = new SettingsLoader();
    if (sl.loadSettingsFromResources()) {
      System.out.println("main: Got Settings:"); //
      System.out.println(sl.getAllSettings()); //
    }
    else {
      System.out.println("main: Failed to read settings"); //
    }

    System.out.println("main: application finished"); //
  }
}
