package com.xiaoM.Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ResourceCDN;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.xiaoM.Main.MainTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static String date = dateFormat.format(new Date());
    private static final String FILE_NAME = "testCase/" + MainTest.TestCase + "/test-result/TestReport_" + date + ".html";

    public static ExtentReports createHtmlReportInstance() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(FILE_NAME);
        htmlReporter.config().setDocumentTitle("自动化测试报告 -- designed by xiaoM");//html标题
        htmlReporter.config().setReportName(MainTest.TestCase + " 测试报告");
        htmlReporter.config().setTheme(Theme.STANDARD);//主题：黑/白
        htmlReporter.config().setEncoding("gb2312");//gb2312
        htmlReporter.config().setChartVisibilityOnOpen(false);
        htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
        htmlReporter.config().setTimeStampFormat("yyyy-MM-dd HH:mm:ss");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setReportUsesManualConfiguration(true);
        return extent;
    }
}
