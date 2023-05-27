package solid;

import solid.dip.DisplayReport;
import solid.dip.PrintReport;
import solid.dip.Report;
import solid.dip.ReportAble;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        report.output(new DisplayReport());
    }
}
