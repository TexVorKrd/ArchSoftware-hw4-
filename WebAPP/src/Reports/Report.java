package Reports;

import Model.Filters.ReportFilterMask;
import Repository.Repository;
import Repository.RepositoryServises;

/**
 * Отчет.
 * Логика сбора данных реализуется через имплементируемый интерфейс
 * IReportCreater, который на выходе должен возвращать JSON в виде строки
 * К отчету прикрепляется маска фильтра для полей через ReportFilter
 */
public abstract class Report implements IReportCreater{
    ReportFilterMask filter;
    Repository repository;
    RepositoryServises servises;


    public Report(Repository repository, RepositoryServises servises) {
        this.filter =  servises.getFilterMask(this);
        this.repository=repository;
        this.servises=servises;
    }

}
