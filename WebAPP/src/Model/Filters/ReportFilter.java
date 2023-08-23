package Model.Filters;

/**
 * Фильтр. описыват поля, которые могут быть использованы для формирования отчета
 */
public class ReportFilter {
    boolean group;
    boolean produser;
    boolean prodact;
    boolean customer;
    boolean startPeriod;
    boolean stopPeriod;

    public ReportFilter(boolean group, boolean produser, boolean prodact, boolean customer, boolean startPeriod, boolean stopPeriod) {
        this.group = group;
        this.produser = produser;
        this.prodact = prodact;
        this.customer = customer;
        this.startPeriod = startPeriod;
        this.stopPeriod = stopPeriod;
    }

    public boolean isGroup() {
        return group;
    }

    public boolean isProduser() {
        return produser;
    }

    public boolean isProdact() {
        return prodact;
    }

    public boolean isCustomer() {
        return customer;
    }

    public boolean isStartPeriod() {
        return startPeriod;
    }

    public boolean isStopPeriod() {
        return stopPeriod;
    }
}
