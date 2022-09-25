import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
   Drink myDrink;
   static File drinkDatabase = new File(System.getProperty("user.dir") + "//BobaJSON.txt");
   static int databaseLength = 0;
   public static void main(String[] args) throws Exception {
      
      Scanner input = new Scanner(drinkDatabase);
   
      while (input.hasNextLine())
      {
         databaseLength++;
         input.nextLine();
      }
      //System.out.println(databaseLength);
      //findBoba("Oolong");
   }
   
   public static ArrayList<String> findBoba(ArrayList<String> keys) throws IOException {
      ArrayList<String> retString = new ArrayList<String>();
      for (int i = 1; i <= databaseLength; i += 4) {
         int hits = 0;
         String line = Files.readAllLines(drinkDatabase.toPath()).get(i);
         for (int j = 0; j < keys.size(); j++) {
            if (line.contains(keys.get(j))) {
               System.out.println(line);
            }
         }
      }
      return retString;
   }
   
   public static String formatBoba(int line) throws IOException{
      String line1 = Files.readAllLines(drinkDatabase.toPath()).get(line);
      String line2 = Files.readAllLines(drinkDatabase.toPath()).get(line + 1);
      
   }
}
