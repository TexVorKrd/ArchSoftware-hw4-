package BeerFactory.Services.ReportSystem;

import BeerFactory.Data.Repository.SensorDateRep;
import BeerFactory.Views.AnaliticSystem.IShowReport;

import java.util.List;

/**
 * Системма формировани отчетов
 */
public abstract class ReportSystem implements IShowReport {
    List<Report> reports;
    SensorDateRep repository;
}
