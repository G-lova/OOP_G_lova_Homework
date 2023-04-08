package Seminar6.dip1;

import Seminar6.dip1.model.Report;
import Seminar6.dip1.model.ReportItem;
import Seminar6.dip1.model.util.Printer;
import Seminar6.dip1.model.util.ReportPrinter;
import Seminar6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {

        log.log(Level.INFO, "Стартовал метод main в пакете model");
        Printer<ReportItem> printer = new ReportPrinter();
        Report report = new Report(printer);
        report.calculate();
        report.output();
    }
}
