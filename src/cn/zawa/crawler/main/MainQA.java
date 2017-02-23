package cn.zawa.crawler.main;

import cn.zawa.crawler.ectractor.extractorlink_huize;
import cn.zawa.crawler.ectractor.extractorpage_huize;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MainQA {
  
  public static void main(String[] args) throws IOException {
    //获取链接
    List<String> list = extractorlink_huize.getAllUrl();
    for (String str : list) {
      System.out.println(str);
    }
    
    //创建Excel
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFSheet sheet = workbook.createSheet("QA");
    //row1
    HSSFRow row0 = sheet.createRow(0);
    row0.createCell(0).setCellValue("问题");
    row0.createCell(1).setCellValue("答案");
    //sheet.setColumnWidth(0, 20000);
    //sheet.setColumnWidth(1, 40000);
    
    //获取QA内容
    Map<String, String> questionAndAnswer = extractorpage_huize.getQuesAns(list);
    for (Map.Entry<String, String> entry : questionAndAnswer.entrySet()) {
      //System.out.println(entry.getKey()+"----"+entry.getValue());
      
      //获取当前sheet的最后一行
      int lastRowNum = sheet.getLastRowNum();
      System.out.println("rowNum = " + lastRowNum);
      HSSFRow newRow = sheet.createRow(lastRowNum + 1);
      newRow.createCell(0).setCellValue(entry.getKey());
      newRow.createCell(1).setCellValue(entry.getValue());
    }
    
    //写入磁盘
    FileOutputStream fos = new FileOutputStream("F:\\QA.xls");
    workbook.write(fos);
    fos.close();
  }
  
}
