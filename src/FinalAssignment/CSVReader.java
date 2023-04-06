package FinalAssignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class CSVReader {
        private String csvFile = "C:/Users/ajou/Desktop/bookList.csv"; // 불러올 CSV 파일의 경로
        private String line = "";
        private String csvSplitBy = ",";
        private ArrayList<String[]> dataRows = new ArrayList<String[]>();
        
        
        public ArrayList<String[]> getDataRows() {
            return dataRows;
        }

        public void setDataRows(ArrayList<String[]> dataRows) {
            this.dataRows = dataRows;
        }

        private String[] headers = null;
        
        public CSVReader() {
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "UTF-8"))) {
            headers = br.readLine().split(csvSplitBy);

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                dataRows.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 헤더 정보 출력
        for (int i = 0; i < headers.length; i++) {
            System.out.print("[" + i + "]"+ headers[i]  + "\t");
        }

//         데이터 출력
//        for (String[] dataRow : dataRows) {
//            for (String data : dataRow) {
//                System.out.print(data + "\t");
//            }
//            System.out.println();
//            
        }
//        System.out.println(dataRows[3]);
    }

