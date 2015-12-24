package charlieApp;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;

class SettingsLoader {
  private static final String SETTINGS_FILE_NAME = "/settings.ini";

  String allSettings = "";
  public String getAllSettings() {
    return allSettings;
  }

  public boolean loadSettingsFromResources() {
    allSettings = "";
    InputStreamReader isr = null;
    BufferedReader br = null ;
    try {
      InputStream is = getClass().getResourceAsStream(SETTINGS_FILE_NAME);
      isr = (is!=null) ? new InputStreamReader(is) : null;
      br = (isr!=null) ?  new BufferedReader(isr) : null;

      if (br != null) {
        String currentLine = br.readLine();
        while (currentLine != null) {
  				allSettings += currentLine + "\n";
          currentLine = br.readLine();
  			}
      }

    } catch (IOException e) {
			e.printStackTrace();
    } finally {
    try {
      if (br != null)br.close();
      if (isr != null)isr.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }

    return !(allSettings.isEmpty());
  }
}
