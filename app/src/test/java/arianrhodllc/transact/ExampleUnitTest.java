package arianrhodllc.transact;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */


public class ExampleUnitTest {

    private String assetsPath = "src/main/assets/";

    private void setup() {
   }//setup()

    @Test
    public void testAssetsDirectoryAccess() throws java.io.IOException {
        InputStream inStream = null;
        BufferedReader reader = null;
        try {
            inStream = new FileInputStream(new File(this.assetsPath + "Test.txt"));
            reader = new BufferedReader(new InputStreamReader(inStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String line2 = line;
            }
            assertTrue(true);
        }//try
        catch (Exception ex) {
            assertTrue(false);
        }
        finally {
            if (reader != null)
                reader.close();
            if (inStream != null)
                inStream.close();
        }//finally
    }//testAssetsDirectoryAccess()


}