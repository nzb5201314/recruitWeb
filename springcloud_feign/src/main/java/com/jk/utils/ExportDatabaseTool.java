/**
 * Copyright (C), 2019
 * FileName: ExportDatabaseTool
 * Author:   nzb
 * Date:     2019/5/15 20:11
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.utils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈导出指定数据库所有的表,并生成.sql文件〉〈〉
 *
 * @author nzb
 * @create 2019/5/15
 * @since 1.0.0
 */
public class ExportDatabaseTool {

    public static boolean exportDatabaseTool(String hostIP, String userName, String password, String savePath, String databaseName) throws InterruptedException {
        File saveFile = new File(savePath);
        if (!saveFile.exists()) {// 如果目录不存在
            saveFile.mkdirs();// 创建文件夹
        }
        if(!savePath.endsWith(File.separator)){
            savePath = savePath + File.separator;
        }

        /**
         * 生成文件名称
         */
        Date t = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String fileName = df.format(t)+"-"+t.getTime()+".sql";
        //System.out.println(fileName);
        /**
         * 生成文件名称
         */

        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(savePath + fileName), "utf8"));
            Process process = Runtime.getRuntime().exec(" mysqldump -h" + hostIP + " -u" + userName + " -p" + password + " --set-charset=UTF8 " + databaseName);
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream(), "utf8");
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while((line = bufferedReader.readLine())!= null){
                printWriter.println(line);
            }
            printWriter.flush();
            if(process.waitFor() == 0){//0 表示线程正常终止。
                return true;
            }
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
